
import java.util.Scanner;

public class Exercicio7_TabuadaFor {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero para saber a tabuada dele: ");
        int numero = entrada.nextInt();

        //i = contador, mas no dia a dia usamos o i
        for (int i = 1; i<=10; i++){
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        entrada.close();
    }

}
