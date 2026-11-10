import java.util.Scanner;

public class Exercicio31_ArrayFixo {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int[] valores = new int[5];
        int valorFinal = 0;

        for(int  i = 0; i < valores.length; i++){
            System.out.println("Digite o " + (i + 1) + " Numero");
            valores[i] = entrada.nextInt();

            valorFinal = valorFinal + valores[i];

        }
        System.out.println("o valor somado foi: " + valorFinal);
    }
}
