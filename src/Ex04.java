import java.util.Scanner;

public class Ex04 {

    void main() {

        Scanner sc = new Scanner(System.in);

        int meta = 10000;

        IO.println("Quantos passos você deu hoje?");
        int passos = sc.nextInt();

        if (passos == meta) {
            IO.println("Sua meta foi atingida!");

        } else if (passos > meta) {
            IO.println("Você ultrapassou sua meta!");
            IO.println("Você deu: " + (passos - meta) + " a mais que a quantidade estabelecida!");

        } else if (passos < meta) {
            IO.println("Você não atingiu a meta estabelecida!");
            IO.println("Faltaram " + (meta - passos));

        }
    }
}