public class programa {
    public static void main(String[] args) {
        Carro padrao = new Carro();
        padrao.modelo = "audi";
        padrao.fantasma = false;

        Carro oFantasma = new Carro();
        oFantasma.modelo = "gasparzinho";
        oFantasma.fantasma = true;

        System.out.println("ligando audi");
        padrao.ligar();

        System.out.println("Ligar fantasma");
        oFantasma.ligar();

    }
}
