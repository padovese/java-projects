package refatoracao3;

public class EnviadorDeEmail {
	public void enviaEmail() {
		// envia email
		String msgDoEmail = "Caro cliente,<br/>";
		msgDoEmail += "� com prazer que lhe avisamos que sua nota fiscal foi " + "gerada no valor de "
				+ /* nf.getValorLiquido() */ 2.0 + ".<br/>";
		msgDoEmail += "Acesse o site da prefeitura e fa�a o download.<br/><br/>";
		msgDoEmail += "Obrigado!";

		System.out.println(msgDoEmail);
	}
}
