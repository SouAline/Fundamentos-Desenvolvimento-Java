package tp1_fundamentosDesenvolvimentoJava;

import java.util.Scanner;

public class Main {

	private static String[] nomeAluno;
	private static double[] primeiraNota;
	private static double[] segundaNota;
	private static final int COMPRIMENTO = 99;
	private static int ordenacao;
	
	
	static Scanner teclado = new Scanner(System.in);
	int escolha = teclado.nextInt();
	
public static void Cadastro() {
		System.out.println("Digite o nome do aluno: ");
		nomeAluno[ordenacao] = teclado.next();
		System.out.println("Informe a primeira nota: ");
		primeiraNota[ordenacao] = teclado.nextDouble();
		System.out.println("Informe a segunda nota: ");
		segundaNota[ordenacao] = teclado.nextDouble();
		ordenacao++;
	}

public static void ConsultaAluno() {
	System.out.println("Informe a posição do cadastro do aluno: ");
	int consultaAluno = teclado.nextInt();
	
	if (consultaAluno >=0 || consultaAluno <= ordenacao) {
		System.out.println(nomeAluno[consultaAluno]);
		System.out.println(primeiraNota[consultaAluno]);
		System.out.println(segundaNota[consultaAluno]);
	}else{
			System.out.println("Aluno não possui cadastro.");
		}
		
	double soma = primeiraNota[consultaAluno] + segundaNota[consultaAluno];
	double media = soma / 2;
		
		if (media <= 4) {
			System.out.println("REPROVADO");
				
		} else if (media > 4 && media < 7) {
			System.out.println("PROVA FINAL");
		}else{
			System.out.println("APROVADO");
		}	
}

public static void Menu() {
	System.out.println("[1] Registrar notas de um aluno");
	System.out.println("[2] Consultar boletim");
	System.out.println("[3] Consultar todos alunos");
	System.out.println("[4] Sair");
	System.out.println("Digite uma das opções acima: ");
	
	
	
}
	public static void main(String[] args) {
		
		nomeAluno = new String[COMPRIMENTO];
		primeiraNota = new double[COMPRIMENTO];
		segundaNota = new double[COMPRIMENTO];
		Menu();
		int escolha = teclado.nextInt();
		do {
			if (escolha<0 || escolha > 4) {
				System.out.println("Opção digitada não é válida!");
			}else {
				switch (escolha) {
				case 1:
					if(ordenacao < COMPRIMENTO) {
						Cadastro();
						
						System.out.println("Deseja cadastrar mais alunos [s/n]? ");
						char resposta = teclado.next().trim().charAt(0);
					
							if (resposta == 's' && resposta == 'S') {
								Cadastro();
							}else{
								Menu();
							}				
					
					System.out.println("A lista está completa.");
				}break;

			case 2:
				ConsultaAluno();
				break;
			case 3:
				
				//imprimir os cadastros ;
				}
			}while (escolha < 4); {	
			}	teclado.close();
		
		
		//double soma = 0;
		//for (int i; i <= ordenacao; i++) {
			//soma += primeiraNota[i];
			//soma += segundaNota[i];
			
		

	}
	}
}
