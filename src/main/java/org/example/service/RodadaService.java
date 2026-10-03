package org.example.service;

import org.example.model.Rodada;
import org.example.repository.RodadaRepository;

public class RodadaService {

    private RodadaRepository repository;

    public RodadaService(RodadaRepository repository) {
        this.repository = repository;
    }

    public Rodada buscarRodada(int id) {
        return repository.buscarPorId(id);
    }

    public void registrarPalpite(int id, double palpite) {
        Rodada rodada = repository.buscarPorId(id);

        rodada.fazerPalpite(palpite);
        rodada.calcularPontuacao();

        repository.salvar(rodada);
    }
}