public class Exercicio35_ArrayFixo {
    static void main(String[] args) {

        int[] numeros = {4, 7, 2, 4, 9, 4, 7, 5};

        int procurado = 4;

        int quantidade = 0;

        for (int i = 0; i < numeros.length; i++){
            if (procurado == numeros[i]){
                quantidade++;
            }
        }
        System.out.println("a quantidade de proucurados foi: " + quantidade);
    }
}
