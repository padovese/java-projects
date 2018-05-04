<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<c:forEach var="p" items="${produtos }">
	<tr id="produto${p.id }">
		<td>id: ${p.id }</td>
		<td>titulo: ${p.titulo }</td>
		<td>descricao: ${p.descricao }</td>
		<td>data de lançamento: ${p.dataLancamento }</td>
	</tr>
</c:forEach>
</table>
</body>
</html>