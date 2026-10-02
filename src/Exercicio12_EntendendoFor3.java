import java.util.Scanner;

public class Exercicio12_EntendendoFor3 {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.println("digite um numero: ");
        numero = entrada.nextInt();

        for (int i = 0; i < numero; i = i + 2){
            System.out.println(i);
        }
        System.out.println("E pot fim esse foi o numero que vc digitou: " + numero);
    }
}
