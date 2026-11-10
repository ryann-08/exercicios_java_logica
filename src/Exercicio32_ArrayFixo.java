import java.util.Scanner;

public class Exercicio32_ArrayFixo {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int[] valores = new int[8];

        for (int i = 0; i < valores.length; i++){
            System.out.println("Digite o " + (i + 1) + " Numero");
            valores[i] = entrada.nextInt();

        }
        int maior = valores[0];
        int menor = valores[0];

        for (int i = 1; i < valores.length; i++){
            if (valores[i] > maior){
                maior = valores[i];
            } else if (valores[i] < menor) {
                menor = valores[i];

            }

        } System.out.println("valor maior é " + maior + " e menor é " + menor);
    }
}
