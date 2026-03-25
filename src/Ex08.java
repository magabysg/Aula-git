import java.util.Scanner;

public class Ex08 {

    void main() {

        Scanner sc = new Scanner(System.in);

        int maiorI = 18;
        int menorI = 17;

        IO.println("\nSomente maiores de idade podem entrar.");
        IO.println("Informe sua idade:");
        int idade = sc.nextInt();

        if (idade >= maiorI) {
            IO.println("Entrada liberada! Aproveite a festa!");

        } else if (idade <= menorI) {
            IO.println("Acesso negado!");

        }
    }
}