package com.sh.autonomos.core.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "WEB", name = "WP2_GREMIO")
public class Gremio extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "GREMIO_ID")
	private Long id;

	@Column(name = "GREMIO_COD")
	private Long gremioCod;

	@Column(name = "GREMIO_DESC")
	private String gremioDesc;

	
	
	

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getGremioCod() {
		return gremioCod;
	}

	public void setGremioCod(Long gremioCod) {
		this.gremioCod = gremioCod;
	}

	public String getGremioDesc() {
		return gremioDesc;
	}

	public void setGremioDesc(String gremioDesc) {
		this.gremioDesc = gremioDesc;
	}


}
