package com.satyra.pi.api.dtos;

/**
 * @author eduardosatyra
 *
 */
public class EmpresaDto {

	private Long id;
	private String razaoSocial;
	private String cnpj;
	
	public EmpresaDto() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EmpresaDto [id=");
		builder.append(id);
		builder.append(", razaoSocial=");
		builder.append(razaoSocial);
		builder.append(", cnpj=");
		builder.append(cnpj);
		builder.append("]");
		return builder.toString();
	}		
}
