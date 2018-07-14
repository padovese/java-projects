<style>
#graph{
	width: 350px;
	height: 350px;
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

<div id="graph">
	<label class="bold">Funcional:</label> ${developer.funcional }<br>
	<label class="bold">Nome:</label> ${developer.nome }<br>
	<label class="bold">Squad:</label> ${developer.squad }<br>
	<label class="bold">RT:</label> ${developer.RT }<br>
</div>

<script src="/js/lib/Chart.min.js"></script>
<script src="/js/app/graph.js"></script>
<script>
const nomeDeveloper = "${developer.nome }";
fourthGraph();
</script>


<%@ include file="footer.jsp"%>
