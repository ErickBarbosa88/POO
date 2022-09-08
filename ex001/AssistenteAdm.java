package ex001;

public class AssistenteAdm extends Funcionario {
	private double adc_noturno;
	

	public AssistenteAdm(String nome, double salario, double matricula) {
		super(nome, salario, matricula);
		this.adc_noturno = adc_noturno;
	}
	
	
	public double getAdc_noturno() {
		return adc_noturno;
	}


	public void setAdc_noturno(double adc_noturno) {
		this.adc_noturno = adc_noturno;
	}


	@Override
	public double ganhoAnual() {
		return (adc_noturno + super.getSalario()) * 12;

	}
}
