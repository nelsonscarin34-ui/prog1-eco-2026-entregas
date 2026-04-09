
public class CarroJogador { 
    int nivelNitro; // 0 a 100 

        void usarNitro(){
           while (nivelNitro>0) {
                System.out.println("Nitro ativado!"); 
                nivelNitro = nivelNitro - 10; 
                System.out.println("NÍVEL NITRO AGORA: " + nivelNitro);
                
                if (nivelNitro <= 0) {
                System.out.println("Nitro desativado!"); 
                } 
        }
    }
}

