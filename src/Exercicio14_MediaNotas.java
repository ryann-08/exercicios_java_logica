import java.util.Scanner;

public class Exercicio14_MediaNotas {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i <= 4; i++){  /*Aqui eu faco a pergunta no loop, entao essa pergunta vai se repetir 4vezes*/
            System.out.println("Digite a nota, para saber a media: ");
            int nota = entrada.nextInt(); /* aqui salvo as notas na variavel "nota */
            soma = soma + nota; /*soma começa em 0, entao toda nota que o usiario digita é salvo na variavel soma*/
        }
        int resultado = soma / 4;
        System.out.println("A soma de todas as notas foi: " + soma);
        System.out.println("A media das quatro notas é: " + resultado);
    }
}
