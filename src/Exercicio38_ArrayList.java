import java.util.ArrayList;

public class Exercicio38_ArrayList {
    static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();

        tarefas.add("Estudar java");
        tarefas.add("Fazer trabalho faculdade");
        tarefas.add("Treinar logica");

        System.out.println("A quantidade de tarefas a fazer é: " + tarefas.size());
        System.out.println("a segunda tarefa a fazer é: " + tarefas.get(1));
    }
}
