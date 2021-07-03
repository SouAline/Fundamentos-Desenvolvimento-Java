package tp1_fundamentosDesenvolvimentoJava;

import java.util.Scanner;


public class Cadastro {
    private static String[] nomes;
    private static double[] nota1;
    private static double[] nota2;
    private static final int TAMANHO = 99;
    private static int posicao;

    public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
		
        nomes = new String[TAMANHO];
	nota1 = new double[TAMANHO];
	nota2 = new double[TAMANHO];
	String opcao = null;
    do {
        System.out.println("*******************************");
	System.out.println("[1] Registrar notas de um aluno");
	System.out.println("[2] Consultar boletim");
	System.out.println("[3] Consultar todos alunos");
	System.out.println("[4] Sair");
        System.out.println("*******************************");
	System.out.println("Digite uma das op��es acima: ");
	opcao = teclado.next();
        
        switch (opcao){
        case "1":
            if(posicao < TAMANHO){
                System.out.println("Digite o nome do aluno: ");
                nomes[posicao] = teclado.next();
                System.out.println("Informe a primeira nota: ");
                nota1[posicao] = teclado.nextDouble();
                System.out.println("Informe a segunda nota: ");
                nota2[posicao] = teclado.nextDouble();
                posicao++;
            }else{
                System.out.println("A lista est� totalmente preechida");
                }
            
            break;
        case "2":
            System.out.println("Informe o n�mero do cadastro do aluno");
            int pos = teclado.nextInt();
            if (pos >= 0 && pos < posicao){
               imprimir(pos);
            }else {
                System.out.println("Aluno n�o cadastrado");
            }break;
        case "3":
            imprimir(); 
           break;
           
        case "4":
            System.out.println("Encerrado");
            break;
            
        default:
            System.out.println("Op��o inv�lida");
            break;
            
        }
       }while(!opcao.equals("4"));
      teclado.close();
    }
    private static double media(int pos){
        return (nota1[pos] + nota2[pos])/2;
    }
    private static void imprimir(){
    System.out.println("resultado dos alunos");
    	for(int i = 0; i < posicao; i++) {
    		imprimir(i);
    	}
    }
    private static void imprimir(int pos){
        double mediaFinal = media(pos);
        System.out.printf("[%d] %s - %.2f - %2.f - %.2f -  %s%n", pos, nomes[pos], nota1[pos], nota2[pos], mediaFinal, situacao(mediaFinal));
    }
    private static String situacao(double media){
        if (media < 4 ){
        return "REPROVADO";
        }else if(media > 7){
        return "APROVADO";
        }else{
            return "PROVA FINAL";
        }
    }
}
