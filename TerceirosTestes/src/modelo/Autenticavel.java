package modelo;
public interface Autenticavel {
	//interfaces garantem que diversas classes diferentes são obrigadas a usar o(s) método declarado aqui.
	boolean autentica(int senha);
}
