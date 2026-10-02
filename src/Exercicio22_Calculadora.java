import java.util.Scanner;

public class Exercicio22_Calculadora {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        double resultado = 0;
        boolean operacaoValida = true;

        System.out.println("Digite o primeiro numero: ");
        double numero1 = entrada.nextDouble();

        entrada.nextLine();

        System.out.println("Digite qual operação voce quer fazer (+,-,*,/,%) ");
        String operacao = entrada.nextLine();

        System.out.println("Digite o segundo numero: ");
        double numero2 = entrada.nextDouble();

        if (operacao.equals("+")){
            resultado = numero1 + numero2;
        }
        else if (operacao.equals("-")) {
            resultado = numero1 - numero2;
        }
        else if (operacao.equals("*")) {
            resultado = numero1 * numero2;
        }
        else if (operacao.equals("/")) {
            if (numero2 != 0) {
                resultado = numero1 / numero2;
            } else {
                System.out.println("Não é possivel dividir numero por zero: ");
                operacaoValida = false;
            }
        }
        else {
            System.out.println("Operação invalida! ");
            operacaoValida = false;
        }
        if(operacaoValida){
            System.out.println("resultado final é: " + resultado);
        }
    }
}
