package ex002;

public class Animal {
	private String nome;
	private String raca;
	
	public Animal(String nome, String raca) {
		this.nome = nome;
		this.raca = raca;
		
	}
	
	public static String caminhar() {
		return "caminhando";
	}
	public static void main(String[] args) {
		System.out.println(caminhar()); 
	}
}


