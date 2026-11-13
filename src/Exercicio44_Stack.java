import java.util.Stack;

public class Exercicio44_Stack {
    static void main(String[] args) {
        Stack<String> mochila = new Stack<>();

        mochila.push("espada");
        mochila.push("pocao de cura");
        mochila.push("escudo de ferro");

        System.out.println("o ultimo item a ser inserido na mochila foi: " + mochila.peek());

        String removido = mochila.pop();

        System.out.println("o jogador usou: " + removido + ", e foi retirado da mochila ");

        System.out.println("A quantidade de itens que restou na mochila é: " + mochila.size());

        if (!mochila.isEmpty()){
            System.out.println("ainda a itens a ser utilizado na mochila");
        }else{
            System.out.println("Nao a itens a ser utilizado na mochila");
        }
    }
}
