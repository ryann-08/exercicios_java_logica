import java.util.Scanner;

public class Exercicio3_deconto {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double compra = entrada.nextDouble();

        System.out.println("Digite o valor de desconto: ");
        double desconto = entrada.nextDouble();

        if (desconto >= compra ){
            System. out.println("INVALIDO - valor de desconto maior ou igual a compra.");
        }
        else if (desconto <= 0 ){
            System.out.println("INVALIDO - valor de desconto menor ou igual a 0.");
        }
        else {
            double valorTotal = compra - desconto;
            System.out.println("tera que pagar " + valorTotal + "R$");
        }
        entrada.close();
    }
}
