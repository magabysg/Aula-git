import java.awt.image.ImagingOpException;
import java.util.Scanner;

public class Ex14 {

    void main(){
        Scanner sc = new Scanner(System.in);

        double meta = 5000;
        IO.println("\nQual foi o valor do faturamento:");
        double faturamento = sc.nextDouble();
        double calculo = ((faturamento / meta) * 100);

        if (faturamento < meta) {
            IO.println("Infelismente a meta não foi atingida, faltou " + (meta - faturamento) + ". Percentual: " + calculo + "%");

        } else if (faturamento == meta) {
            IO.println("A meta foi atingida! Percentual: " + calculo);

        } else if (faturamento > meta) {
            IO.println("Meta ultrapassada!! Valor a mais: " + (faturamento - meta) + ". Percentual: " + calculo + "%");
        }
    }
}
