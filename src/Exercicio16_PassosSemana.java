import java.util.Scanner;

public class Exercicio16_PassosSemana {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int passos = 0;

        for (int i = 1; i <= 7; i++){
            System.out.println("Digite a quantidade de passos no: " + i + " dia");
            int dia = entrada.nextInt();

            passos = passos + dia;
        }
        System.out.println("A quantidade de passos andada foi: " + passos);
    }

}
