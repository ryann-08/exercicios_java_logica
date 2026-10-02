import java.util.Scanner;

public class Exercicio4_emprestimo {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = entrada.nextInt();

        System.out.println("Digite seu salario; ");
        double salario = entrada.nextDouble();

        if (idade >= 21 && salario >= 2000){
            System.out.println("EMPRESTIMO APROVADO");
        }
        else {
            System.out.println("REPROVADO");
        }
        entrada.close();
    }
}
