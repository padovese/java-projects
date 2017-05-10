import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

class Funcionario{
	String nome;
	String departamento;
	double salario;
	Date dataDeAdmissao;
	String rg;
	
	void recebeAumento(double aumento){
		this.salario += aumento;
	}
	
	double calculaGanhoAnual(){
		return this.salario*12;
	}

	void mostra(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Deparamento: " + this.departamento);
		System.out.println("Salario: " + this.salario);
		System.out.println("Data de Admissao: " + this.dataDeAdmissao);
		System.out.println("RG: " + this.rg);
	}
}

class TestaFuncionario{
	public static void main(String[] args) throws ParseException{	
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
		Funcionario f1 = new Funcionario();
		f1.nome = "Padovese";
		f1.departamento = "T.I.";
		f1.salario = 5133.0;
		f1.dataDeAdmissao = sdf.parse("15022016");
		f1.rg = "37.912.522-5";
		
		Funcionario f2 = new Funcionario();
		f2.nome = "Padovese";
		f2.departamento = "T.I.";
		f2.salario = 5133.0;
		//f2.dataDeAdmissao = "15/02/2016";
		f2.rg = "37.912.522-5";
		
		//f1.recebeAumento(1000);
		//System.out.println(f1.calculaGanhoAnual());
		
		f1.mostra();
		f2.mostra();
		
		if(f1 == f2){
			System.out.println("iguais");
		}
		else{
			System.out.println("diferentes");
		}
		
		Funcionario f3 = new Funcionario();
		f3.nome = "Jose";
		f3.salario = 100.0;
		
		Funcionario f4 = f3;
		
		if(f3 == f4){
			System.out.println("iguais");
		}
		else{
			System.out.println("diferentes");
		}
		
	}
}
