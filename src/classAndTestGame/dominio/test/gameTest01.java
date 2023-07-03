package classAndTestGame.dominio.test;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class gameTest01 {
    public static void main(String[] args) {
        PrintStream show = System.out;
        Scanner scan = new Scanner(System.in);
        Random gerador = new Random();

        int opcao;
        int escolha_computador;
        int escolha_usurario;

        show.println("Olá! Qual o seu nome?");
        String nome = scan.nextLine();
        show.println("Prazer em conhece-lô, " + nome + "!");
        show.println(nome + ", Gostaria de jogar?");
        show.println("\nInforme o número da opção \n 1 -> Para jogar / 2 -> Para não jogar");

        opcao = scan.nextInt();

        if (opcao == 2) {
            show.println("Que pena, fica para próxima");
        } else if (opcao == 1) {
            show.println("Ótimo, vamos jogar!");
            show.println("O jogo é o seguinte, vou escolher um número de 0 a 10");
            show.println("Mas não vou te falar qual é, e você vai tentando adivinhar");
            show.println("Se você acertar, é o campeão");

            escolha_computador = gerador.nextInt(11);

            show.println("Ok, " + nome + ". Já escolhi!");
            show.println("Tenta adivinhar");

            do {
                escolha_usurario = scan.nextInt();
                if (escolha_usurario != escolha_computador){
                    show.println("Resposta errada!");
                } else {
                    show.println("Parabéns, você acertou!");
                }
            } while (escolha_computador != escolha_usurario);

        }

    }
}
