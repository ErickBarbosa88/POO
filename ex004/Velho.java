package ex004;

public class Velho extends Imovel{
	
	private double desconto = -20.0;
	
	public Velho(String endereco, double preco) {
		super(endereco, preco);
		this.desconto = desconto;
		
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public void imprimePrecoDesc() {
		 System.out.println(super.getPreco() - desconto);	
		}
	
}
