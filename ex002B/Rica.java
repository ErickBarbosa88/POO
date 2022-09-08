package ex002B;

public class Rica extends Pessoa{
		
		private double dinheiro;
		
	public Rica(String nome, int idade, double dinheiro) {
		super(nome, idade);
		this.dinheiro = dinheiro;
	}
	
	public void fazCompras() {
		System.out.println(" Meu nome e "+ super.getNome() + " Minha idade e: "+ super.getIdade()+" e eu faço compras :P");
	}

}
 