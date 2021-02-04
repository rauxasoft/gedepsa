<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<%@ include file="head.jsp" %>
<body>
	<%@ include file="cabecera.jsp" %>
	<h2>Listado de productos</h2>
	<table>
		<tr>
			<th>Código</th>
			<th>Nombre</th>
			<th>Precio</th>
			<th>Familia</th>
			<th>Fecha de Alta</th>
			<th>Descatalogado</th>
		</tr>
  		<c:forEach var="producto" items="${productos}">
		<tr>
			<td>${producto.id}</td>
			<td>${producto.nombre}</td>
			<td style="text-align: right;">
				<fmt:formatNumber type="number" maxFractionDigits="2" minFractionDigits="2" value="${producto.precio}" /> €
			</td>
			<td>${producto.familia}</td>
			<td><fmt:formatDate pattern="dd/MM/yyyy" value="${producto.fechaAlta}" /></td>
			<td>
				<c:if test="${producto.descatalogado}">
				<span style="color:red;">descatalogado</span>
				</c:if>
			</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>