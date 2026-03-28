package carrofantasma;

public class TesteCarro {

    public static void main(String[] args) {

        CarroFantasma normal = new CarroFantasma();
        normal.modelo = "Civic";
        normal.fantasma = false;

        CarroFantasma fantasma = new CarroFantasma();
        fantasma.modelo = "Fusion";
        fantasma.fantasma = true;

        normal.ligar();
        fantasma.ligar();
    }
}