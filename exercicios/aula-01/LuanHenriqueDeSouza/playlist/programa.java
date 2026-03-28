public class programa {
    public static void main(String[] args) {
        musica musica1 = new musica();
        musica1.titulo = "Fugidinha";
        musica1.artista = "Michel Teló";
        musica1.duracaoEmSegundos = 180;

        musica musica2 = new musica();
        musica2.titulo = "Gatinha assanhada";
        musica2.artista = "Gusttavo Lima";
        musica2.duracaoEmSegundos = 188;

        System.out.println("Primeira música: " + musica1.titulo + " - " + musica1.artista);

        System.out.println("Segunda música: " + musica2.titulo + " - " + musica2.artista);

        musica2.titulo = "Balada boa ";

    }

}