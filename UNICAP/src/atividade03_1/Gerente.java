package atividade03_1;

public class Gerente extends Funcionario {
	
	public Gerente(double salario, String nome) {
		super(salario, nome);
		// TODO Auto-generated constructor stub
	}

	public void aumentaSalario() {
		setSalario(getSalario() + (getSalario() * 0.1));
	}
}
