package com.satyra.pi.api.services.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satyra.pi.api.entities.Funcionario;
import com.satyra.pi.api.repositories.FuncionarioRepository;
import com.satyra.pi.api.services.FuncionarioService;

/**
 * @author eduardosatyra
 *
 */
@Service
public class FuncionarioServiceImpl implements FuncionarioService{
	
	private static final Logger log = LoggerFactory.getLogger(FuncionarioServiceImpl.class);
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;

	@Override
	public Funcionario persistir(Funcionario funcionario) {
		log.info("Persistindo funcionario: {}", funcionario);
		return this.funcionarioRepository.save(funcionario);
		
	}

	@Override
	public Optional<Funcionario> buscarPorCpf(String cpf) {
		log.info("Buscando funcionario pelo CPF: {}", cpf);
		return Optional.ofNullable(funcionarioRepository.findByCpf(cpf));
	}

	@Override
	public Optional<Funcionario> buscarPorEmail(String email) {
		log.info("Buscando funcionario pelo E-mail: {}", email);
		return Optional.ofNullable(funcionarioRepository.findByEmail(email));
	}

	@Override
	public Optional<Funcionario> buscarPorId(Long id) {
		log.info("Buscando funcionario pelo ID: {}", id);
		return Optional.ofNullable(this.funcionarioRepository.getOne(id));
	}

}