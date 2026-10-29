import java.util.ArrayList;

public class Exercicio30_ArrayList {
    static void main(String[] args) {
        ArrayList<String> bau = new ArrayList<>();

        bau.add("Espada");
        bau.add("Escudo");
        bau.add("Poção");
        bau.add("Adaga");

        //com o size nos mostramos o tamanho da lista
        System.out.println("O tamanho do bau é de: " + bau.size() + " Componentes ");

        //com o .remove, estamos removendo o segundo da lista, apagando ele
        //e salvando ele na variavel itemremovido
        //obs se tiver que remover bastanmte coisa tem outros metodos melhores aqui é so um exemplo
        String itemRemovido = bau.remove(1);

        //com um item removido da lista, nos falamos o tamanho dela atualizada
        System.out.println("O tamanho do bau atualizado é: " + bau.size() + " Componentes");

        //aqui falamos os componentes atualizado sem o segundo item
        for (int i = 0; i < bau.size(); i++){
            System.out.println(" Componente: " + (i + 1) + " Tem: " + bau.get(i));
        }
        // e aqui iremos mostrar o que nos removemos
        System.out.println("Eliminamos o componente: " + itemRemovido);
    }
}
