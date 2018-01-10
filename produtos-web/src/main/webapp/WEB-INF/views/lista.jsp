<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:out value="jstl text" />

Is 1 greater than 2 using cout  :<c:out value="${1>2}"/>

Is 1 greater than 2 without using cout: ${1>2}

	<table>
		<tr>
			<th>Código</th>
			<th>Nome</th>
			<th>Valor</th>
			<th>Descricao</th>
		</tr>

		<c:forEach items="${todosProdutos}" var="produto">
			<tr>
				<td>${produto.id}</td>
				<td>${produto.name}</td>
				<td>${produto.price}</td>
				<td>${produto.category}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>