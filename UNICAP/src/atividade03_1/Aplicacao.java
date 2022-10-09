package atividade03_1;

import java.util.Scanner;
import atividade03_1.Funcionario;


import java.util.ArrayList;
import java.util.List;

public class Aplicacao {

	public static List<Funcionario> listaDeGerentes = new ArrayList<Funcionario>();
	public static List<Funcionario> listaDeProgramador = new ArrayList<Funcionario>();
	public static List<Funcionario> listaDeAnalista = new ArrayList<Funcionario>();

	public static void imprimirGerente() {

		for (Funcionario fulano1 : listaDeGerentes) {
			System.out.println("\n");
			System.out.println("Gerente");
			System.out.println("Nome: " + fulano1.getNome());
			System.out.println("Salario: " + fulano1.getSalario());
		}

	}

	public static void imprimirProgramador() {

		for (Funcionario cicrano1 : listaDeProgramador) {
			System.out.println("\n");
			System.out.println("Programador");
			System.out.println("Nome: " + cicrano1.getNome());
			System.out.println("Salario: " + cicrano1.getSalario());
		}

	}

	public static void imprimirAnalista() {

		for (Funcionario deutrano1 : listaDeAnalista) {
			System.out.println("\n");
			System.out.println("Analista");
			System.out.println("Nome: " + deutrano1.getNome());
			System.out.println("Salario: " + deutrano1.getSalario());
		}

	}

	public static void imprimirDados() {
		Scanner input = new Scanner(System.in);
		System.out.println("Voce deseja imprimir os dados de quem: ");
		System.out.println("1 - Gerente;");
		System.out.println("2 - Programador;");
		System.out.println("3 - Analista de Sistemas.");
		int opcao = input.nextInt();

		switch (opcao) {

		case 1:
			imprimirGerente();
			break;
		case 2:
			imprimirProgramador();
			break;
		case 3:
			imprimirAnalista();
			break;

		}
	}

	public static void aumentarGerente() {
		Scanner input = new Scanner(System.in);
		System.out.println("informe o valor que deseja aumentar o salario");
		double opc = input.nextDouble();
		
		Funcionario ger = new Gerente(opc, "");
		
		System.out.println("Salario antes da soma");
		System.out.println(ger.getSalario());
		
		System.out.println("salario com a soma = ");
		System.out.println(ger.getSalario() + opc);
		

	}

	public static void aumentarProgramador() {
		Scanner input = new Scanner(System.in);
		System.out.println("informe o valor que deseja aumentar o salario");
		double opc = input.nextDouble();
		
		Funcionario pro = new Programador(opc, "");
		
		System.out.println("Salario antes da soma");
		System.out.println(pro.getSalario());
		
		System.out.println("salario com a soma = ");
		System.out.println(pro.getSalario() + opc);

	}

	public static void aumentarAnalista() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("informe o valor que deseja aumentar o salario");
		double opc = input.nextDouble();
		
		Funcionario analyst = new AnalistaDeSistemas(opc, "");
		
		System.out.println("Salario antes da soma");
		System.out.println(analyst.getSalario());
		
		System.out.println("salario com a soma = ");
		System.out.println(analyst.getSalario() + opc);

	}
	

	public static void aumentarSalario() {
		Scanner input = new Scanner(System.in);
		System.out.println("De quem deseja aumentar o salario: ");
		System.out.println("1 - Gerente;");
		System.out.println("2 - Programador;");
		System.out.println("3 - Analista de Sistemas.");
		int opcao = input.nextInt();

		switch (opcao) {

		case 1:
			aumentarGerente();
			break;
		case 2:
			aumentarProgramador();
			;
			break;
		case 3:
			aumentarAnalista();
			break;

		}
	}

	public static void gerente() {
		Scanner input = new Scanner(System.in);

		double salario;
		String nome;
		String opc = "s";

		while (opc.equalsIgnoreCase("s")) {

			System.out.println("Gerente");
			System.out.println("Informe o salario: ");
			salario = input.nextDouble();

			System.out.println("Informe o Nome: ");
			nome = input.next();

			Funcionario fulano = new Gerente(salario, nome);
			fulano.aumentaSalario();
			listaDeGerentes.add(fulano);

			for (Funcionario fulano1 : listaDeGerentes) {
				System.out.println("\n");
				System.out.println("Gerente");
				System.out.println("Nome: " + fulano1.getNome());
				System.out.println("Salario: " + fulano1.getSalario());
			}
			System.out.println("Deseja cadastrar mais algum gerente ? s or n");
			opc = input.next();

		}
	}

	public static void programador() {
		Scanner input = new Scanner(System.in);

		double salario;
		String nome;
		String opc = "s";

		while (opc.equalsIgnoreCase("s")) {

			System.out.println("Programador");
			System.out.println("Informe o salario: ");
			salario = input.nextDouble();

			System.out.println("Informe o Nome: ");
			nome = input.next();

			Funcionario cicrano = new Programador(salario, nome);
			cicrano.aumentaSalario();
			listaDeGerentes.add(cicrano);

			for (Funcionario cicrano1 : listaDeProgramador) {
				System.out.println("\n");
				System.out.println("Programador");
				System.out.println("Nome: " + cicrano1.getNome());
				System.out.println("Salario: " + cicrano1.getSalario());
			}
			System.out.println("Deseja cadastrar mais algum Programador ? s or n");
			opc = input.next();

		}
	}

	public static void analistas() {
		Scanner input = new Scanner(System.in);

		double salario;
		String nome;
		String opc = "s";

		while (opc.equalsIgnoreCase("s")) {

			System.out.println("Analista");
			System.out.println("Informe o salario: ");
			salario = input.nextDouble();

			System.out.println("Informe o Nome: ");
			nome = input.next();

			Funcionario deutrano = new AnalistaDeSistemas(salario, nome);
			deutrano.aumentaSalario();
			listaDeGerentes.add(deutrano);

			for (Funcionario deutrano1 : listaDeAnalista) {
				System.out.println("\n");
				System.out.println("Analista");
				System.out.println("Nome: " + deutrano1.getNome());
				System.out.println("Salario: " + deutrano1.getSalario());
			}
			System.out.println("Deseja cadastrar mais algum Analista ? s or n");
			opc = input.next();

		}
	}

	public static void cadastro() {
		Scanner input = new Scanner(System.in);

		System.out.println("Olá seja bem vindo.");
		System.out.println("Começaremos pelo cadastro dos funcionarios.");
		System.out.println("Quem voce deseja cadastrar: ");
		System.out.println("1 - Gerente;");
		System.out.println("2 - Programador;");
		System.out.println("3 - Analista de Sistemas.");

		int opcao = input.nextInt();

		switch (opcao) {

		case 1:
			gerente();
			break;
		case 2:
			programador();
			break;
		case 3:
			analistas();
			break;

		}
	}

	public static void menu() {

		Scanner input = new Scanner(System.in);
		System.out.println("===========================");
		System.out.println("O que voce deseja fazer");
		System.out.println("1 - Imprimir dados.");
		System.out.println("2 - Aumentar salario..");
		System.out.println("===========================");

		int opcao = input.nextInt();

		switch (opcao) {

		case 1:
			imprimirDados();
			break;

		case 2:
			aumentarSalario();
			break;

		}

	}

	public static void main(String[] args) {

		cadastro();
		menu();

	}

}
