<style>
#graph{ 
	width: 350px;
	height: 350px;
	display: inline-block;
}
</style>

<%@ include file="header.jsp" %>

				<h4>
					<small id="menu">DASHBOARD!!abc</small>
				</h4>
				<hr>
				
				<div id="graph">
				<canvas id="firstGraph" width="400" height="400"></canvas>
				</div>
				
				<div id="graph">
				<canvas id="secondGraph" width="400" height="400"></canvas>
				</div>
				
				<div id="graph">
				<canvas id="thirdChart" width="400" height="400"></canvas>
				</div>

				
				<br>
				Por quê não criar sessão de dojo para postagem de treinamentos, e sessão de café da manhã e outras
				utilidades da horizontal como agenda?

<br>
<div ng-app="wineApp">
<div ng-controller="updateController">{{name}} {{1+2}}</div>
</div>

<script src="/js/lib/Chart.min.js"></script>
<script src="/js/app/graph.js"></script>
<script>
const totalLinguagem = ${totalLinguagem}; 
const totalFramework = ${totalFramework}; 
const totalFerramenta = ${totalFerramenta};
firstGraph();
secondGraph();
thirdGraph();
</script>


<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.7.2/angular.min.js"></script>
<script>
let wineApp = angular.module('wineApp', []);

wineApp.controller('updateController', function ($scope){
	$scope.name = 'Padovese';
});
</script>

<%@ include file="footer.jsp" %>
