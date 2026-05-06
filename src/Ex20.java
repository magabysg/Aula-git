import java.util.Scanner;

public class Ex20 {

    void main() {
        Scanner sc = new Scanner(System.in);

        double valor1 = 100, valor2 = 500;
        double cashback1 = 0.02, cashback2 = 0.05, cashback3 = 0.10;

        IO.println("\nInforme o valor da sua compra:");
        double compra = sc.nextDouble();

        if (compra == valor1) {
            IO.println("Você recebeu 2% de cashback! " +
                    "\nValor do cashback: " + "R$" + compra / (cashback1 * 100));

        } else if (compra > valor1 && compra <= valor2) {
            IO.println("Você recebeu 5% de cashback! " +
                    "\nValor do cashback: " + "R$" + compra / (cashback2 * 100));

        } else if (compra > valor2) {
            IO.println("Você recebeu 10% de cashback! " +
                    "\nValor do cashback: " + "R$" + compra / (cashback3 * 100));

        } else {
            IO.println("Sem cashback!");
        }
    }
}