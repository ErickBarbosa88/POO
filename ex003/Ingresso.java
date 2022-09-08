package ex003;

public class Ingresso {	
	private double valor = 20.0;
	
	public Ingresso(double valor) {
		this.valor = valor;
	}
	

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public  void  imprimeValor() {
		System.out.println(valor);
	}
}
