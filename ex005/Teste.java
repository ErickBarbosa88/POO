package ex005;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ex001.AssistenteAdm;
import ex001.AssistenteTecnico;
import ex002.Animal;
import ex002.Cachorro;
import ex002.Gato;
import ex002B.Miseravel;
import ex002B.Pobre;
import ex002B.Rica;
import ex003.CamaroteInferior;
import ex003.CamaroteSuperior;
import ex003.Ingresso;
import ex004.Imovel;
import ex004.Novo;
import ex004.Velho;
import todo.Empregados;

public class Teste {

	public static List<AssistenteAdm> listaDeAssistentesAdm = new ArrayList<AssistenteAdm>();
	public static List<AssistenteTecnico> listaDeAssistentesTec = new ArrayList<AssistenteTecnico>();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Letra A");
		System.out.println("Cadastro Assistente administrativo");
		System.out.println("Informe seu nome: ");
		String nome = input.next();

		System.out.println("Informe seu numero de matricula: ");
		double matricula = input.nextDouble();
		double salario = 0;

		System.out.println("Cadastro Assistente Tecnico");
		System.out.println("Informe seu nome: ");
		String nomeTec = input.next();

		System.out.println("Informe seu numero de matricula: ");
		double matriculaTec = input.nextDouble();
		double salarioTec = 0;

		AssistenteTecnico tec = new AssistenteTecnico(nomeTec, salarioTec, matriculaTec);
		listaDeAssistentesTec.add(tec);

		AssistenteAdm adm = new AssistenteAdm(nome, salario, matricula);
		listaDeAssistentesAdm.add(adm);

		for (AssistenteAdm i : listaDeAssistentesAdm) {
			System.out.println("\n" + "[");
			System.out.println("Assitentes Administrativos: ");
			System.out.println(" Nome : " + i.getNome() + "\n" + " Matricula = " + i.getMatricula());
			System.out.println("]" + "\n");
		}

		for (AssistenteTecnico j : listaDeAssistentesTec) {
			System.out.println("\n" + "[");
			System.out.println("Assitentes Tecnicos: ");
			System.out.println(" Nome : " + j.getNome() + "\n" + " Matricula = " + j.getMatricula());
			System.out.println("]" + "\n");
		}

		//////////////////////////////////////////

		System.out.println("Letra B");

		String nomeDog = "Negao";
		String racaDog = "vira-lata";
		Cachorro dog = new Cachorro(nomeDog, racaDog);

		dog.latir();

		String nomeCat = "Soraka";
		String racaCat = "Deusa";
		Gato cat = new Gato(nomeCat, racaCat);

		cat.mia();

		System.out.println("\n");
		System.out.println("Letra C");

		System.out.println("Quanto dinherio voce tem");
		double dinheiro = input.nextDouble();
		System.out.println("Qual sua idade");
		int idade = input.nextInt();
		Rica rica = new Rica(nomeCat, idade, dinheiro);
		rica.fazCompras();

		System.out.println("\n");

		System.out.println("Qual sua idade");
		int idadeP = input.nextInt();
		Pobre pobre = new Pobre(nomeDog, idadeP);
		pobre.Trabalha();

		System.out.println("\n");

		System.out.println("Qual sua idade");
		int idadeM = input.nextInt();
		String mise = "Fafa";
		Miseravel miseravel = new Miseravel(mise, idadeM);
		miseravel.Mendiga();
		;
		System.out.println("\n");
		System.out.println("Letra D");
		int valor = 20;
		
		CamaroteSuperior sup = new CamaroteSuperior(valor);
		Ingresso ingresso = new Ingresso(valor);
		CamaroteInferior inf = new CamaroteInferior(valor);
		
		
		System.out.println("===============================");
		System.out.println("Qual ingresso voce vai querer:");
		System.out.println("1 - Normal");
		System.out.println("2 - VIP");
		int opc = input.nextInt();

		if (opc == 1) {
			System.out.println("Ingresso escolhido foi Normal.");
			System.out.println("O valor fica: " + ingresso.getValor());
		} else if (opc == 2) {
			System.out.println("Ingresso escolhido foi VIP");
			System.out.println("Agora digite 1 para camarote superior ou 2 para camarote inferior.");
			int opc2 = input.nextInt();
			
			switch (opc2) {
			case 1:
				System.out.println("opcao 1 escolhida (Camarote superior)");
				System.out.println("Ingresso ficou no valor de: " + valor + sup.valorAdc());
			case 2:
				System.out.println("opcao 2 escolhida (Camarote Inferior)");
				System.out.println("E sua localizacao e: " ); 
				inf.imprimirLocalizacao();
				System.out.println("Seu valor é " + valor);
			}
		}
		
		
		System.out.println("\n");
		System.out.println("LETRA E");
		
		String endereco = "";
		double preco = 10.0;
		Imovel imovel = new Imovel(endereco, preco);
		Novo novo = new Novo(endereco, preco);
		Velho velho = new Velho(endereco, preco);
		
		System.out.println("===============================");
		System.out.println("Qual Imovel voce vai querer:");
		System.out.println("1 - Novo");
		System.out.println("2 - Velho");
		int opc3 = input.nextInt();
		switch (opc3) {
		
		case 1:
			System.out.println("Imovel (NOVO) escohido. valor:");
			novo.imprimePrecoAdc();
		case 2:
			System.out.println("Imovel (Velho) escohido. valor com desconto:");
			velho.imprimePrecoDesc();
		}
		
		

	}
}
