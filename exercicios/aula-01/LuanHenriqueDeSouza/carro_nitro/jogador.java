public class jogador {
    String modelo;
    int velocidade = 100;
    int nivelNitro = 100;

    void usarNitro() {
        if (nivelNitro > 0) {
            System.out.println("Nitro ativado!");
            nivelNitro -= 20;
            System.out.println("Nível do nitro atual: " + nivelNitro);
        } else {
            System.out.println("O nitro acabou!");
        }
    }
}
