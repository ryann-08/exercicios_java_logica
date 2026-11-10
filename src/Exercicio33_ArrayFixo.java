import java.util.Scanner;

public class Exercicio33_ArrayFixo {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[6];

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite o " + (i + 1) + " Numero");
            numeros[i] = entrada.nextInt();

        }
        for(int i = numeros.length; i >= 0; i--){
            System.out.println("Resultado invertido " + numeros[i]);
        }
    }
}
