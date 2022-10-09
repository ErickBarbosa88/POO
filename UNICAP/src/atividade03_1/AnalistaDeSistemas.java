package atividade03_1;

public class AnalistaDeSistemas extends Funcionario{

	public AnalistaDeSistemas(double salario, String nome) {
		super(salario, nome);
		
	}
	public void aumentaSalario() {
		setSalario(getSalario() + (getSalario() * 0.05));
		
	}

	
		



}
