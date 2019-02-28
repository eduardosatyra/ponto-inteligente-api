package com.satyra.pi.api.services;

import java.util.Optional;

import com.satyra.pi.api.entities.Funcionario;

/**
 * @author eduardosatyra
 *
 */
public interface FuncionarioService {

	/**
	 * Persiste um funcionario na base
	 * 
	 * @param funcionario
	 * @return Funcionario
	 */
	Funcionario persistir(Funcionario funcionario);
	
	/**
	 * Busca e retorna funcionario por CPF
	 * 
	 * @param cpf
	 * @return Optional<Funcionario>
	 */
	Optional<Funcionario> buscarPorCpf(String cpf);
	
	/**
	 * Busca e retorna funcionario por Email
	 * 
	 * @param email
	 * @return Optional<Funcionario>
	 */
	Optional<Funcionario> buscarPorEmail(String email);
	
	/**
	 * Busca e retorna funcionario por Email
	 * 
	 * @param cpf, email
	 * @return Optional<Funcionario>
	 */
	Optional<Funcionario> buscarPorId(Long id);
}
