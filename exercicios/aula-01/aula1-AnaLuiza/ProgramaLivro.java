class Livro {
    String titulo; 
    String autor;
    int paginas;
    int anopublic;  
}

public class ProgramaLivro {
    public static void main (String[] args) {

        Livro livro1 = new Livro(); 

        livro1.titulo = "Um estudo em vermelho"; 
        livro1.autor = "Arthur Doyle"; 
        livro1.paginas = 192;
        livro1.anopublic = 1887;
        
        System.out.println("Livro 1: "+ livro1.titulo
            + " - " + livro1.autor 
            + " - " + livro1.anopublic
            + " - " + livro1.paginas + " páginas");

        livro1.paginas = 300; 
            
        System.out.println("Nova edição: " + livro1.titulo 
            + " - " + livro1.autor
            + " - " + livro1.anopublic
            + " - " + livro1.paginas + " páginas."); 
        
    }
}