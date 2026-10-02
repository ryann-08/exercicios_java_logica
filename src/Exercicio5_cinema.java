import java.util.Scanner;

public class Exercicio5_cinema {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = entrada.nextInt();

        System.out.println("Você é estudante? (1 - sim) (2 - não) ");
        int estudante = entrada.nextInt();

        if (idade >= 60 || estudante == 1){
            System.out.println("Você tem direito ao beneficio");
        }
        else {
            System.out.println("Você nao tem direito a beneficio");
        }

    }
}
