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

    @Test
    public void deveAlterarAnoLancamentoDoFilme() {

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

        filmeTeste.setAnoLancamento(2026);

        assertEquals(2026, filmeTeste.getAnoLancamento());
    }

    @Test
    public void deveAlterarGeneroDoFilme() {

        Filmes filmeTeste = new Filmes(
                "Interestelar",
                2014,
                8.7f,
                "Uma viagem espacial",
                "Christopher Nolan",
                169,
                "12 anos",
                "Ficção científica"
        );

        filmeTeste.setGenero("Drama");

        assertEquals("Drama", filmeTeste.getGenero());
    }

    @Test
    public void deveAlterarDiretorDoFilme() {
        Filmes filmeTeste = new Filmes(
                "Interestelar",
                2014,
                8.7f,
                "Uma viagem espacial",
                "Christopher Nolan",
                169,
                "12 anos",
                "Ficção científica"
        );

        filmeTeste.setDiretor("Steven Spielberg");

        assertEquals("Steven Spielberg", filmeTeste.getDiretor());
    }

    @Test
    public void deveAlterarSinopseDoFilme(){
        Filmes filmeTeste = new Filmes(
                "Interestelar",
                2014,
                8.7f,
                "Uma viagem espacial",
                "Christopher Nolan",
                169,
                "12 anos",
                "Ficção científica"
        );

        filmeTeste.setSinopse("Uma missão espacial em busca de um novo planeta.");

        assertEquals(
                "Uma missão espacial em busca de um novo planeta.",
                filmeTeste.getSinopse()
        );
    }

    @Test
    public void deveAlterarClassificacaoDoFilme(){
        Filmes filmeteste = new Filmes(
                "Interestelar",
                2014,
                8.7f,
                "Uma viagem espacial",
                "Christopher Nolan",
                169,
                "12 anos",
                "Ficção científica"
        );

        filmeteste.setClassificacao("14 anos");

        assertEquals("14 anos", filmeteste.getClassificacao());
    }
}
