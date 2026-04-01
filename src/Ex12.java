package PACKAGE_NAME;

public class Ex12 {

  void main(){
        Scanner sc = new Scanner(System.in);

        IO.println("\nQuantas aulas seu curso tem e quantas você ja assistiu?");
        double aulas = sc.nextInt();
        IO.println("Aulas: " + aulas);
        double assistiu = sc.nextInt();
        IO.println("Assistidas: " + assistiu);

        double resultado = (assistiu / aulas * 100);

        if (resultado == 100) {
            IO.println("Parabéns! Curso concluído. " + resultado + "%");
        } else if (resultado >= 50 & resultado < 100) {
            IO.println("Você está avançando bem! " + resultado + "%");
        } else if (resultado < 50) {
            IO.println("Você ainda está no começo do curso." + resultado + "%");
        }
    }
}
