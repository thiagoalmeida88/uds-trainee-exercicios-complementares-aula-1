package ex.cinco.sorteio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Integer entrada;
        Integer numeroSorteado;


        do {
            System.out.println("********************\n"
                    + "[1]Par\n"
                    + "[2]Ímpar\n"
                    + "********************\n"
                    + "Escolha uma opção: \n");

            entrada = scanner.nextInt();

            Jogada jogada = new Jogada(entrada);

            Pontuacao pontuacao = new Pontuacao();

            numeroSorteado = pontuacao.sortearNumero(jogada);

            pontuacao.adicionarJogada(jogada);

            Integer somaTotal = jogada.getPontuacao();


            System.out.println("Número sorteado: "+numeroSorteado+" Soma total: "+somaTotal);


        }while (entrada != -1);



    }
}
