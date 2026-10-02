import java.util.Scanner;

public class Exercicio20_MenorPreco {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite quantas lojas voce consultou: ");
        int quantLojas = entrada.nextInt();

        //aqui uma variavel com numero alto so pra saber oq o usuario vai digitar na primeira nota
        //ex: usuario digitou 1000 esse tando de 9 aqui vai se tornar 1000
        int menorPreco = 999999999;

        //aqui nos perguntamos ao usuario o valor de cada loja
        for (int i = 1; i <= quantLojas; i++){
            System.out.println("Digite o valor da " + i + " Loja");
            int valorLoja = entrada.nextInt();

            //como eu disse la em cima vamos supor que ele digitou 1000, e agora a variavel menorPreco esta valendo 1000
            //ai na segunda loja que é a variavel valorLoja, ele digita 800
            //800 é menor que 100 entao a variavel valorLoja vale 800
            if (valorLoja < menorPreco){
                menorPreco = valorLoja;
                //com a variavel valorLoja valendo 800, a gente manda para a variavel menorPreco
                //entao agora a variavel menorPreco vai valer 800
            }
        }
        System.out.println("o menor preço foi: " + menorPreco);
    }
}
