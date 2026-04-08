import java.util.Scanner;

public class Ex15 {

    void main(){
        Scanner sc = new Scanner(System.in);

        double limite = 2000;
        IO.println("\nQuantas calorias foram consumidas?");
        double calorias = sc.nextDouble();
        double percentual = ((calorias / limite) * 100);
        double mais = (calorias - limite);

        if (calorias <= limite) {
            IO.println("Você está dentro do limite! Percentual: " + percentual + "%");

        } else if (calorias > limite) {
            IO.println("Você ultrapassou o limite de calorias diario, " + mais + " calorias a mais. Percentual: " + percentual + "%");

        }
    }
}
