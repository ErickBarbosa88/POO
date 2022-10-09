package atividade03_2;

public abstract class Cliente {

	private String nome;
	private String endereco;
	private double compra;

	public Cliente(String nome, String endereco, double compra) {
		this.nome = nome;
		this.endereco = endereco;
		this.compra = compra;

	}

	public double getCompra() {
		return compra;
	}

	public void setCompra(double compra) {
		this.compra = compra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
