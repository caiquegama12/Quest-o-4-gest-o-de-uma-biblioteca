public class Biblioteca {
    Livro[] Livros= new Livro[5];
    int controle=0;
    public void AdicionarLivro(int ID, String titulo, String Autor, Boolean Estado){
        try {
            if (controle < 5) {
                Livros[controle] = new Livro(titulo, Autor, ID, Estado);
                controle=controle+1;
            } else {
                throw new LimiteAcervoException();
            }
        }catch (LimiteAcervoException e){
            System.out.println("Ja tem a quantidade maxima de livros");
        }
    }


    public void BuscarLivro(int ID){
        try{
            if (ID <= Livros.length && ID>0) {
                System.out.println(Livros[ID-1].GetID());
                System.out.println(Livros[ID-1].GetTitulo());
                System.out.println(Livros[ID-1].GetAutor());
                System.out.println(Livros[ID-1].GetEmprestado());
            } else {
                throw new LivroNaoEncontradoException();
            }
        }catch (LivroNaoEncontradoException e){
            System.out.println("O livro que você esta procurando não foi encontrado");
        }
    }


    public void EmprestarLivro ( int ID) {
        try {
            if (Livros[ID - 1].GetEmprestado() == false) {
                if (ID <= Livros.length && ID > 0) {
                    System.out.println("Você pegou o livro: " + Livros[ID - 1].GetTitulo() + "empretado");
                    Livros[ID - 1].SetEstado(true);
                } else {
                    throw new LivroNaoEncontradoException();
                }
            } else {
                throw new EmprestimoInvalidoException();
            }
        } catch (LivroNaoEncontradoException e) {
            System.out.println("O livro que você esta procurando não foi encontrado");
        }
        catch (EmprestimoInvalidoException e){
            System.out.println("Esse livro ja esta emprestado");
        }
        finally {
            System.out.println("Sessão de atendimento finalizada");
        }
    }


    public void DevolverLivro ( int ID){
        try{
            if (Livros[ID - 1].GetEmprestado() == true) {
                if(ID <= Livros.length && ID>0){
                    System.out.println("Você pegou o livro: " + Livros[ID - 1].GetTitulo() + "empretado");
                    Livros[ID - 1].SetEstado(false);
                }else{
                    throw new LivroNaoEncontradoException();
                }
            } else {
                throw new EmprestimoInvalidoException();
            }
        }catch (LivroNaoEncontradoException e){
            System.out.println("O livro que você esta procurando não foi encontrado");
        }
        catch (EmprestimoInvalidoException e){
            System.out.println("Esse livro não pode ser devolvido, ja que não esta emprestado");
        }
    }


}