public class Livro {
    private int ID;
    private String Titulo, Autor;
    private Boolean Emprestado=false;

    public int GetID(){ return this.ID;}
    public String GetAutor(){ return this.Autor;}
    public String GetTitulo(){ return this.Titulo;}
    public Boolean GetEmprestado(){ return this.Emprestado;}
    public void SetEstado(boolean emprestado){ this.Emprestado=emprestado;}

    public Livro(String Titulo,String Autor, int Id, Boolean Estado){
        this.ID=Id;
        this.Titulo=Titulo;
        this.Autor=Autor;
        this.Emprestado=Estado;
    }
}
