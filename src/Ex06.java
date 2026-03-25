import java.util.Scanner;

public class Ex06 {

    void main(){

        Scanner sc = new Scanner(System.in);

        int meta = 40;

        IO.println("\nInforme quantas horas você estudou esse mês:");
        int hora = sc.nextInt();

        if (hora == meta) {
            IO.println("Parabéns! Continue melhorando para alcançar novas metas!");

        } else if (hora > meta) {
            IO.println("Você ultrapassou sua meta!!\n");
            IO.println("Você fez " + (hora - meta) + " horas a mais que sua meta estabelecida!");

        } else if (hora < meta) {
            IO.println("Infelismente sua meta não foi atingida, continue se esforçando!\n");
            IO.println("Você fez " + (meta - hora) + " horas a menos que sua meta estabelecida!");
        }
    }
}