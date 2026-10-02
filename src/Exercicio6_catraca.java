import java.util.Scanner;

public class Exercicio6_catraca {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a sua altura");
        double altura = entrada.nextDouble();


        if (altura < 1.40){
            System.out.println("Não pode passar");
        }
        else /*(altura >= 1.40)*/{   /*comentei pq nao é nescessario esse calculo, pq oq passou ja sabe que a altura é maior que 1,40*/
            System.out.println("Digite seu peso");
            double peso = entrada.nextDouble();

            if (peso <= 120){
                System.out.println("pode passar");
            }
            else {
                System.out.println("Não pode passar");
            }
        }

        entrada.close();
    }
}
