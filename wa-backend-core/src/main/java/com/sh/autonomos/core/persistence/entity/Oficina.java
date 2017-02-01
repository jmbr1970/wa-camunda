package com.sh.autonomos.core.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "WEB", name = "WP2_OFICINA")
public class Oficina extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "OFICINA_ID")
	private Long id;

	@Column(name = "OFICINA_COD")
	private Long oficinaCod;

	@Column(name = "OFICINA_DESC")
	private String oficinaDesc;

	
	
	

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOficinaCod() {
		return oficinaCod;
	}

	public void setOficinaCod(Long oficinaCod) {
		this.oficinaCod = oficinaCod;
	}

	public String getOficinaDesc() {
		return oficinaDesc;
	}

	public void setOficinaDesc(String oficinaDesc) {
		this.oficinaDesc = oficinaDesc;
	}


}
