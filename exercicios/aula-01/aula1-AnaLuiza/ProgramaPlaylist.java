class Playlist { 
    String titulo; 
    String artista; 
    int anolancamento; 
    int duracaosegundos; 
}

public class ProgramaPlaylist {
    public static void main (String[] args) {

        Playlist musica1 = new Playlist(); 
        Playlist musica2 = new Playlist(); 

        musica1.titulo = "Diva"; 
        musica1.artista = "Beyoncé"; 
        musica1.anolancamento = 2008; 
        musica1.duracaosegundos = 204; 

        musica2.titulo = "Dracula"; 
        musica2.artista = "Tame Impala"; 
        musica2.anolancamento = 2025; 
        musica2.duracaosegundos = 216; 

        System.out.println("Música 1: " + musica1.titulo 
            + "- " + musica1.artista 
            + "- " + musica1.anolancamento
            + "- Duração (em segundos): " + musica1.duracaosegundos); 

        System.out.println("Música 2: " + musica2.titulo 
            + "- " + musica2.artista 
            + "- " + musica2.anolancamento
            + "- Duração (em segundos): " + musica2.duracaosegundos); 

        
            musica2.titulo = "Dracula novo"; 

             System.out.println("Música 2 nova: " + musica2.titulo 
                + "- " + musica2.artista 
                + "- " + musica2.anolancamento
                + "- Duração (em segundos): " + musica2.duracaosegundos); 

    }

}