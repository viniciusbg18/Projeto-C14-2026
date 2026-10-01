package org.example.repository;

import org.example.model.Partida;

public interface PartidaRepository {

    Partida buscarPorId(int id);

    void salvar(Partida partida);
}
