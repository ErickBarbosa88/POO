package ex001;

import poo.Endereco;

public class Funcionario {
	private String nome;
	private double salario;
	
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public void exibeDados() {
		System.out.println(nome);
		System.out.println(salario);
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

