package modelo;
public interface Autenticavel {
	//interfaces garantem que diversas classes diferentes s�o obrigadas a usar o(s) m�todo declarado aqui.
	boolean autentica(int senha);
}
