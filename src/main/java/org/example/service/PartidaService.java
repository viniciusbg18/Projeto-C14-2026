package org.example.service;

import org.example.model.Partida;
import org.example.repository.PartidaRepository;

//Ela está recebendo uma implementação da interface, não há implementação em si
//contém regras/operações envolvendo a partida
public class PartidaService {

    private PartidaRepository repository;

    public PartidaService(PartidaRepository repository) {
        this.repository = repository;
    }

    public Partida buscarPartida(int id) {
        return repository.buscarPorId(id);
    }

    public void adicionarPontuacao(int id, int pontos) {
        Partida partida = repository.buscarPorId(id);

        partida.adicionarPontuacao(pontos);

        repository.salvar(partida);
    }
}
