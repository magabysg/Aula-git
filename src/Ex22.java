import java.util.Scanner;

public class Ex22 {

    void main() {
        Scanner sc = new Scanner(System.in);


        double percentual1 = 0.03, percentual2 = 0.07, percentual3 = 0.12;
        double valor1 = 1000, valor2 = 5000;
        IO.println("\nInforme o valor da sua comissão desse mês no campo abaixo:");
        double comissao = sc.nextDouble();

        if (comissao < valor1) {
            IO.println("Valor total das vendas: R$" + comissao);
            IO.println("Valor do percentual: R$" + comissao / (percentual1 * 100));
            double total = comissao / (percentual1 * 100);
            IO.println("Valor total: R$" + (comissao - total));

        } else if (comissao >= valor1 && comissao <= valor2) {
            IO.println("Valor total das vendas: R$" + comissao);
            IO.println("Valor do percentual: R$" + comissao / (percentual2 * 100));
            double total2 = comissao / (percentual2 * 100);
            IO.println("Valor total: R$" + (comissao - total2));

        } else if (comissao > valor2) {
            IO.println("Valor total das vendas: R$" + comissao);
            IO.println("Valor do percentual: R$" + comissao / (percentual3 * 100));
            double total3 = comissao / (percentual3 * 100);
            IO.println("Valor total: R$" + (comissao - total3));
        }
    }
}