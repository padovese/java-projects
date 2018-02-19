<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
	.visibility-hidden{
		visibility: hidden;
		overflow: hidden;
		position: absolute;
		height: 0;
	}
	
	.doNotShow{
	    margin-left: 0px;
    	margin-right: 0px;
    	border: 0px;
    	padding-top: 0px;
	    padding-bottom: 0px;
	    padding-left: 0px;
	    padding-right: 0px;
	}
<</style>

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
	
	<br><br>
	
	<label id="labelTipoCelular">Informe o tipo do seu celular:</label>
	<input type="text" id="tipoCelular">
	
	<c:choose>
		<c:when test="${0>0}">
			<script>
				$(document).ready(function(){
					$("#labelTipoCelular").attr("for", "tipoCelular");
				});
			</script>
		</c:when>
		<c:otherwise>
			Nada de atribuição.
		</c:otherwise>
	</c:choose>

<form>
 <fieldset class="doNotShow">
  <legend class="visibility-hidden">Personalia:</legend>
  Name: <input type="text"><br>
  Email: <input type="text"><br>
  Date of birth: <input type="text">
 </fieldset>
  <fieldset>
  <legend>Personalia2:</legend>
  Name: <input type="text"><br>
  Email: <input type="text"><br>
  Date of birth: <input type="text">
 </fieldset>
</form>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
    <script>$(document).ready(function(){
    	$(#output).load("Sysdate.class")
    })</script>

</body>
</html>