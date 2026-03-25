import java.util.Scanner;

public class Ex09 {

    void main(){

        Scanner sc = new Scanner(System.in);

        int frete = 100;

        IO.println("\nValor dos seus produtos:");
        int produto1 = sc.nextInt();
        int produto2 = sc.nextInt();

        if (produto1 + produto2 >= frete) {
            IO.println("Você adquiriu frete grátis em sua compra!");
            IO.println("Valor da sua compra: R$" + (produto1 + produto2));

        } else if (produto1 + produto2 < frete) {
            IO.println("Adicione mais produtos no seu carrinho para pegar seu frete grátis!");
            IO.println("Valor da sua compra: R$" + (produto1 + produto2));

        }
    }
}