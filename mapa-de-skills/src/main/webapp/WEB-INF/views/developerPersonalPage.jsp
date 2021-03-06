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

<div id="devInfo">'
	[foto do dev]<br>
	<label class="bold" name="funcional">Funcional:</label> ${developer.funcional }<br>
	<label class="bold" name="nome">Nome:</label> ${developer.nome }<br>
	<label class="bold" name="squad">Squad:</label> ${developer.squad }<br>
	<label class="bold" name="RT">RT:</label> ${developer.RT }<br>
	<label class="bold">Metas t�cnicas:</label> <br>
</div>
	
<hr>

<table class="table table-hover">
	<thead>
		<th>Skill</th>
		<th>N�vel de experi�ncia</th>
	</thead>
	<tbody>
		<c:forEach items="${developer.notas }" var="developerSkill">
		<tr>
			<td>${developerSkill.skill }</td>
			<td>${developerSkill.nota }</td>
		</tr>
		
		</c:forEach>
	</tbody>
</table>

<form action="${developer.funcional }/edit" method="post" class="form-inline">
	<button type="submit" class="btn btn-default">Atualizar perfil</button>
</form>

<script src="/js/lib/Chart.min.js"></script>
<script src="/js/app/graph.js"></script>
<script>
const nomeDeveloper = "${developer.nome }";
fourthGraph();


</script>


<%@ include file="footer.jsp"%>
