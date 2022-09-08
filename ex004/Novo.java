package ex004;

public class Novo extends Imovel{
	
	private double adcPreco = 30;

	public Novo(String
			endereco, double preco) {
		super(endereco, preco);
		this.adcPreco = adcPreco;
		
	}

	public double getAdcPreco() {
		return adcPreco;
	}

	public void setAdcPreco(double adcPreco) {
		this.adcPreco = adcPreco;
	}
	
	
	public void imprimePrecoAdc() {
	 System.out.println(super.getPreco() + adcPreco);	
	}
	
	
}
