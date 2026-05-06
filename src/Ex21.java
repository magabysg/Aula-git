import java.util.Scanner;

public class Ex21 {

    void main(){
        Scanner sc = new Scanner(System.in);

        double dinheiro1 = 50, dinheiro2 = 200;
        double descconto1 = 0.10, desconto2 = 0.20;

        IO.println("\nInforme o valor da sua compra abaixo:");
        double compra = sc.nextDouble();

        if (compra > dinheiro2) {
            double somaA = compra / desconto2 * 100;
            double total1 = compra - somaA;
            IO.println("Você recebeu 20% de desconto na sua compra! Aproveite!!");
            IO.println("Desconto: R$" + compra / (desconto2 * 100));
            IO.println("Valor final: " + total1);

        }else if (compra >=  dinheiro1 &&  compra <= dinheiro2) {
            double somaB = compra / descconto1 * 100;
            double total2 = compra - somaB;
            IO.println("Você recebeu 10% de desconto na sua compra! Aproveite!!");
            IO.println("Desconto: R$" + compra / (descconto1 * 100));
            IO.println("Valor final: " + total2);

        }else{
            IO.println("O valor da sua compra não exedeu o limite necessario para aplicação de desconto em sua compra!");
        }
    }
}