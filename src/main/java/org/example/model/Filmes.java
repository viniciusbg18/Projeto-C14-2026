package org.example.model;

public class Filmes {
    private String nome;
    private int anoLancamento;
    private float nota;
    private String sinopse;
    private String diretor;
    private int duracao;
    private String classificacao;
    private String genero;

    public Filmes(String nome, int anoLancamento, float nota, String sinopse, String diretor, int duracao,String classificacao, String genero) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.nota = nota;
        this.sinopse = sinopse;
        this.diretor = diretor;
        this.duracao = duracao;
        this.classificacao = classificacao;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public float getNota() {
        return nota;
    }

    public String getSinopse() {
        return sinopse;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public String getGenero() {
        return genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setNota(float nota) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("Nota deve estar entre 0 e 10");
        }
        this.nota = nota;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void setDuracao(int duracao) {
        if (duracao <= 0) {
            throw new IllegalArgumentException("Duração deve ser maior que zero");
        }
        this.duracao = duracao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
