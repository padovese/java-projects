<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
Bem vindo ao nosso gerenciador de empresas!<br/>

<c:if test="${not empty usuarioLogado}">
	Logado como ${usuarioLogado.email}<br/>
</c:if>

<form action="novaEmpresa" method="POST">
	Nome: <input type="text" name = "nomeEmpresa">
		  <input type="submit" value="Enviar">
</form>

<form action="login" method="POST">
	email: <input type="text" name = "email"><br>
	senha: <input type="password" name = "senha"><br>
	<input type="submit" value="Enviar">
</form>

<form action="fazTudo" method="POST">
<input type="hidden" name="tarefa" value="Logout"
		  <input type="submit" value="Logout">
</form>

</body>
</html>