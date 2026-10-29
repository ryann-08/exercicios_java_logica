//importando o array a nossa lista dinamica
import java.util.ArrayList;

public class Exercicio29_ArrayList {
    static void main(String[] args) {

        // aqui estamos instanciando (criando) o objeto ArrayList
        //do tipo integer, (INT)
        ArrayList<Integer> ranking = new ArrayList<>();

        //adicionando os valores na lista
        //nessa sequencia de cima para baixo
        ranking.add(1500);
        ranking.add(2800);
        ranking.add(4200);

        //um laco que vai rodar a quantidade de vezes ate chegae o tamanho da lista
        //essa lista tem apenas 3 como tamanho
        //quem sabe isso é o .size(), ele confere o tamanho da lista
        for (int i = 0; i < ranking.size(); i++){
            //e aqui o .get(i) vai pegando de valor em valor
            System.out.println(" O Ranking: " + (i+1) + " Tem um valor de: " + ranking.get(i));
        }
    }
}
