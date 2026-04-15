import java.util.Scanner;

public class Ex18 {

    void main(){
        Scanner sc = new Scanner(System.in);

        int pro = 100;
        int ruim = 50;
        IO.println("\nJogador informe a sua pontuação:");
        int pontos = sc.nextInt();

        if (pontos < ruim) {
            IO.println("Sua classificação é: RUIM.");

        } else if (pontos >= ruim && pontos <= pro) {
            IO.println("Sua classificação é: MÉDIO.");

        } else if (pontos > pro) {
            IO.println("Sua classificação é: PRO.");
        }
    }
}
