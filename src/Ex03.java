import java.util.Scanner;

public class Ex03 {

    void main(){

        Scanner sc = new Scanner(System.in);

        IO.println("Para criar seu perfil precisamos de algumas informações:\n");
        IO.println("Adicione seu Nickname (Nome do jogador):");
        String nick = sc.nextLine();

        IO.println("Jogo favorito do usuário:");
        String jogo = sc.nextLine();

        IO.println("Pontuação atual do usuário");
        int pontos = sc.nextInt();

        IO.println("\n      Informações do Jogador      \n");
        IO.println("Nickname: " + nick);
        IO.println("Jogo favorito: " + jogo);
        IO.println("Pontuação atual: " + pontos);

    }
}
