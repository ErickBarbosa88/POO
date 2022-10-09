package atividade03_2;

public class ClienteFidelizacaoEspecial extends ClienteFidelizacao {

	public ClienteFidelizacaoEspecial(String nome, String endereco, double compra, double bonus, String validade) {
		super(nome, endereco, compra, bonus, validade);

	}

	@Override
	public double adicionaBonus() {
		return super.getCompra() + (getCompra() * 0.1);
	}

}
