package com.satyra.pi.api.services;

import java.util.Optional;

import com.satyra.pi.api.entities.Empresa;

/**
 * @author eduardosatyra
 *
 */
public interface EmpresaService {
	
	/**
	 * 
	 * @param cnpj
	 * @return
	 */
	Optional<Empresa> buscarPorCnpj(String cnpj);
	
	/**
	 * 
	 * @param empresa
	 * @return
	 */
	Empresa persistir(Empresa empresa);

}
