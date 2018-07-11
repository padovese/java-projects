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

<%@ include file="footer.jsp"%>