package ex003;

public class VIP extends Ingresso {
	
	private double valor_adc=20.0;
	
	public VIP(double valor) {
		super(valor);
		this.valor_adc = valor_adc; 
	}
	
	public double getValor_adc() {
		return valor_adc;
	}

	public void setValor_adc(double valor_adc) {
		this.valor_adc = valor_adc;
	}

	public double valorAdc() {
		return super.getValor() + valor_adc;
	}
}
