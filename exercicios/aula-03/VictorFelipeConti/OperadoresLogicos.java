public class OperadoresLogicos {
    public static void main (String [] args) {
        boolean temCarteira = true;
        boolean maiorDeIdade = false;

        boolean podeDirigir = temCarteira && maiorDeIdade;
        System.out.println("Pode dirigir? " + podeDirigir);

    }
    
}
