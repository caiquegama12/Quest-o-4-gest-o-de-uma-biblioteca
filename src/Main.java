public class Main {
    public static void main(String[] args) {
        Biblioteca livros = new Biblioteca();
        livros.AdicionarLivro(1,"A casa da mamãe", "Calinne", true);
        livros.AdicionarLivro(2,"O amor aventurado", "Miguel", false);
        livros.AdicionarLivro(3,"A casa da sogra", "Geovani", false);
        livros.AdicionarLivro(4,"O amor esta no ar", "Geovani", true);

        livros.EmprestarLivro(4);
        livros.BuscarLivro(7);
        livros.EmprestarLivro(4);
        livros.AdicionarLivro(5,"O amor de vingaça","Miguel", false);
        livros.AdicionarLivro(6,"Dois irmão", "Calinne", false);
    }
}