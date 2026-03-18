import java.util.Scanner;

public class Ex02 {

    void main(){

        Scanner sc = new Scanner(System.in);

        IO.println("Para fazer seu pedido, primeiro preencha as informações:\n");
        IO.println("Nome do Cliente:");
        String cliente = sc.nextLine();

        IO.println("Prato escolhido:");
        String prato = sc.nextLine();

        IO.println("Valor do prato escolhido:");
        double valor = sc.nextDouble();

        IO.println("      Segue as informações do seu pedido abaixo:      \n");
        IO.println("Nome do Cliente: " + cliente);
        IO.println("Prato escolhido: " + prato);
        IO.println("Valor a pagar: R$"+ valor);

        IO.println("\n      Seu pedido foi realizado com sucesso!      ");

    }
}
