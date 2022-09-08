package ex001;

public class Assistente extends Funcionario{
	
	
	public Assistente(String nome, double salario, double matricula) {
		super(nome, salario, matricula);
	}
	
	@Override
	public void exibeDados() {
			System.out.println(super.getMatricula());
			System.out.println(super.getNome());
			System.out.println(super.getSalario());
	}
}


	
