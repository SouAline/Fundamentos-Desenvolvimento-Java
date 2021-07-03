package tp1_fundamentosDesenvolvimentoJava;

import java.util.Scanner;

public class CadastroAluno {
	private static String[] nomeAluno;
	private static double[] primeiraNota;
	private static double[] segundaNota;
	private static final int COMPRIMENTO = 99;
	private static int ordenacao;
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		nomeAluno = new String[COMPRIMENTO];
		primeiraNota = new double[COMPRIMENTO];
		segundaNota = new double[COMPRIMENTO];
		int escolha = teclado.nextInt();
		int consultaAluno = 0;
		do {
			System.out.println("[1] Registrar notas de um aluno");
			System.out.println("[2] Consultar boletim");
			System.out.println("[3] Consultar todos alunos");
			System.out.println("[4] Sair");
			System.out.println("Digite uma das opções acima: ");
			escolha = teclado.nextInt();
			
			switch (escolha) {
			case 1:
				if (ordenacao < COMPRIMENTO) {
					System.out.println("Digite o nome do aluno: ");
					nomeAluno[ordenacao] = teclado.next();
					System.out.println("Informe a primeira nota: ");
					primeiraNota[ordenacao] = teclado.nextDouble();
					System.out.println("Informe a segunda nota: ");
					segundaNota[ordenacao] = teclado.nextDouble();
					ordenacao++;
				}else {
					System.out.println("A lista está completa.");
				}
				break;
				
			case 2:
				System.out.println("Informe a posição do cadastro do aluno: ");
				consultaAluno = teclado.nextInt();
				// imprimir posição
				if (consultaAluno >= 0 || consultaAluno <= ordenacao) {
					mostrarAlunos(consultaAluno);
				}break;
				
			case 3:
				consultarAluno(consultaAluno);
				break;
				
			case 4:
				System.out.println("Programa finalizado! Tenha um bom dia!");
				break;
				
			default:
				System.out.println("Tente novamente");
				break;
		}
	} while(escolha != 4);
		
		teclado.close();
	}
	
	private static double media(int consultaAluno) {
		double soma = primeiraNota[consultaAluno] + segundaNota[consultaAluno];
        double media = soma / 2;
        return media;
	} 
	private static void consultarAluno(int p) {
		System.out.println("Resultado da pesquisa dos alunos cadastrados:");
		for(int i = 0; i < ordenacao; i++) {
		consultarAluno(i);
		}
	}
	private static void mostrarAlunos(int consultaAluno) {
		
		System.out.printf("[%d] %s - %.2f - %2.f - %.2f%n", consultaAluno, nomeAluno[consultaAluno], primeiraNota[consultaAluno], segundaNota[consultaAluno], media(consultaAluno));
	}
	
}


