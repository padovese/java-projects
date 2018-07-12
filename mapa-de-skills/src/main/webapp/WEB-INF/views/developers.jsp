<%@ include file="header.jsp"%>

<h4>
	<small id="menu">STATUS DO DEV</small>
</h4>
<hr>

<form action="developers/consulta" method="get" class="form-inline">
	<div class="form-group">
	<label for="nome">Funcional:</label> 
	<input name="nome" type="number" class="form-control" placeholder="digite a funcional">
	</div> 
	<button type="submit" class="btn btn-default">Pesquisa</button>
</form>

<br><br>
${developer.nome }

<table class="table table-hover">
	<thead>
	<th>Funcional <a href="/developers?sort=funcional"><span class="glyphicon glyphicon-sort-by-attributes"></span></a></th>
		<th>Dev <a href="/developers?sort=nome"><span class="glyphicon glyphicon-sort-by-attributes"></span></a></th>
		<th>Squad <a href="/developers?sort=squad"><span class="glyphicon glyphicon-sort-by-attributes"></span></a></th>
		<th>RT <a href="/developers?sort=RT"><span class="glyphicon glyphicon-sort-by-attributes"></span></a></th>
	</thead>
	<tbody>
		<c:forEach items="${developers }" var="developer">
			<tr>
				<td>${developer.funcional }</td>
				<td>${developer.nome }</td>
				<td>${developer.squad }</td>
				<td>${developer.RT }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<br>

<%@ include file="footer.jsp"%>