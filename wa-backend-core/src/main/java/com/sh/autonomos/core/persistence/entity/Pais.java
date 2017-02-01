package com.sh.autonomos.core.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "WEB", name = "WP2_PAIS")
public class Pais extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PAIS_ID")
	private Long id;

	@Column(name = "PAIS_COD")
	private Long paisCod;

	@Column(name = "PAIS_DESC")
	private String paisDesc;

	
	
	

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPaisCod() {
		return paisCod;
	}

	public void setPaisCod(Long paisCod) {
		this.paisCod = paisCod;
	}

	public String getPaisDesc() {
		return paisDesc;
	}

	public void setPaisDesc(String paisDesc) {
		this.paisDesc = paisDesc;
	}

}
