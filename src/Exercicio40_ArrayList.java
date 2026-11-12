import java.util.ArrayList;

public class Exercicio40_ArrayList {
    static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();

        tarefas.add("acordar");
        tarefas.add("levantar");
        tarefas.add("tomar cafe");
        tarefas.add("ir trabalhar");
        tarefas.add("voltar do trabalho");
        tarefas.add("Descansar");

        tarefas.remove(1);

        //aqui usamos (for each)
        //fas literalmete a mesma coisa que (int i = 0; i < tarefas.size(); i++)
        for (String tarefasAtualizadas : tarefas){
            System.out.println("- " + tarefasAtualizadas);
        }
    }
}
