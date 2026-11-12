import java.util.ArrayList;

public class Exercicio41_ArrayList {
    static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();

        tarefas.add("bom dia");
        tarefas.add("boa tarde");
        tarefas.add("boa noite");

        //.contains, busca na lista exatamente o nome pedido
        //automaticamente ele ja é um boolean
        //se encontra é true se nao encontra é false
        if (tarefas.contains("bom dia")){
            System.out.println("Encontrei a tarefa 'bom dia' esta na lista");

            //.indexOf busca a posicao exata na lista, mas pelo nome igual contains
            int posicao = tarefas.indexOf("bom dia");
            System.out.println("ela esta na posicao: " + (posicao + 1));
        }
    }
}
