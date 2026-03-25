import java.util.Scanner;

public class Ex10 {

    void main(){

        Scanner sc = new Scanner(System.in);

        int livro = 300;

        IO.println("\nQuantas páginas do seu livro você já leu?");
        double paginas = sc.nextDouble();

        if (paginas == livro) {
            IO.println("Você leu 100% do seu livro!!");

        } else if (paginas < livro) {
            double percentual = (paginas / livro * 100);
            IO.println("Você leu " + percentual + "% dos seu livro!");
        }
    }
}
