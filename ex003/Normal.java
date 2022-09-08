package ex003;

public class Normal extends Ingresso{

	public Normal(double valor) {
		super(valor);
		
	}
	
	@Override
	public  void imprimeValor(){
		System.out.println(super.getValor());
	}
	

}
