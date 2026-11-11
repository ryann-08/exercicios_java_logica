public class Exercicio36_ArrayFixo {
    public static void main(String[] args){

        int[] numeros = {15, 8, 32, 4, 21, 10, 45, 3};

        int maior = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++){
            if (maior < numeros[i]){
                maior = numeros[i];
            } else if (menor > numeros[i]) {
                menor = numeros[i];
            }
        }
        System.out.println(" O maior numero é: " + maior + "\nJa o menor é: " + menor);
    }
}
