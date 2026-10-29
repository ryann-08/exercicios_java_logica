//primeira coisa avisar ao java, onde buscar a ferramenta de lista dinamica o (ArrayList)
import java.util.ArrayList;

public class Exercicio28_ArrayList {
    static void main(String[] args) {

        //criacao da lista dinamica com o new
        //o <String> diz que essa lista so vai guardar apenas texto
        //OBS: se quiser uma lista que aceita numero tem que colocar <Integer> que é a mesma coisa que (int)
        //ou <Double> com d maiusculo, aqui nao sao tipos primitivgos, sao objetos por isso a letra maiusculo
        //e um terceiro caso que aceita int e doube voce coloca <Number>, aqui aceita dois tipos de numeros
        ArrayList<String> inventario = new ArrayList<>();

        //o comando .add(), adicionas novos elementos no final da lista, automaticamente a lista vai crescendo
        inventario.add("espada de ferro");
        inventario.add("poção de cura");
        inventario.add("Escudo de madeira");

        //o metodo .get(0) vai na gaveta 0 da lista e puxa de la o texto
        System.out.println("Item na mão: " + inventario.get(0));

        //o size() calcula quantos elementos existem atualmente na lista
        //neste caso ele retorna 3, a quantidade de itens adicionados
        System.out.println("Total de itens na mochila: " + inventario.size());

        System.out.println("\n---ITENS NA MOCHILA---");

        //o loop roda ate a quantidade do inventario, que esta denominada pelo size
        for (int i = 0; i < inventario.size(); i++){

            //e o get aqui busca pelo indice, na primeira volta esta como 0, entao ele vai no primeiro elemento
            // na segunda ele fica como 1 entao vai no segundo elemento, e assim por diante
            System.out.println("Posição " + i + " -> " + inventario.get(i));
        }
    }
    //OBS: o get busca algo e o size mede o tamanho
}

