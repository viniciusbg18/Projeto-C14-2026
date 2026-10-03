package org.example.model;

public class Rodada {

    private int id;
    private double palpite;
    private double pontuacao;
    private Filmes filmes;

    public Rodada(int id, Filmes filmes) {
        this.id = id;
        this.filmes = filmes;
        this.pontuacao = 0;
    }

    public int getId() {
        return id;
    }

    public double getPalpite() {
        return palpite;
    }

    public double getPontuacao() {
        return pontuacao;
    }

    public Filmes getFilmes() {
        return filmes;
    }

    public void fazerPalpite(double palpite) {
        if (palpite < 0 || palpite > 10) {
            throw new IllegalArgumentException(
                    "O palpite deve estar entre 0 e 10"
            );
        }

        this.palpite = palpite;
    }

    public void calcularPontuacao() {
        double diferenca = Math.abs(filmes.getNota() - palpite);

        this.pontuacao = Math.max(0, 100 - (diferenca * 10));
    }
}