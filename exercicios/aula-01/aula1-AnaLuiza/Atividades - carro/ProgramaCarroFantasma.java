public class ProgramaCarroFantasma {
    public static void main(String[] arg) {

        Carro Carronormal = new Carro();
        Carronormal.marca = "Honda";
        Carronormal.fantasma = false; 

        Carro Carroghost = new Carro();
        Carroghost.modelo = "Carro fantasma"; 
        Carroghost.fantasma = true; 

        System.out.println("Carro normal: "+ Carronormal.marca);
        Carronormal.ligar();

        System.out.println("Carro fantasma está aqui!!!");
        Carroghost.ligar();        
    }
}