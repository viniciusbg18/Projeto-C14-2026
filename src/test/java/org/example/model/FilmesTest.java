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

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveAceitarNotaMaiorQueDez(){
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

        filmeTeste.setNota(15.0f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveAceitarNotaMenorQueZero() {
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

        filmeTeste.setNota(-1f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveAceitarDuracaoMenorQueZero(){
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

        filmeTeste.setDuracao(-20);
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveAceitarDuracaoIgualZero(){
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

        filmeTeste.setDuracao(0);
    }

    @Test
    public void deveAceitarDuracaoValida(){
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

        filmeTeste.setDuracao(150);

        assertEquals(150, filmeTeste.getDuracao());

    }

    @Test
public void deveAlterarNomeDoFilme() {

    Filmes filmeTeste = new Filmes(
            "Viva a vida é uma festa",
            2025,
            8.5f,
            "Sinopse do filme teste",
            "Diretor Teste",
            120,
            "Livre",
            "Animação"
    );

    filmeTeste.setNome("Up: Altas Aventuras");

    assertEquals("Up: Altas Aventuras", filmeTeste.getNome());
}

}
