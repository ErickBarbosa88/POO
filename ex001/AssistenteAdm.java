package ex001;

public class AssistenteAdm extends Funcionario {
	private double adc_noturno;

	public AssistenteAdm(String nome, double salario) {
		super(nome, salario);
		this.adc_noturno = adc_noturno;
	}

	@Override
	public double ganhoAnual() {
		return (adc_noturno + super.getSalario()) * 12;

	}
}
