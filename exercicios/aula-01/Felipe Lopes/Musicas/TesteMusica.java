package Musica;

public class TesteMusica {

	public static void main(String[] args) {
		
		musica primeiramusica = new musica();
		primeiramusica.titulo = "Secretária";
		primeiramusica.artista = "Amado Batista";
		primeiramusica.duracaoSegundos = 180;

		
		musica segundamusica = new musica();
		segundamusica.titulo = "Happiness Is a Butterfly";
		segundamusica.artista = "LanaDelRey";
		segundamusica.duracaoSegundos = 200; 
		
		System.out.println("primeira musica " + primeiramusica.titulo + "-" + primeiramusica.artista );
		System.out.println("segunda musica" + segundamusica.titulo + "-"  + segundamusica.artista );
	
		segundamusica.titulo = "Summertime Sadness";	
		System.out.println ("segunda musica (atualizada ): "  + segundamusica.titulo + " - " + segundamusica.artista + "(" + segundamusica.duracaoSegundos + "s) ");
		
	
	}

}
	