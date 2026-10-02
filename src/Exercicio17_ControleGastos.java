import java.util.Scanner;

public class Exercicio17_ControleGastos {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite quantos produtos vc comprou:  ");
        int produtos = entrada.nextInt();

        int resultado = 0;

        for (int i = 1; i <= produtos; i++){
            System.out.println("Digite o valor do " + i + " produto");
            int produtosquant = entrada.nextInt();
            resultado = resultado + produtosquant;
        }
        System.out.println("valor final ficou em: " + resultado );
    }
}
