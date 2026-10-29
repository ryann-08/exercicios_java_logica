public class Exercicio26_ArrayFixo {
    static void main(String[] args) {
        double[] precos = new double[5];

        precos[0] = 15.50;
        precos[1] = 40.00;
        precos[2] = 10.00;
        precos[3] = 125.75;
        precos[4] = 5.25;

        for(int i = 0; i < precos.length; i++){
            System.out.println("Poção: " +(i + 1)+ " custa: " +precos[i]+ " R$");
        }
    }
}
