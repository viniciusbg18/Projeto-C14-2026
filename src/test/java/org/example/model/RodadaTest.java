package org.example.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RodadaTest {

    private Filmes criarFilme() {
        return new Filmes(
                "Interestelar",
                2014,
                8.7f,
                "Uma viagem espacial",
                "Christopher Nolan",
                169,
                "12 anos",
                "Ficção científica"
        );
    }

    @Test
    public void deveCalcularPontuacaoDoPalpite() {
        // Arrange
        Filmes filme = criarFilme();
        Rodada rodada = new Rodada(1, filme);

        // Act
        rodada.fazerPalpite(8.0);
        rodada.calcularPontuacao();

        // Assert
        assertEquals(93.0, rodada.getPontuacao(), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveAceitarPalpiteMaiorQueDez() {
        // Arrange
        Filmes filme = criarFilme();
        Rodada rodada = new Rodada(1, filme);

        // Act
        rodada.fazerPalpite(15.0);
    }
}