package org.example.repository;

import org.example.model.Rodada;

public interface RodadaRepository {

    Rodada buscarPorId(int id);

    void salvar(Rodada rodada);
}