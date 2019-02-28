package com.satyra.pi.api.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.satyra.pi.api.entities.Lancamento;

/**
 * @author eduardosatyra
 *
 */
public interface LancamentoService {
	
	/**
	 * Retorna uma lista paginada de lancamentos de um funcionario
	 * 
	 * @param funcionarioId
	 * @param pageRequest
	 * @return
	 */
	Page<Lancamento> buscarPorFuncionarioId(Long funcionarioId, PageRequest pageRequest);
	
	/**
	 * Retorna um funcionario por ID
	 * 
	 * @param id
	 * @return
	 */
	Optional<Lancamento> buscarPorId(Long id);
	
	/**
	 * Persisti um lancamento na base
	 * 
	 * @return
	 */
	Lancamento persistir(Lancamento lancamento);
	
	/**
	 * Remove um lancamento da bse
	 * 
	 * @param id
	 */
	void remover(Long id);

}
