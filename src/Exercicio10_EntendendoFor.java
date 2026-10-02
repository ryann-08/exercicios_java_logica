import java.util.Scanner;

public class Exercicio10_EntendendoFor {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite quantas vezes vc quer ver a frase  (hello word) se repetindo: ");
        int numero = entrada.nextInt();
        //aqui acima, eu peço para o usuario, e salvo na variavel NUMERO



        //ja aqui eu digo que o "contador" no caso chamado de "i" comeca em 1,
        // e enquanto for menor ou igual a quantidade que o usuario digitou ele contianua no loop
        for (int i = 1; i <= numero; i++){
            System.out.println("hello word");
        }
        //e por fim para ter certeza que deu certo, fora do loop eu coloco um fim so para ver se deu a quantidade esperada
        System.out.println("fim");
    }
}
