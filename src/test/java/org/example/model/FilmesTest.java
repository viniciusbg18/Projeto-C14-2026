package org.example.model;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class FilmesTest {

    @Test
    public void deveCriarFilmeComNotaCorreta(){
        Filmes filmeTeste = new Filmes(
                "Filme Teste",
                2025,
                8.5f,
                "Sinopse do filme teste",
                "Diretor Teste",
                120,
                "Livre",
                "Aventura"
        );

        assertEquals(8.5f, filmeTeste.getNota(), 0.001f);
    }
}
