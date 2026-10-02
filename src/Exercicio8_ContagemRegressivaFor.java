import java.util.Scanner;

public class Exercicio8_ContagemRegressivaFor {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero para ver a contagem regressiva");
        int numero = entrada.nextInt();

        for(int i = numero; i>=0; i--){
            System.out.println(i);
        }
        System.out.println("DECOLAR!!!");
        entrada.close();
    }
}
