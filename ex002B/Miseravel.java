package ex002B;

public class Miseravel extends Pessoa {

	public Miseravel(String nome, int idade) {
		super(nome, idade);
		
	}
	
	public void Mendiga() {
		System.out.println(" Meu nome e "+ super.getNome() + " Minha idade e: "+ super.getIdade()+" me da uma moeda");
	}
}
