import java.util.Scanner;

public class Exercicio18_ContadorDePontos {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite quantas rodadas voce jogou: ");
        int rodadas = entrada.nextInt();

        int resultado = 0;

        for (int i = 1; i <= rodadas; i++){
            System.out.println("Digite quantos pontos voce fez na " + i + " rodada");
            int pontos = entrada.nextInt();

            resultado = resultado + pontos;
        }
        System.out.println("A quantidade de pontos em todas as rodadas ficou em: " + resultado);

    }
}
