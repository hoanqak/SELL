<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HoangHuy
  Date: 4/23/2019
  Time: 9:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Info </title>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <c:url var="style" value="resources/css/style.css"></c:url>
    <c:url var="bootstrap" value="resources/css/bootstrap.css"></c:url>
    <link rel="stylesheet" href="${ bootstrap }">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css"
          integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
    <link rel="stylesheet" href="${ style }">
    <c:url var="jquery" value="resources/js/jquery-3.3.1.js"></c:url>
    <script src="${ jquery }"></script>
    <c:url var="bootstrap" value="resources/js/bootstrap.js"></c:url>
    <script src="${ bootstrap }"></script>
</head>
<body>
<div class="container">

    <nav aria-label="breadcrumb">
        <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="#">Trang chủ</a></li>
            <li class="breadcrumb-item"><a
                    href="/SellPhoneProject_war/${ product.getCategory().getCategory().toLowerCase()}">${ product.getCategory().getCategory()}</a>
            </li>
            <li class="breadcrumb-item active" aria-current="page">${ product.getName()}</li>
        </ol>
    </nav>

    <h3 class="title"><span>${ product.getName()}</span> <span class="share-button"><i class="fas fa-share"></i></span>
    </h3>
    <div class="row show-info">

        <div class="col-sm-4">
            <div class="img-thumbnail main-img"><img
                    src="${ product.getImage()}"
                    width="100%" height="100%">
            </div>

            <!-- Slide -->
            <c:if test="${ product.getListImage().size() > 0}">
                <div id="carouselExampleControls" class="carousel slide mt-4" data-ride="carousel">
                    <div class="carousel-inner">
                        <c:set var="i" value="1"/>
                        <c:forEach var="img" items="${product.getListImage()}">
                            <c:choose>
                                <c:when test="${ i == 1}">
                                    <div class="carousel-item active">
                                        <img class="d-block w-100" src="${ img.getImage()  }">
                                    </div>
                                    <c:set var="i" value="0"/>
                                </c:when>
                                <c:otherwise>
                                    <div class="carousel-item">
                                        <img class="d-block w-100" src="${ img.getImage()  }">
                                    </div>
                                </c:otherwise>
                            </c:choose>
                        </c:forEach>
                    </div>
                    <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
                        <span class="fas fa-chevron-left next-prev" aria-hidden="true"></span>
                        <span class="sr-only">Previous</span>
                    </a>
                    <a class="carousel-control-next " href="#carouselExampleControls" role="button" data-slide="next">
                        <span class="fas fa-chevron-right next-prev" aria-hidden="true"></span>
                        <span class="sr-only">Next</span>
                    </a>
                </div>
            </c:if>
        </div>

        <div class="col-sm-4">
            <c:choose>
                <c:when test="${ product.getDiscount() > 0}">
                    <c:set var="discount" value="${product.getPrice() - product.getDiscount()}"/>
                    <h6>
                        <label>Giá: </label> <span class="price"> ${discount}</span> <br>
                        <label>Giá niêm yết:</label><span class="discount"> ${product.getPrice()} </span>
                    </h6>
                </c:when>
                <c:otherwise>
                    <h6>
                        <label>Giá: </label> <span class="price"> ${product.getPrice()}</span>
                    </h6>
                </c:otherwise>
            </c:choose>
            <label>Mô tả: </label><span> ${ product.getDescription()}</span>
            <button class="btn btn-outline-primary buynow">Mua ngay</button>
        </div>

        <div class="col-sm-4">
            <table class="table">
                <tr class="table-dark">
                    <th scope="col">Thông số kỹ thuật</th>
                </tr>
                <tr>
                    <td scope="row">RAM: ${ product.getRam()}</td>
                </tr>
                <tr>
                    <td scope="row">Bộ nhớ trong: ${ product.getMemory()}</td>
                </tr>
                <tr>
                    <td scope="row">Chip: ${ product.getChip()}</td>
                </tr>
                <tr>
                    <td scope="row">Camera: ${ product.getCamera()}</td>
                </tr>
            </table>
        </div>
    </div>
    <div class="row show-info">
        <div class="col-sm-8">
            <h4>Điện thoại Samsung Galaxy S9 Plus 64GB - Smartphone thiết kế sang trọng và nhiều nâng cấp vượt trội</h4>
            <p class="info-main">Điện thoại Samsung Galaxy S9 Plus 64GB - Smartphone thiết kế sang trọng và nhiều nâng
                cấp vượt trội
                Sam Fan đã được diện kiến Samsung Galaxy S9 Plus vào tháng 2/2018 và gây ấn tượng mạnh mẽ. Thiết kế lẫn
                hiệu năng của S9 Plus đã chứng tỏ đây xứng đáng là một trong những smartphone siêu phẩm trên thế giới.

                Thiết kế màn hình tràn viền hiện đại và tinh tế
                Samsung trang bị cho Galaxy S9 Plus màn hình vô cực đúng với xu hướng smartphone hiện nay, tỉ lệ 18:5:9
                kích thước 6.2 inch - tương đương với S8. Cùng với đó là tấm nền Super AMOLED đặc trưng của Samsung kèm
                độ phân giải QuadHD+ và công nghệ HDR 10, tổng thể cho người dùng trải nghiệm thị giác rất thú vị kể cả
                xem phim hay chơi các game đồ họa với chất ảnh rực rỡ, hình ảnh sắc nét, độ tương phản có chiều sâu.</p>

        </div>
    </div>
</div>
</body>
</html>
