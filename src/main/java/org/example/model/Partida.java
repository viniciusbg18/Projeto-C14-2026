package org.example.model;

public class Partida {

    private int id;
    private int pontuacaoTotal;
    private boolean status;


public Partida(int id) {
    this.id = id;
    this.pontuacaoTotal = 0;
    this.status = true;
}

public int getId() {
    return id;
}

public int getPontuacaoTotal() {
    return pontuacaoTotal;
}

public boolean isStatus() {
    return status;
}

public void adicionarPontuacao(int pontos) {
    if (pontos < 0) {
        throw new IllegalArgumentException("A pontuação não pode ser negativa");
    }

    this.pontuacaoTotal += pontos;
}

    public void finalizar() {
        this.status = false;
    }

    public boolean estaAtiva() {
        return status;
    }


}