<%@ include file="header.jsp"%>

<h4>
	<small id="menu">STATUS DO DEV</small>
</h4>
<hr>

<form action="developers" method="post" class="form-inline">
	<div class="form-group">
		<label for="funcional">Funcional:</label> 
		<input name="funcional" type="text" class="form-control" placeholder="digite a funcional">
	</div> 
	<div class="form-group">
		<label for="nome">Nome:</label> 
		<input name="nome" type="text" class="form-control" placeholder="digite o nome">
	</div>
	<div class="form-group">
		<label for="squad">Squad:</label> 
		<input name="squad" type="text" class="form-control" placeholder="digite a squad">
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
	<button type="submit" class="btn btn-default">Cadastra</button>
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