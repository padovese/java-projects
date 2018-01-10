<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script src="resources/js/jquery.js"></script>
<script type="text/javascript">
	
	function deuCerto(dadosDaResposta){
		alert("Conta paga com sucesso!");
		//$(location).attr('href','//listaContas')
	}
	
	function pagaAgora(id){
		//alert("1");
		$.get("pagaConta?id=" + id, deuCerto);
		//alert("2");//funcoes assincronas
		//window.location.replace("/listaContas");
	}

	
</script>
</head>
<body>

	<table>
		<tr>
			<th>Código</th>
			<th>Descrição</th>
			<th>Valor</th>
			<th>Tipo</th>
			<th>Paga?</th>
			<th>Data de Pagamento</th>
			<th>Ações</th>
		</tr>
		
		<c:forEach items="${todasContas}" var="conta">
				<tr>
					<td>${conta.id}</td>
					<td>${conta.descricao}</td>
					<td>${conta.valor}</td>
					<td>${conta.tipo}</td>
					<td>
						<c:if test="${conta.paga eq false }">
						Não paga.
						</c:if>
						<c:if test="${conta.paga eq true}">
						Paga!
						</c:if>
					</td>
					<td><fmt:formatDate value="${conta.dataPagamento.time}" pattern="dd/MM/yyyy" /></td>
					<td>
						<a href="removeConta?id=${conta.id}">Deletar</a>
						
						<c:if test="${conta.paga eq false}">
						 | 
						<a href="#" onclick="pagaAgora(${conta.id})">Pagar</a>
						</c:if>
					</td>
				</tr>
		</c:forEach>
	</table>

</body>
</html>