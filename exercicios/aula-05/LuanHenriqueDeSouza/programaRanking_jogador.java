import java.util.Scanner;

public class programaRanking_jogador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        jogador[] jogadores = new jogador[5];

        for (int i = 0; i < jogadores.length; i++) {
            jogadores[i] = new jogador();
            System.out.println("Digite o nome do jogador " + (i + 1) + ": ");
            jogadores[i].nome = teclado.nextLine();

            System.out.println("Digite a pontuação: ");
            jogadores[i].pontuacao = teclado.nextInt();
            teclado.nextLine();

        }

        jogador campeao = jogadores[0];

        for (int i = 1; i < jogadores.length; i++) {
            if (jogadores[i].pontuacao > campeao.pontuacao) {
                campeao = jogadores[i];
            }
        }
        System.out.println("Campeão: " + campeao.nome);
        System.out.println("Pontuação: " + campeao.pontuacao);

        teclado.close();
    }
}