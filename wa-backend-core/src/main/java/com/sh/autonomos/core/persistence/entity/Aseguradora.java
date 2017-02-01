package com.sh.autonomos.core.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "WEB", name = "WP2_ASEGURADORA")
public class Aseguradora extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ASEGURADORA_ID")
	private Long id;

	@Column(name = "ASEGURADORA_COD")
	private Long aseguradoraCod;

	@Column(name = "ASEGURADORA_DESC")
	private String aseguradoraDesc;

	
	
	

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAseguradoraCod() {
		return aseguradoraCod;
	}

	public void setAseguradoraCod(Long aseguradoraCod) {
		this.aseguradoraCod = aseguradoraCod;
	}

	public String getAseguradoraDesc() {
		return aseguradoraDesc;
	}

	public void setAseguradoraDesc(String aseguradoraDesc) {
		this.aseguradoraDesc = aseguradoraDesc;
	}


}
