import java.util.Scanner;

public class Exercicio2_aprovacao {
   public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua nota: ");
        double nota = entrada.nextDouble();

        if (nota >= 7){
            System.out.println("APROVADO");
        }
        else if (nota >= 5){
           System.out.println("RECUPERAÇÃO");
       }
        else {
            System.out.println("REPROVADO");
        }
        entrada.close();
    }
}
