package org.example.model;

import org.junit.Test;

public class PartidaTest {

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveAceitarPontuacaoNegativa() {

        // ARRANGE: cria uma partida
        Partida partida = new Partida(1);

        // ACT: tenta adicionar uma pontuação negativa
        partida.adicionarPontuacao(-50);
    }
}
