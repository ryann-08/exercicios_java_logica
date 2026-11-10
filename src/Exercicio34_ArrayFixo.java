import java.util.Scanner;

public class Exercicio34_ArrayFixo {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //aqui criamos um vetor com o tamanho de 8 numeros
        int[] numeros = new int[8];

        //aqui um laço de repeticao basico
        //para armazenar os numeros digitados em cada posicao
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite o " + (i + 1) + " numero");
            numeros[i] = entrada.nextInt();
        }

        //aqui esta o detalhe
        // criamos o j que comeca no ultimo numero digitado e o i nao primeiro
        // e tambem criamos uma variavelç auxiliar para ir armazenando os numeros
        //com isso o nosso vetor inverte, o resultado é o mesmo do exercicio 33
        //mas o detalhe e que la o vetor fica estatico e so mostra invertido
        // aqui nao, ele inberte o propio vetor
        for (int i = 0, j = numeros.length - 1; i < j; i++, j--){
            int auxiliar = numeros[i];
            numeros[i] = numeros[j];
            numeros[j] = auxiliar;

        }
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }


}
