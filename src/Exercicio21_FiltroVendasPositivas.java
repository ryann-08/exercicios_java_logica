import java.util.Scanner;

public class Exercicio21_FiltroVendasPositivas {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quantidade de vendas no dia: ");
        int quantidade = entrada.nextInt();

        int totalFaturado = 0;

        for (int i = 1; i <= quantidade; i++){
            System.out.println("Digite o valor da " + i + " Venda");
            int venda = entrada.nextInt();

            if (venda > 0){
                totalFaturado = totalFaturado + venda;
            }
        }
        System.out.println("Valor final faturado de todas as vendas ficou em: " + totalFaturado);

    }
}
