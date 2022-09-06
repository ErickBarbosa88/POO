package ex001;

public class Assistente extends Funcionario{
	
	public double matricula;
	
	public Assistente(String nome, double salario, double matricula) {
		super(nome, salario);
		this.matricula = matricula;
	}
	
	@Override
	public void exibeDados() {
			System.out.println(this.matricula);
			System.out.println(super.getNome());
			System.out.println(super.getSalario());
	}
}


	
