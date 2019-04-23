<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<section id="san-pham-moi">
		<h2 class="title">${ notResult }</h2>
		<h2 class="title">${ result }</h2>
		<div class="row">
			<c:forEach var="product" items="${ result }">
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
</body>
</html>