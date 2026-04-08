import java.util.Scanner;

public class Ex12 {

    void main(){

        Scanner sc = new Scanner(System.in);

        IO.println("\nInforme o total de aulas do seu curso e o total de aulas que o aluno(a) já assistiu:");
        double curso = sc.nextDouble();
        IO.println("Total de aulas: " + curso);
        double aulas = sc.nextDouble();
        IO.println("Total de aulas assistidas: " + aulas);

        if (aulas == curso) {
            IO.println("\nVocê concluiu o seu curso! 100% do curso completo.");

        } else if (aulas < curso) {
            double percentual = (aulas / curso * 100);
            IO.println("\nVocê concluiu " + percentual + "% do curso.");

            if (percentual < 50) {
                IO.println("\nVocê ainda está no começo do curso.");

            } else if (percentual >= 50 && percentual < 100) {
                IO.println("\nVocê está avançando bem!");

            }
        }
    }
}
