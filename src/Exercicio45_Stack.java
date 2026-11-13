import java.util.Stack;

public class Exercicio45_Stack {
    static void main(String[] args) {
        Stack<String> caixa = new Stack<>();

        caixa.push("Caixa de sapato");
        caixa.push("Caixa de livros");
        caixa.push("Caixa de eletrinicos");

        System.out.println("a ultima caixa a ser adicionada foi: " + caixa.peek());

        String removida = caixa.pop();

        System.out.println("uma empilhadeira removeu a: " + removida);

        if (!caixa.isEmpty()){
            System.out.println("ainda a caixas a desempilhar");

            System.out.println("a qauntidades de caixas que restaram foi: " + caixa.size());
        }else {
            System.out.println("Nao a mais caixa a desempilhar");
        }
    }
}
