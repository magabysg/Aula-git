import java.util.Scanner;

public class Ex16 {

    void main(){
        Scanner sc = new Scanner(System.in);

        double limite = 240;
        IO.println("\nQuantas horas (digite em minutos) o usuario utilizou o celular?");
        double horas = sc.nextDouble();
        double percentual = ((horas / limite) * 100);
        double mais = (horas - limite);

        if (horas <= limite) {
            IO.println("Continue respeitando seu limite diario! Percentual: " + percentual + "%");

        } else if (horas > limite) {
            IO.println("Limite ultrapassado! Minutos a mais: " + mais + ". Percentual: " + percentual + "%");
        }
    }
}
