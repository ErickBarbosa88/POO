package ex002B;

public class Pobre extends Pessoa{

	public Pobre(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	
	public void Trabalha() {
		System.out.println(" Meu nome e "+ super.getNome() + " Minha idade e: "+ super.getIdade()+" e eu trabalho :P");
	}

}
