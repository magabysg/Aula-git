import java.util.Scanner;

public class Ex17 {

    void main(){
        Scanner sc = new Scanner(System.in);

        double bateria = 100;
        IO.println("Digite o prcentual da sua bateria:");
        double nivel = sc.nextDouble();
        double bateria2 = ((nivel / bateria) * 100);

        if (bateria2 < 20) {
            IO.println("Critico! " + bateria2 + "% de bateria");

        } else if (bateria2 >= 20 & bateria2 <= 80) {
            IO.println("Normal. " + bateria2 + "% de bateria");

        } else if (bateria2 > 80) {
            IO.println("Alto! " + bateria2 + "% de bateria");
        }
    }
}