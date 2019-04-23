<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-8">
            <div id="demo" class="carousel slide" data-ride="carousel">

                <ul class="carousel-indicators">
                    <li data-target="#demo" data-slide-to="0" class="active"></li>
                    <li data-target="#demo" data-slide-to="1"></li>
                    <li data-target="#demo" data-slide-to="2"></li>
                    <li data-target="#demo" data-slide-to="3"></li>
                </ul>

                <div class="carousel-inner">
                    <c:url var="img" value="resources/img/slide-3.png"></c:url>
                    <div class="carousel-item active">
                        <img src="${ img }" alt="Los Angeles">
                    </div>
                    <c:url var="img" value="resources/img/slide-2.png"></c:url>

                    <div class="carousel-item">
                        <img src="${ img }" alt="Chicago">
                    </div>
                    <c:url var="img" value="resources/img/slide-1.png"></c:url>
                    <div class="carousel-item">
                        <img src="${ img }" alt="New York">
                    </div>
                    <c:url var="img" value="resources/img/slide-4.png"></c:url>
                    <div class="carousel-item">
                        <img src="${ img }" alt="New York">
                    </div>
                </div>

                <a class="carousel-control-prev" href="#demo" data-slide="prev">
                    <span class="carousel-control-prev-icon"></span>
                </a> <a class="carousel-control-next" href="#demo" data-slide="next">
                <span class="carousel-control-next-icon"></span>
            </a>

            </div>

            <!-- sản phẩm -->
            <section id="san-pham-noi-bat">
                <h2 class="title">Sản phẩm nổi bật</h2>
                <div class="row">
                    <c:forEach var="product" items="${listProductHightLight}">
                        <div class="col-md-4">
                            <div class="item text-center">
                                <a href=""><img src="${ product.getImage() }" width="270px" height="150px"
                                                alt="ảnh điện thoại"></a>
                                <p class="ten-san-pham">
                                    <b><a href="">${ product.getName() }</a></b>
                                </p>
                                <p>
                                    Giá: <span class="price">${ product.getPrice() }</span>
                                </p>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </section>
            <section id="san-pham-moi">
                <h2 class="title">Sản phẩm mới</h2>
                <div class="row">
                    <c:forEach var="product" items="${ listProductNew }">
                        <div class="col-md-4">
                            <div class="item text-center">
                                <a href=""><img src="${ product.getImage() }" alt="ảnh điện thoại"></a>
                                <p class="ten-san-pham">
                                    <b><a href="">${ product.getName() }</a></b>
                                </p>
                                <p>
                                    Giá: <span class="price">${ product.getPrice() }</span>
                                </p>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </section>

        </div>

        <aside id="side-banner" class="col-md-4">
            <img src="img/aside-6.png" alt=""> <img src="img/aside-5.png"
                                                    alt=""> <img src="img/aside-4.png" alt=""> <img
                src="img/aside-3.png" alt=""> <img src="img/aside-2.png"
                                                   alt=""> <img src="img/aside-1.png" alt="">
        </aside>
    </div>
</div>
</body>
</html>