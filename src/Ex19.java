import java.util.Scanner;

public class Ex19 {

    void main(){

        Scanner sc = new Scanner(System.in);

        int cinco = 5, oito = 8;
        IO.println("\nInforme a quantidade de sono dormida do usuario abaixo:");
        int sono = sc.nextInt();


        if (sono < cinco) {
            IO.println("Pessimo sono!");


        } else if (sono >= cinco && sono <= oito) {
            IO.println("Quantidade de sono ok!");


        } else if (sono > oito) {
            IO.println("Ótima quantidade de sono!");


        }
    }
}