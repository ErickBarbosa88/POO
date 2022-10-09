package atividade03_1;

public class Programador extends Funcionario{

	public Programador(double salario, String nome) {
		super(salario, nome);
		// TODO Auto-generated constructor stub
	}

	public void aumentaSalario() {
		setSalario(getSalario() + (getSalario() * 0.2));
	}
	
	
}
