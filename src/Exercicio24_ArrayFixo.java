public class Exercicio24_ArrayFixo {
    public static void main(String[] args){
        // Criando um vetor fixo com capacidade exato para 3 pontuacoes
        int[] recordes = new int[3];

        //guardandovalores na gaveta
        recordes[0] = 100;
        recordes[1] = 250;
        recordes[2] = 400;

        //imprimindo um valor especifico pelo indice
        System.out.println("Primeiro recorde: " + recordes[0]);

        //percorrer o vetor fixo com o for tradicional
        System.out.println("\n ---TODOS OS RECORDES---");
        for (int i = 0; i < recordes.length; i++){
            System.out.println("Posição " + i + "-> Valor: " + recordes[i]);
        }
    }
}
