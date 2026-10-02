import java.util.Scanner;

public class Exercicio11_EntendendoFor2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero para ver todos ate ele: ");
        int numero = entrada.nextInt();


        //aqui eu determinei que "i" comecava em 1, enquanto fosse menor que o numero que o usuario digitou, ele continuava no loop
        for (int i = 1; i < numero; i++){
            System.out.println(i);
            //como eu nao coloquei "<=" e so coloquei "<" ele para um numero antes
        }

        //como isso vem depois do loop eu apenos mostro o ultimo numero que é exatamente o que o usuario digitou
        System.out.println("E pot fim esse foi o numero que vc digitou: " + numero);
    }
}
