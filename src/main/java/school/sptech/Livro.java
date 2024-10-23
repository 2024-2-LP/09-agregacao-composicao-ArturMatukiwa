package school.sptech;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private String autor;
    private LocalDate dataPublicacao;
    private List<Avaliacao> avaliacoes;

    public Livro(String titulo, String autor, LocalDate dataPublicacao, List<Avaliacao> avaliacoes) {
        this.titulo = titulo;
        this.autor = autor;
        this.dataPublicacao = dataPublicacao;
        this.avaliacoes = new ArrayList<>();
    }
    public Livro() {
        this.titulo = titulo;
        this.autor = autor;
        this.dataPublicacao = dataPublicacao;
        this.avaliacoes = new ArrayList<>();
    }

    public void adicionarAvaliacao(String descricao, Double qtdEstrelas){
        if (descricao != null && !descricao.isBlank() && qtdEstrelas != null && qtdEstrelas >= 0 && qtdEstrelas <= 5) {
            Avaliacao novaAvaliacao = new Avaliacao(descricao, qtdEstrelas);

            avaliacoes.add(novaAvaliacao);
        }
    }

    public Double calcularMediaAvaliacoes() {

        if(avaliacoes.isEmpty()) {
            return 0.0;
        }

        Double soma = 0.0;
        Double media;
        for (Avaliacao avaliacao : avaliacoes) {
            soma += avaliacao.getQtdEstrelas();
        }
        media = soma / avaliacoes.size();

        return media;
    }

    @Override
    public String toString() {
        return """
                Titulo do livro: %s
                Autor do livro: %s
                Data de lançamento:
                """.formatted(titulo, autor) + dataPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
}
