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

<form action="../${developer.funcional }" method="post" class="form-inline">
<div id="graph">
	<canvas id="developerPersonalChart" width="400" height="400"></canvas>
</div>

<div id="devInfo">'
	[foto do dev]<br>
	<label class="bold" name="funcional">Funcional:</label>
	<input type="text" name="funcional" value="${developer.funcional }"><br>
	
	<label class="bold" name="nome">Nome:</label>
	<input type="text" name="nome" value="${developer.nome }"><br>
	
	<label class="bold" name="squad">Squad:</label> 
	<input type="text" name="squad" value="${developer.squad }"><br>
	
	<label class="bold" name="RT">RT:</label>
	<input type="text" name="RT" value="${developer.RT }"><br>
	
	<label class="bold">Metas técnicas:</label> <br>
</div>
	
<hr>

<table class="table table-hover">
	<thead>
		<th>Skill</th>
		<th>Nível de experiência</th>
	</thead>
	<tbody>
		<c:forEach items="${developer.notas }" var="developerSkill" varStatus="i">
		<tr>
			<td><input type="text" name="notas[${i.index }].skill" value="${developerSkill.skill }"></td>
			<td><input type="text" name="notas[${i.index }].nota" value="${developerSkill.nota }"></td>
		</tr>
		
		</c:forEach>
	</tbody>
</table>
	<button type="submit" class="btn btn-default">Salvar</button>
</form>

<script src="/js/lib/Chart.min.js"></script>
<script src="/js/app/graph.js"></script>
<script>
const nomeDeveloper = "${developer.nome }";
fourthGraph();


</script>


<%@ include file="footer.jsp"%>
