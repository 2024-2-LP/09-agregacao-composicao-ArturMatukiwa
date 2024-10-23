package school.sptech;

public class Avaliacao {
    private String descricao;
    private Double qtdEstrelas;

    public Avaliacao(String descricao, Double qtdEstrelas) {
        this.descricao = descricao;
        this.qtdEstrelas = qtdEstrelas;
    }
    public Avaliacao() {
        this.descricao = descricao;
        this.qtdEstrelas = qtdEstrelas;
    }

    @Override
    public String toString() {
        return """
                Avaliação do livro: %s
                Quantidade de estrelas da crítica: %.2f
                """.formatted(descricao, qtdEstrelas);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getQtdEstrelas() {
        return qtdEstrelas;
    }

    public void setQtdEstrelas(Double qtdEstrelas) {
        this.qtdEstrelas = qtdEstrelas;
    }
}
