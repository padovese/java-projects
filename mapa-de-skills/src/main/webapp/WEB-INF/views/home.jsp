<style>
#graph{
	width: 350px;
	height: 350px;
}
</style>

<%@ include file="header.jsp" %>

				<h4>
					<small id="menu">DASHBOARD</small>
				</h4>
				<hr>
				
				<div id="graph">
				<canvas id="firstGraph" width="400" height="400"></canvas>
				</div>
				
				<div id="graph">
				<canvas id="secondGraph" width="400" height="400"></canvas>
				</div>

				
				Por qu� n�o criar sess�o de dojo para postagem de treinamentos, e sess�o de caf� da manh� e outras
				utilidades da horizontal como agenda?

<script>
const totalLinguagem = ${totalLinguagem}; 
const totalFramework = ${totalFramework}; 
const totalFerramenta = ${totalFerramenta};
</script>
<script src="/js/lib/Chart.min.js"></script>
<script src="/js/app/graph.js"></script>

<%@ include file="footer.jsp" %>
