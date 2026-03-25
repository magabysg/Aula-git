import java.util.Scanner;

public class Ex11 {

    void main(){

        Scanner sc = new Scanner(System.in);

        double gb = 2048;

        IO.println("\nFazendo download do seu arquivo:");
        double arquivo = sc.nextDouble();

        if (arquivo == gb) {
            IO.println("Finalizando download do seu arquivo aguarde.");

        } else if (arquivo < gb) {
            double percentual = (arquivo / gb * 100);
            IO.println("Seu arquivo está " + percentual + "% completo, aguarde até o download completo!");

        }
    }
}
