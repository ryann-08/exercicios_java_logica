import java.util.ArrayList;

public class Exercicio39_ArrayList {
    static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();

        tarefas.add("estudar");
        tarefas.add("trabalhar");
        tarefas.add("aproveitar");
        tarefas.add("viajar");
        tarefas.add("fazer esportes");


        String tarefaRemovida = tarefas.remove(3);

        for (int i = 0; i < tarefas.size(); i++){
            System.out.println("tarefas atualizadas: " + (i + 1) + " Tarefa: " + tarefas.get(i));
        }
        System.out.println("\nA tarefa excluida foi: " + tarefaRemovida);
    }
}
