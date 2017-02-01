package com.sh.autonomos.core.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "WEB", name = "WP2_IMPUTACION_CULPA")
public class ImputacionCulpa extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IMPUTACION_CULPA_ID")
	private Long id;

	@Column(name = "IMPUTACION_CULPA_COD")
	private Long estadoActividadCod;

	@Column(name = "IMPUTACION_CULPA_DESC")
	private String estadoActividadDesc;

	
	
	

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getEstadoActividadCod() {
		return estadoActividadCod;
	}

	public void setEstadoActividadCod(Long estadoActividadCod) {
		this.estadoActividadCod = estadoActividadCod;
	}

	public String getEstadoActividadDesc() {
		return estadoActividadDesc;
	}

	public void setEstadoActividadDesc(String estadoActividadDesc) {
		this.estadoActividadDesc = estadoActividadDesc;
	}


}
