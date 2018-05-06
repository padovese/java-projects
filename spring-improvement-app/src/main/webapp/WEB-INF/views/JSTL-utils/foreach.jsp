<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

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
			<th>Tamanho do livro IF</th>
			<th>Tamanho do livro choose</th>
			<th>Preço</th>
		</tr>
		<c:forEach var="p" items="${produtos }" varStatus="st">
			<tr id="produto${p.id }">
				<td>Linha ${st.count }</td>
				<td>${p.id }</td>
				<td>${p.titulo.toUpperCase() }</td>
				<td>${p.descricao }</td>
				<!-- Converte LocalDate pra date e permite usar máscara de data -->
				<fmt:parseDate value="${p.dataLancamento }" pattern="yyyy-MM-dd" 
                          var="parsedDate" type="date" />
				<td><fmt:formatDate value="${parsedDate }" pattern="EEEE, dd 'de' MMMM 'de' yyyy" /></td>
				<td><c:if test="${p.paginas > 50 }">Livro grande</c:if></td>
				<td><c:choose>
						<c:when test="${p.paginas > 50 }">Livro grande</c:when>
						<c:otherwise>Livro pequeno</c:otherwise>
					</c:choose></td>
					<td><fmt:formatNumber value="${st.count *3.14}" type="currency" /></td>
					<fmt:setLocale value="Brazil"/>
			</tr>
		</c:forEach>
	</table>

	<!-- Constroi links corretamente, usa rota do controller -->
	<a href="<c:url value="/spring-improvement-app/" />">Home</a>
	
	<!-- Seta variável através de JSTL na JSP atual -->
	<c:set var="nome" value="João da Silva" />
	<c:out value="${nome}" />
</body>
</html>