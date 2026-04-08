import java.util.Scanner;

public class Ex13 {

    void main() {

        Scanner sc = new Scanner(System.in);

        double limite = 20000;
        IO.println("\nSeu limite de internet: 20GB.\n");
        IO.println("Quanto você já usou do seu pacote de internet?");
        double usado = sc.nextDouble();

        double you = usado / limite * 100;

        if (you > 100) {
            IO.println("Limite excedido! " + you + "%");
        } else if (you >= 80 & you <= 100) {
            IO.println("Atenção! Você está próximo do limite! " + you + "%");
        } else if (you < 80) {
            IO.println("Uso dentro do limite. " + you + "%");
        }
    }
}