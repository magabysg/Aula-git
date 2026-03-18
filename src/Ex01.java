import java.util.Scanner;

public class Ex01 {

    void main(){

        Scanner sc = new Scanner(System.in);

        IO.println("Para realizae seu cadastro, digite suas informações abaixo: \n");
        IO.println("Nome do aluno(a):");
        String nome = sc.nextLine();

        IO.println("Curso que o Aluno(a) está matriculado:");
        String curso = sc.nextLine();

        IO.println("Informe a idade do Aluno(a):");
        int idade = sc.nextInt();

        IO.println("         Verifique sua informações do Aluno(a)         \n");
        IO.println("Nome: " + nome);
        IO.println("Curso: " + curso);
        IO.println("Idade: " + idade);

    }
}