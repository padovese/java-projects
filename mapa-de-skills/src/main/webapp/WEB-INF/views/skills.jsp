<%@ include file="header.jsp"%>

<h4>
	<small id="menu">MAPA DE SKILLS</small>
</h4>
<hr>


<form action="skills" method="post" class="form-inline">
	<div class="form-group">
	<label for="nome">Nome:</label> 
	<input name="nome" type="text" class="form-control" placeholder="digite a skill">
	</div> 
	<div class="form-group">
	<label for="tipoSkill">Tipo:</label> 
	<select	name="tipoSkill" class="form-control">
		<option value="LINGUAGEM">Linguagem</option>
		<option value=FRAMEWORK>Framework</option>
		<option value="FERRAMENTA">Ferramenta</option>
	</select>
	</div>
	<button type="submit" class="btn btn-default">Cadastra</button>
</form>

<br>
<p id="feedback">${sucesso }${erro }</p>

<table class="table table-hover">
	<thead>
		<th>Skill</th>
		<th>Tipo</th>
	</thead>
	<tbody>
		<c:forEach items="${skills }" var="skill">
			<tr>
				<td>${skill.nome }</td>
				<td>${skill.tipoSkill }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<br>

<%@ include file="footer.jsp"%>

<script>
$(document).ready(function() {
	if('${erro }' === ''){
		$('#feedback').css("color", "green");
	} else{
		$('#feedback').css("color", "red");
	}
});
</script>