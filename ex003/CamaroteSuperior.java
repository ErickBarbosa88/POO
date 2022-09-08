package ex003;

public class CamaroteSuperior extends VIP{
	private double valoradc = 20.0;
	
	public CamaroteSuperior(double valor) {
		super(valor);
		this.valoradc = valoradc;
	}
	
	@Override
	public double valorAdc() {
		return this.getValor() + super.getValor_adc() + valoradc;
	}
	
	
}
