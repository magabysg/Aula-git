import java.util.Scanner;

public class EX07 {

    void main(){

        Scanner sc = new Scanner(System.in);

        IO.println("\nInforme as notas do Aluno(a):");
        int nota1 = sc.nextInt();
        int nota2 = sc.nextInt();
        int nota3 = sc.nextInt();

        int divisor = 3;  int media = 7;
        if ((nota1 + nota2 + nota3) / divisor >= media) {
            IO.println("O Aluno(a) foi aprovado(a)!");
            IO.println("Média do estudante: " + (nota1 + nota2 + nota3) / divisor);

        } else if ((nota1 + nota2 + nota3) / divisor < media) {
            IO.println("O Aluno(a) foi reprovado(a)!");
            IO.println("Média do estudante: " + (nota1 + nota2 + nota3) / divisor);

        }
    }
}