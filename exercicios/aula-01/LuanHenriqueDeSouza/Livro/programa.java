public class programa {
    public static void main(String[] args) {
        livro livro1 = new livro();
        livro1.titulo = "Meu livro";
        livro1.autor = "eu";
        livro1.paginas = 300;

        System.out.println("Informações: ");
        System.out.println("titulo: " + livro1.titulo);
        System.out.println("autor: " + livro1.autor);
        System.out.println("número de páginas: " + livro1.paginas);

        livro1.paginas = 500;

        System.out.println("Informações: ");
        System.out.println("titulo: " + livro1.titulo);
        System.out.println("autor: " + livro1.autor);
        System.out.println("número de páginas: " + livro1.paginas);

    }
}
