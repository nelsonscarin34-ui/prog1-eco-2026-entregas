public class ProgramaCarro {
    public static void main(String[] args) {

        //Criar um objeto Carro
        Carro meuCarro = new Carro(); 
        meuCarro.marca = "Honda";
        meuCarro.modelo = "HRV"; 
        meuCarro.cor = "Preto"; 
        meuCarro.potencia = 177;
        meuCarro.ano = 2024;

        System.out.println("Marca: "+ meuCarro.marca);
        System.out.println("Modelo: "+ meuCarro.modelo);
        System.out.println("Cor: "+ meuCarro.cor);
        System.out.println("Potência"+ meuCarro.potencia);
        System.out.println("Ano: "+ meuCarro.ano); 

        
        //Métodos ou ações
        meuCarro.ligar(); 
        System.out.println("Carro ligado!"); 

        meuCarro.desligar();
        System.out.println("Carro desligado!");

    }
 }  


