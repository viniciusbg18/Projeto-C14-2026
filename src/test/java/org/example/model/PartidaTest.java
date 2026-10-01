package org.example.model;

import org.junit.Test;

public class PartidaTest {

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveAceitarPontuacaoNegativa() {
        Partida partida = new Partida(1);
        partida.adicionarPontuacao(-50);
    }
}
