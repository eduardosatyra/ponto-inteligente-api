package com.satyra.pi.api.services.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.satyra.pi.api.entities.Lancamento;
import com.satyra.pi.api.repositories.LancamentoRepository;
import com.satyra.pi.api.services.LancamentoService;

/**
 * @author eduardosatyra
 *
 */
@Service
public class LancamentoServiceImpl implements LancamentoService{
	
	private static final Logger log = LoggerFactory.getLogger(LancamentoServiceImpl.class); 

	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	@Override
	public Page<Lancamento> buscarPorFuncionarioId(Long funcionarioId, PageRequest pageRequest) {
		log.info("Buscando lancamentos para o func ID: {}", funcionarioId);
		return this.lancamentoRepository.findByFuncionarioId(funcionarioId, pageRequest);
	}

	@Override
	public Optional<Lancamento> buscarPorId(Long id) {
		log.info("Buscando um lancamento pelo ID: {}", id);
		return Optional.ofNullable(this.lancamentoRepository.getOne(id)); // spring < 2.0  FindOne
	}

	@Override
	public Lancamento persistir(Lancamento lancamento) {
		log.info("Persistindo o lancamento: {}", lancamento);
		return this.lancamentoRepository.save(lancamento);
	}

	@Override
	public void remover(Long id) {
		log.info("Removendo lancamento ID: {}", id);
		this.lancamentoRepository.deleteById(id);
	}

}