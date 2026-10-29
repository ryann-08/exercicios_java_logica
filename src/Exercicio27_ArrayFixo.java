public class Exercicio27_ArrayFixo {
    static void main(String[] args) {
        int[] ataques = new int[4];

        ataques[0] = 15;
        ataques[1] = 22;
        ataques[2] = 30;
        ataques[3] = 45;

        for(int i = 0; i < ataques.length; i++){
            System.out.println("o heroi " +(i+1)+ " tomou um buff, e seu ataque doubrou de: "
                    +ataques[i]+ " para: " + ataques[i] * 2 );
        }
    }
}
