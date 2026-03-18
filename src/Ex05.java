import java.util.Scanner;

public class Ex05 {

    void main(){

        Scanner sc = new Scanner(System.in);

        double dinheiro = 500;

        IO.println("Você conseguiu atingir sua meta?");
        double rs = sc.nextDouble();

        if (rs >= dinheiro) {
            IO.println("Parabêns! Você conseguiu atingir sua meta!!");

        } else if (rs < dinheiro) {
            IO.println("\nInfelismente você não conseguiu atingir sua meta!\n");
            IO.println("Faltou R$" + (dinheiro - rs) + " para completar sua meta.");

        }
    }
}
