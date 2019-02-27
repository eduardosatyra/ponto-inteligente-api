package com.satyra.pi.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.satyra.pi.api.entities.Empresa;

/**
 * @author eduardosatyra
 *
 */
@Transactional(readOnly = true)
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

	@Transactional(readOnly = true)
	Empresa findByCnpj(String cnpj);
}
