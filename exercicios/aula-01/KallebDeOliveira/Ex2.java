package entrega1;


 class Carro {
    String modelo;
    boolean ligado;
    boolean fantasma;

    void ligar() {
        ligado = true;
        if (fantasma) {
            System.out.println("Carro fantasma apareceu do nada!");
        } else {
            System.out.println("Carro ligado.");
        }
    }

    void desligar() {
        ligado = false;
        System.out.println("Carro desligado.");
    }
}

class ProgramaCarroFantasma {
    public static void main(String[] args) {
        Carro carroNormal = new Carro();
        carroNormal.modelo = "Sedan Confort";
        carroNormal.fantasma = false;

        Carro carroFantasma = new Carro();
        carroFantasma.modelo = "Phantom Runner";
        carroFantasma.fantasma = true;

        System.out.println("Ligando o carro normal:");
        carroNormal.ligar();

        System.out.println("Ligando o carro fantasma:");
        carroFantasma.ligar();
    }
}
