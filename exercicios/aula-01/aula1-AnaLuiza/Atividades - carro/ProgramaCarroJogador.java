public class ProgramaCarroJogador {
    public static void main (String[] arg) {

        CarroJogador Carro1 = new CarroJogador(); 
        Carro1.nivelNitro = 110; 

        System.out.println("Nível do nitro: "+ Carro1.nivelNitro); 

        Carro1.usarNitro();
        Carro1.usarNitro();
        Carro1.usarNitro(); 
    
    }
}