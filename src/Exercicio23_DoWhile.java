import java.util.Scanner;

public class Exercicio23_DoWhile {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        double nota;

        do {
            System.out.println("Digite uma nota de 0 a 5 para esse genero");
            nota = entrada.nextDouble();
            if (nota < 0 || nota > 5){
                System.out.println("Nota invalida! digite outra nota: ");
            }
        }while (nota < 0 || nota > 5);

        System.out.println("A nota digitada foi: " + nota);


    }
}
