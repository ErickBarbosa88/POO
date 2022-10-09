package atividade03_2;

public class InfoClientePessoaJuridica extends InfoCliente {

	private String cnpj;

	public InfoClientePessoaJuridica(String nome, String endereco, double compra, String cnpj) {
		super(nome, endereco, compra);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
