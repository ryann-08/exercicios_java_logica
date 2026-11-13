import java.util.ArrayList;
import java.util.Stack;

public class Exercicio46_Stack {
    static void main(String[] args) {
        Stack<String> paginas = new Stack<>();

        paginas.push("home.com");
        paginas.push("produtos");
        paginas.push("carrinho.com");
        paginas.push("Checkout.com");

        System.out.println("o ultimo site a ser logado foi: " + paginas.peek());

        paginas.pop();
        String ultimaRemocao = paginas.pop();

        //apos os dois "voltars" = dois pop
        //quem vai aparcer na tela

        System.out.println("apos clicar em voltar 2x voltou para a tela: " + paginas.peek());

        if (!paginas.isEmpty()){
            System.out.println("ainda a paginas");
        }else {
            System.out.println("nao a mais paginas");
        }
    }
}
