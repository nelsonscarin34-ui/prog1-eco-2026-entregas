//molde (classe)
public class Carro {
    
    //Atributos ou características 
    String marca; 
    String modelo; 
    int ano; 
    int potencia; 
    String cor;  
    boolean ligado; 
    boolean fantasma;  


    //Ações ou comportamentos

    void ligar() {
        ligado = true; 
        if(fantasma){
            System.out.println("Carro fantasma apareceu");
        } else {
        System.out.println("Carro Ligado!"); 
    }
}

    void desligar() {
        ligado = false; 
        System.out.println("Carro desligado!");
    }
}

