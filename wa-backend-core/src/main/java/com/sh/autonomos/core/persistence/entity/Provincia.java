package com.sh.autonomos.core.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "WEB", name = "WP2_PROVINCIA")
public class Provincia extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PROVINCIA_ID")
	private Long id;

	@Column(name = "PROVINCIA_COD")
	private Long provinciaCod;

	@Column(name = "PROVINCIA_DESC")
	private String provinciaDesc;

	
	
	

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProvinciaCod() {
		return provinciaCod;
	}

	public void setProvinciaCod(Long provinciaCod) {
		this.provinciaCod = provinciaCod;
	}

	public String getProvinciaDesc() {
		return provinciaDesc;
	}

	public void setProvinciaDesc(String provinciaDesc) {
		this.provinciaDesc = provinciaDesc;
	}


}
