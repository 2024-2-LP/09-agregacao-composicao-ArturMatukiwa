package school.sptech;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Biblioteca {
    private String nome;
    private List<Livro> livros;

    public Biblioteca(String nome, List<Livro> livros) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }
    public Biblioteca() {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        if(livro != null &&
           livro.getTitulo() != null && !livro.getTitulo().isBlank() &&
           livro.getAutor() != null && !livro.getAutor().isBlank() &&
           livro.getDataPublicacao() != null) {
            livros.add(livro);
        }
    }

    public void removerLivroPorTitulo(String titulo) {
        for (int i = 0; i < livros.size(); i++) {
            String tituloAtual = livros.get(i).getTitulo();

            if(titulo.equalsIgnoreCase(tituloAtual)){
                livros.remove(livros.get(i));
            }
        }
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        if(titulo == null || titulo.isBlank()) {
            return null;
        }

        for (Livro livroAtual : livros) {
            String tituloAtual = livroAtual.getTitulo();

            if(tituloAtual.equalsIgnoreCase(titulo)) {
                return livroAtual;
            }
        }

        return null;
    }

    public Integer contarLivros(){
        return livros.size();
    }

    public List<Livro> obterLivrosAteAno(Integer ano) {
        List<Livro> livrosAteAno = new ArrayList<>();

        for (Livro livroAtual : livros) {
            Integer dataAnoAtual = livroAtual.getDataPublicacao().getYear();

            if(dataAnoAtual <= ano) {
                livrosAteAno.add(livroAtual);
            }
        }

        return livrosAteAno;
    }

    public List<Livro> retornarTopCincoLivros() {
        List<Livro> topCincoLivros = new ArrayList<>();

        Stream<Livro> livrosOrdenado = livros.stream().sorted();

        Stream<Livro> livroLimitado = livrosOrdenado.limit(5);

        return topCincoLivros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
