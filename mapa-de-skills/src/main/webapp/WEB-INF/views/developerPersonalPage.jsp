<style>
#graph{
	width: 350px;
	height: 350px;
	display: inline-block;
}

#devInfo{
	display: inline-block;
}

.bold{
    font-weight: bold
}
</style>

<%@ include file="header.jsp"%>

<h4>
	<small id="menu">STATUS DO DEV</small>
</h4>
<hr>

<div id="graph">
	<canvas id="developerPersonalChart" width="400" height="400"></canvas>
</div>

<form action="developers" method="post" class="form-inline">
<div id="devInfo">'
	[foto do dev]<br>
	<label class="bold">Funcional:</label> ${developer.funcional }<br>
	<label class="bold">Nome:</label> ${developer.nome }<br>
	<label class="bold">Squad:</label> ${developer.squad }<br>
	<label class="bold">RT:</label> ${developer.RT }<br>
	<label class="bold">Metas técnicas:</label> <br>
	
		<div class="form-group">
		<label for="funcional">Funcional:</label> 
		<input name="funcional" type="text" class="form-control" placeholder="digite a funcional" value="${developer.funcional }">
	</div> 
	<div class="form-group">
		<label for="nome">Nome:</label> 
		<input name="nome" type="text" class="form-control" placeholder="digite o nome" value="${developer.nome }">
	</div>
	<div class="form-group">
		<label for="squad">Squad:</label> 
		<input name="squad" type="text" class="form-control" placeholder="digite a squad" value="${developer.squad }">
	</div> 
	<div class="form-group">
	<label for="RT">RT:</label> 
	<select	name="RT" class="form-control">
		<option value="PF">PF</option>
		<option value=PJ>PJ</option>
		<option value="SALA_DE_VENDAS_PF">SALA_DE_VENDAS_PF</option>
		<option value="SALA_DE_VENDAS_PJ">SALA_DE_VENDAS_PJ</option>
	</select>
	</div>
</div>

<hr>

<table class="table table-hover">
	<thead>
		<th>Skill</th>
		<th>Nível de experiência</th>
	</thead>
	<tbody>
		<c:forEach items="${skills }" var="skill">
			<tr>
				<td>${skill.nome }</td>
				<td>
					<select	name="tipoSkill" class="form-control selectNota${skill.nome }">
						<option value="0">0</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
					</select>
					<c:forEach items="${developer.skills }" var="developerSkill">
						<c:if test="${skill.nome == developerSkill.skill}">
								<script>deleteSelect("${skill.nome}");</script>
								<select	name="tipoSkill" class="form-control">
									<option value="0" <c:if test="${developerSkill.nota == 0 }">selected</c:if>>0</option>
									<option value="1" <c:if test="${developerSkill.nota == 1 }">selected</c:if>>1</option>
									<option value="2" <c:if test="${developerSkill.nota == 2 }">selected</c:if>>2</option>
									<option value="3" <c:if test="${developerSkill.nota == 3 }">selected</c:if>>3</option>
									<option value="4" <c:if test="${developerSkill.nota == 4 }">selected</c:if>>4</option>
								</select>
								<c:set var="flagSkill" value="true" />
						</c:if>
					</c:forEach>
				</td>	
			</tr>
		</c:forEach>
	</tbody>
</table>

	<button type="submit" class="btn btn-default">Cadastra</button>
</form>

<script src="/js/lib/Chart.min.js"></script>
<script src="/js/app/graph.js"></script>
<script>
const nomeDeveloper = "${developer.nome }";
fourthGraph();


</script>


<%@ include file="footer.jsp"%>
