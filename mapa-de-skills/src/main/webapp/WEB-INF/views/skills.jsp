<%@ include file="header.jsp"%>

<h4>
	<small id="menu">MAPA DE SKILLS</small>
</h4>
<hr>
Cadastro
<br>

<form action="skills" method="post">
	nome: <input name="nome" type="text"> tipo: <select
		name="tipoSkill">
		<option value="LINGUAGEM">Linguagem</option>
		<option value=FRAMEWORK>Framework</option>
		<option value="FERRAMENTA">Ferramenta</option>
	</select>
	<button type="submit">Cadastra</button>
</form>

Listagem
<br>
<c:forEach items="${skills }" var="skill">
		${skill.nome }
		${skill.tipoSkill }
	</c:forEach>

<%@ include file="footer.jsp"%>