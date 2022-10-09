package atividade03_2;

public class InfoClientePessoaFisica extends InfoCliente {

	private String cpf;

	public InfoClientePessoaFisica(String nome, String endereco, double compra, String cpf) {
		super(nome, endereco, compra);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
