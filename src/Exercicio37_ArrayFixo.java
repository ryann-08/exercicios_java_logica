public class Exercicio37_ArrayFixo {
    public static void main(String[] args){

        int[] numeros = {12, 7, 5, 20, 33, 8, 14, 9};

        //declarando que as variaveis comecam é 0
        int quantPar = 0;
        int quantImpar = 0;

        int somaPar = 0;
        int somaImpar = 0;

        //laco de repeticao que passa por todos os indices do vetor
        for (int i = 0; i < numeros.length; i++){
            //se o numero dividido der resto 0 ele é par
            if (numeros[i] % 2 == 0){
                //acrecentamos ele na variavel par
                quantPar++;
                //pegamos esse numero (PAR) que veio, e somamos com a variavel
                //ex primeira rodada: soma par tem 0 + 12 (primeiro par que veio)
                //segunda rodada somaPar tem 12 + 20 (segundo par na sequencia do vetor)
                //ficando 32 na somaPar...
                somaPar = somaPar + numeros[i];
            }
            //mesma ideia aqui, so que com numeros impares
            if (numeros[i] % 2 != 0){
                quantImpar++;
                somaImpar = somaImpar + numeros[i];
            }
        }
        System.out.println("par " + quantPar + " imparens : " + quantImpar);
        System.out.println("A soma dos pares é: " + somaPar + "\nA soma dos impares é " + somaImpar);
    }
}
