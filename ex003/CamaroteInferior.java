package ex003;

public class CamaroteInferior extends VIP {

	private String localizacao = "ponta esquerda";
	
	public CamaroteInferior(double valor) {
		super(valor);
		this.localizacao = localizacao;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	public void imprimirLocalizacao() {
		System.out.println(localizacao);
	}
	
}
