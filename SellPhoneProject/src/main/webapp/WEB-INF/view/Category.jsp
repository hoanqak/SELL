<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<section id="san-pham-moi">
		<h2 class="title">Sản phẩm của ${ category }</h2>
		<div class="row">
			<c:forEach var="product" items="${ product }">
				<div class="col-md-4">
					<div class="item text-center">
						<a
							href="${ product.getCategory().getCategory() }/${ product.getId() }"><img
							src="${ product.getImage() }" width="270px" height="150px"
							alt="ảnh điện thoại"></a>
						<p class="ten-san-pham">
							<b><a
								href="${ product.getCategory().getCategory() }/${ product.getId() }">${ product.getName() }</a></b>
						</p>
						<p>
							Giá: <span class="price">${ product.getPrice() }</span>
						</p>
					</div>
				</div>
			</c:forEach>
		</div>
	</section>
	<c:if test="${ page > 1 }">
		<c:forEach var="page" begin="1" end="${ page }">
			<a href="${ type }-page-${ page }">Page ${ page }</a>
		</c:forEach>
	</c:if>
	
	<%-- <div class="container">
    <section id="san-pham-moi">
        <h2 class="title">Sản phẩm ${ category }</h2>
        <div class="row">
            <c:forEach var="product" items="${ product }">
                <div class="col-md-4">
                    <div class="item text-center">
                        <a href="${category}/${ product.getCode()}-${ product.id}"><img src="${ product.getImage() }" width="270px" height="150px"
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

</div> --%>
</body>
</html>