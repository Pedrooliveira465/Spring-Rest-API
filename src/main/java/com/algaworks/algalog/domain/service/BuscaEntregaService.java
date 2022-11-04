package com.algaworks.algalog.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algaworks.algalog.domain.exception.EntidadeNaoEncontradaException;
import com.algaworks.algalog.domain.model.Entrega;
import com.algaworks.algalog.domain.repository.EntregaRepository;

@Service
public class BuscaEntregaService {

	@Autowired
	private EntregaRepository entregaRepository;

	public BuscaEntregaService(EntregaRepository entregaRepository) {
		super();
		this.entregaRepository = entregaRepository;
	}

	public Entrega buscar(Long entregaId) {
		return entregaRepository.findById(entregaId)
				.orElseThrow(() -> new EntidadeNaoEncontradaException("Entrega não encontrada"));
	}

}
