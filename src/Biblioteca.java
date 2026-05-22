public class Biblioteca {
    Livro[] Livros= new Livro[5];
    public void AdicionarLivro(int ID, String titulo, String Autor, Boolean Estado){
        Livros[0]= new Livro(titulo, Autor, ID, Estado);
    }
    public void BuscarLivro(int ID){
        Livros[ID-1].GetID();
        Livros[ID-1].GetTitulo();
        Livros[ID-1].GetAutor();
        Livros[ID-1].GetEmprestado();
    }
    public void EmprestarLivro(int ID){
        if(Livros[ID-1].GetEmprestado()==false){
            System.out.println("Você pegou o livro: "+ Livros[ID-1].GetTitulo()+ "empretado");
            Livros[ID-1].SetEstado(true);
        }else{
            System.out.println("O livro ja esta emprestado");
        }
    }
}