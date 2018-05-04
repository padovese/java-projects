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
		<tr>
			<th>Contador</th>
			<th>ID</th>
			<th>titulo</th>
			<th>descricao</th>
			<th>Data de lançamento</th>
			<th>Tamanho do livro</th>
		</tr>
		<c:forEach var="p" items="${produtos }" varStatus="st">
			<tr id="produto${p.id }">
				<td>Linha ${st.count }</td>
				<td>id: ${p.id }</td>
				<td>titulo: ${p.titulo }</td>
				<td>descricao: ${p.descricao }</td>
				<td>data de lançamento: ${p.dataLancamento }</td>
				<td><c:if test="${p.paginas > 50 }">Livro grande</c:if></td>
				<td><c:choose>
						<c:when test="${p.paginas > 50 }">Livro grande</c:when>
						<c:otherwise>Livro pequeno</c:otherwise>
					</c:choose></td>
			</tr>
		</c:forEach>
	</table>

	<a href="<c:url value="/spring-improvement-app/" />">Home</a>
	
	<!-- Seta variável através de JSTL na JSP atual -->
	<c:set var="nome" value="João da Silva" />
	<c:out value="${nome}" />
</body>
</html>