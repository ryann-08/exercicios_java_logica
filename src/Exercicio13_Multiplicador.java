import java.util.Scanner;

public class Exercicio13_Multiplicador {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numeroBase = entrada.nextInt();

        System.out.println("Digite a quantidade de vezes: ");
        int numeroQuant = entrada.nextInt();


        int resultado = 1;

        for (int i = 1; i <= numeroQuant; i++){
            int resultadoAnterior = resultado;
            resultado = resultado * numeroBase;
            System.out.println(resultadoAnterior + " X " + numeroBase + " = " + resultado);

        }



    }
}
