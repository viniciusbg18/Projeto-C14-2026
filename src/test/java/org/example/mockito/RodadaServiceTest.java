package org.example.mockito;

import org.example.model.Filmes;
import org.example.model.Rodada;
import org.example.repository.RodadaRepository;
import org.example.service.RodadaService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class RodadaServiceTest {

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
    public void deveBuscarRodadaPorId() {
        // Arrange
        Rodada rodada = new Rodada(1, criarFilme());

        RodadaRepository repository =
                mock(RodadaRepository.class);

        when(repository.buscarPorId(1))
                .thenReturn(rodada);

        RodadaService service =
                new RodadaService(repository);

        // Act
        Rodada resultado = service.buscarRodada(1);

        // Assert
        assertEquals(rodada, resultado);

        verify(repository).buscarPorId(1);
    }

}