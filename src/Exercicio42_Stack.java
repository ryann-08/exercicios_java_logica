import java.util.Stack;

public class Exercicio42_Stack {
    static void main(String[] args) {
        Stack<String> historico = new Stack<>();

        //.push é igual o .add vai adicionar
        //so um detalhe que aqui, oq adiciona por ultimo sai primeiro
        //o ultimo a ser adicionado foi youtube
        historico.push("google.com");
        historico.push("github.com");
        historico.push("youtube.com");

        //.peek pega o ultimo acessado sempre
        System.out.println("O ultimo a entrar (acessado) foi: " + historico.peek());

        //.pop é igual o remove, literalmente remove da pilha
        //sempre remove o ultimo que entrou
        String removido = historico.pop();

        System.out.println("O site fechado foi: " + removido);

        //.peek pega sempre o ultimo que foi acessado e mostra na tela
        System.out.println("O atual site na tela agora é: " + historico.peek());

        //.isEmpty ele pergunta a pilha esta vazia?
        // se sim true, se nao estiver vazia false
        //por isso colocamos ! no comeco, para mudar a informacao
        //tinhamos 3 na pilha removemos 1 sobrou 2, entao ele iria dar false e cairia no else, mas o ! inverte isso
        if (!historico.isEmpty()){
            System.out.println("tem paginas para navegar ainda");
        }else {
            System.out.println("nao a mais paginas para navegar");
        }
    }
}
