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

    @Test
    public void deveAcumularPontuacaoEmChamadasSucessivas(){
        Partida partida = new Partida(1);

        PartidaRepository repository = mock(PartidaRepository.class);
        when(repository.buscarPorId(1)).thenReturn(partida);

        PartidaService service = new PartidaService(repository);

        service.adicionarPontuacao(1, 100);
        service.adicionarPontuacao(1, 50);

        assertEquals(150, partida.getPontuacaoTotal());
        verify(repository, times(2)).salvar(partida);
    }

    @Test
    public void deveManterPontuacaoAoAdicionarZero(){
        Partida partida = new Partida(1);
        partida.adicionarPontuacao(100);

        PartidaRepository repository = mock(PartidaRepository.class);
        when(repository.buscarPorId(1)).thenReturn(partida);

        PartidaService service = new PartidaService(repository);

        service.adicionarPontuacao(1, 0);

        assertEquals(100, partida.getPontuacaoTotal());
    }

    @Test
    public void deveConsultarRepositoryAoBuscarPartida(){
        Partida partida = new Partida(5);
        PartidaRepository repository = mock(PartidaRepository.class);

        when(repository.buscarPorId(5)).thenReturn(partida);
        PartidaService service = new PartidaService(repository);

        Partida resultado = service.buscarPartida(5);
        assertEquals(partida, resultado);
        verify(repository).buscarPorId(5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveAdicionarPontuacaoNegativa(){
        Partida partida = new Partida(1);
        PartidaRepository repository = mock(PartidaRepository.class);

        when(repository.buscarPorId(1)).thenReturn(partida);

        PartidaService service = new PartidaService(repository);

        service.adicionarPontuacao(1, -50);
    }
}