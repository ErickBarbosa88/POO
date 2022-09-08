package ex001;

public class Funcionario {
	private String nome;
	private double salario;
	private double matricula;
	
	
	public Funcionario(String nome, double salario, double matricula) {
		this.nome = nome;
		this.salario = salario;
		this.matricula = matricula;
	}
	
	public void exibeDados() {
		System.out.println(nome);
		System.out.println(salario);
	}
	
	public double getMatricula() {
		return matricula;
	}

	public void setMatricula(double matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double addAumento(double valor) {
		return getSalario() + valor;
	}
	
	public double ganhoAnual() {
		return getSalario() * 12;
	}
	

	
}

