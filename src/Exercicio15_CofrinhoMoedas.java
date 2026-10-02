import java.util.Scanner;

public class Exercicio15_CofrinhoMoedas {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int resultado = 0;

        for(int i = 1; i <= 5; i++){
            System.out.println("Digite o valor guardado no " + i + " dia");
            int dia = entrada.nextInt();

            resultado = resultado + dia;
        }
        System.out.println("A soma de cada dia você guardou: " + resultado);
    }
}
/*só para entender, a variavel resultado comeca em zero pq a cada nota que vai ser guardada na
* variavel dia ela é momentanea, EX: dia 1 = 10 reais -- isso por enquanto esta salvo na variavel dia
* ai o usuario digita o dia 2 EX: dia 2 = 6 reais -- o "10" que estava some e agora fica o 6
* por isso que é resultado = resultado + dia; para guardar todos os dias.*/