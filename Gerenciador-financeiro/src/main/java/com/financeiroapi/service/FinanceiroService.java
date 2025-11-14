package com.financeiroapi.service;

import com.financeiroapi.model.Financeiro;
import com.financeiroapi.repository.FinanceiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FinanceiroService {

    @Autowired
    private FinanceiroRepository financeiroRepository;

    public List<Financeiro> listarTodos() {
        return financeiroRepository.findAll();
    }

    public Financeiro salvar(Financeiro financeiro) {
        return financeiroRepository.save(financeiro);
    }

    public Optional<Financeiro> findById(Long id) {
        return financeiroRepository.findById(id);
    }

    public Financeiro atualizar(Long id, Financeiro dados) {
        return financeiroRepository.findById(id)
                .map(fin -> {
                    fin.setTipo(dados.getTipo());
                    fin.setCategoria(dados.getCategoria());
                    fin.setValor(dados.getValor());
                    fin.setData(dados.getData());
                    fin.setDescricao(dados.getDescricao());
                    fin.setForma_pagamento(dados.getForma_pagamento());
                    return financeiroRepository.save(fin);
                })
                .orElseThrow(() -> new RuntimeException("Registro não encontrado"));
    }

    public void deletar(Long id) {
        financeiroRepository.deleteById(id);
    }
}
