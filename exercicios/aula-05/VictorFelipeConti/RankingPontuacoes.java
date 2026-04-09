
public class RankingPontuacoes {
    public static void main(String[] args) {
        Jogador[] jogadores = new Jogador[4];

        jogadores[0] = new Jogador();
        jogadores[0].nome = "Victor";
        jogadores[0].pontuacao = 200;
        
        jogadores[1] = new Jogador();
        jogadores[1].nome = "Jorge";
        jogadores[1].pontuacao = 120;

        jogadores[2] = new Jogador();
        jogadores[2].nome = "Erick";
        jogadores[2].pontuacao = 100;

        jogadores[3] = new Jogador();
        jogadores[3].nome = "Pedro";
        jogadores[3].pontuacao = 80;

        Jogador campeao = jogadores[0];

        for (int i = 1; i < jogadores.length; i++ ) {
            if (jogadores[i].pontuacao > campeao.pontuacao) {
                campeao = jogadores[i];
            }
        }

        System.out.println("Campeão: " + campeao.nome
                + " com " + campeao.pontuacao + " pontos.");
    }
}
