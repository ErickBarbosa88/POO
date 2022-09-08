package ex001;

public class AssistenteTecnico extends Funcionario {

	
	private double bonus;
	

	public AssistenteTecnico(String nome, double salario, double matricula) {
		super(nome, salario, matricula);
		this.bonus = bonus;

	}
	@Override
	public double ganhoAnual() {
		return (bonus + super.getSalario()) * 12;

	}

}

