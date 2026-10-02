import java.util.Scanner;

public class Exercicio19_MaiorPontucaoIFeFor {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite quantas rodadas: ");
        int rodadas = entrada.nextInt();

        int maiorPontuacao = 0;

        for (int i = 1; i <= rodadas; i++){
            System.out.println("Qual foi o ponto na rodada " + i);
            int pontos = entrada.nextInt();

            if (pontos > maiorPontuacao){
                maiorPontuacao = pontos;
            }
        }
        System.out.println("a Maior pontuação foi: " + maiorPontuacao);
    }
}
