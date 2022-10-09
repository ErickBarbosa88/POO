package atividade03_3;

import atividade03_2.Conta;

public class ContaEspecial extends Conta {

	public ContaEspecial(String nome, double numconta, double saldo, double salario) {
		super(nome, numconta, saldo, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double limite(double valorlimit) {
		if (valorlimit > getSalario() * 3) {
			return valorlimit = getSalario();
		} else {
			return valorlimit = (getSalario() * 3);
		}
	}

}
