import java.util.Scanner;

public class candidato_votacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        candidato[] candidatos = new candidato[2];

        candidatos[0] = new candidato();
        candidatos[0].nome = "Lucas";
        candidatos[1] = new candidato();
        candidatos[1].nome = "Ana";

        int voto;
        System.out.println("5 votos disponíveis \n");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println(i + " - " + candidatos[i].nome);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite seu voto (" + (i + 1) + "/5)");
            voto = teclado.nextInt();

            if (voto >= 0 && voto < candidatos.length) {
                candidatos[voto].votar();
                System.out.println("Voto registrado");
            } else {
                System.out.println("Voto inválido");
                i--;
            }
        }
        System.out.println("\nResultado: \n");
        int maior = 0;
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println(candidatos[i].nome + ": " + candidatos[i].votos + " votos");

            if (candidatos[i].votos > candidatos[maior].votos) {
                maior = i;
            }
        }
        System.out.println("\n Vencedor: " + candidatos[maior].nome);
        teclado.close();
    }
}
