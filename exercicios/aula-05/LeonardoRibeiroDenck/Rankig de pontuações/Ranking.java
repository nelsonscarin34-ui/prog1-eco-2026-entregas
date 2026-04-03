public class Ranking{
    public static void main(String[] args){
        Jogador[] jogadores = new Jogador[5];
        jogadores[0] = new Jogador();
        jogadores[0].nome = "leoandro";
        jogadores[0].pontos = 60;
        jogadores[1] = new Jogador();
        jogadores[1].nome = "Jorge";
        jogadores[1].pontos = 80;
        jogadores[2] = new Jogador();
        jogadores[2].nome = "Kaike";
        jogadores[2].pontos = 47;
        jogadores[3] = new Jogador();
        jogadores[3].nome = "Pedro";
        jogadores[3].pontos = 84;
        jogadores[4] = new Jogador();
        jogadores[4].nome = "Marcelo";
        Jogador campeao = jogadores[0];
        for(int i = 1; i < jogadores.length; i++){
            if(jogadores[i].pontos > campeao.pontos){
                campeao = jogadores[i];
            }
        }
        System.out.println("O competidor " + campeao.nome + 
        " foi o campeao com " + campeao.pontos + " pontos");
    }
}