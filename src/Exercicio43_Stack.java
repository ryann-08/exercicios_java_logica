import java.util.Stack;

public class Exercicio43_Stack {
    static void main(String[] args) {
        Stack<String> correcao = new Stack<>();

        correcao.push("Digitou a palavra 'java'");
        correcao.push("adicionou ponto final");
        correcao.push("Trocou de cor na letra");

        System.out.println("A ultima alteracao feita foi: " + correcao.peek());

        String remocao = correcao.pop();

        System.out.println("apertando ctrl+z iremos retirar o: " + remocao);

        if (!correcao.empty()){
            System.out.println("ainda a mais remocao a fazer, quantidade:  " + correcao.size());
        }else{
            System.out.println("nao a mais remocao a fazer");
        }
    }
}
