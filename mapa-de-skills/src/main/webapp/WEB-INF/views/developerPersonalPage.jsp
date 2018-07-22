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
	<label class="bold">Funcional:</label> ${developer.funcional }<br>
	<label class="bold">Nome:</label> ${developer.nome }<br>
	<label class="bold">Squad:</label> ${developer.squad }<br>
	<label class="bold">RT:</label> ${developer.RT }<br>
	<label class="bold">Metas técnicas:</label> <br>
</div>
	
<hr>

<table class="table table-hover">
	<thead>
		<th>Skill</th>
		<th>Nível de experiência</th>
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
	

<script src="/js/lib/Chart.min.js"></script>
<script src="/js/app/graph.js"></script>
<script>
const nomeDeveloper = "${developer.nome }";
fourthGraph();


</script>


<%@ include file="footer.jsp"%>
