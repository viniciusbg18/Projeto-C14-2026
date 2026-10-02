package org.example.mockito;

import org.example.model.Partida;
import org.example.repository.PartidaRepository;
import org.example.service.PartidaService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class PartidaServiceTest {

    @Test
    public void deveBuscarPartidaPorId() {

        Partida partida = new Partida(1);

        PartidaRepository repository = mock(PartidaRepository.class);

        when(repository.buscarPorId(1)).thenReturn(partida);

        PartidaService service = new PartidaService(repository);

        Partida resultado = service.buscarPartida(1);

        assertEquals(partida, resultado);
    }

    @Test
    public void deveSalvarPartidaAposAdicionarPontuacao() {

        Partida partida = new Partida(1);

        PartidaRepository repository = mock(PartidaRepository.class);

        when(repository.buscarPorId(1)).thenReturn(partida);

        PartidaService service = new PartidaService(repository);

        service.adicionarPontuacao(1, 100);


        assertEquals(100, partida.getPontuacaoTotal());

        verify(repository).salvar(partida);
    }
}