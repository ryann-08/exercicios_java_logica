public class Exercicio25_ArrayFixo {
    public static void main(String[] args){
        //aqui estou declarando que o tamanho da lista é de 4 componentes
        int[] vidas = new int[4];

        //aqui dando valor a cada componente, ex na casa 0 o valor guardado é 3, e assim por diante
        vidas[0] = 3;
        vidas[1] = 5;
        vidas[2] = 1;
        vidas[3] = 2;

        //criando um laco de repetição, usando o length que ele busca o tamanho la no new[4]
        for (int i = 0; i < vidas.length; i++){

            //aqui tem um detalhe, coloco (i + 1), inves de ele falar jogador 0 ele sempre fala um numero acima
            System.out.println("o jogador: " + (i + 1) + " tem: " + vidas[i] + " vidas");
        }

    }
}
