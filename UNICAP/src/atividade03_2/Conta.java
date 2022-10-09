package atividade03_2;

public class Conta {
	
	private String nome;
	private double numconta;
	private double saldo;
	private double salario;
	
	public Conta(String nome, double numconta, double saldo, double salario) {
		this.nome = nome;
		this.numconta = numconta;
		this.saldo = saldo;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNumconta() {
		return numconta;
	}
	public void setNumconta(double numconta) {
		this.numconta = numconta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double limite(double valorlimit) {
		if(valorlimit > getSalario()) {
			return valorlimit = getSalario();
		}else {
			return valorlimit;
		}
	}
	
	public double deposito(double valordep) {
		return getSaldo() + valordep; 
	}
	
	public boolean saque(double valorsaque) {
		if(valorsaque > getSaldo()) {
			return false;
		}else {
			return true;
		}
	}
	
	
	
	
}
