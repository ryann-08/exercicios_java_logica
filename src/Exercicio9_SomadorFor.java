import java.util.Scanner;

public class Exercicio9_SomadorFor {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero parta saber oa soma até ele: ");
        int numero = entrada.nextInt();

        int soma = 0;
        for (int i = 1; i <= numero; i++){
            soma = soma + i;
        }
        System.out.println(" a soma de 1 ate " + numero + " é: " + soma);
    }
}
