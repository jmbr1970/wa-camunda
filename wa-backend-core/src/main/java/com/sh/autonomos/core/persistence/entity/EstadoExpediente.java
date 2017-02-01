package com.sh.autonomos.core.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "WEB", name = "WP2_ESTADO_EXPEDIENTE")
public class EstadoExpediente extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ESTADO_EXPEDIENTE_ID")
	private Long id;

	@Column(name = "ESTADO_EXPEDIENTE_COD")
	private Long estadoExpedienteCod;

	@Column(name = "ESTADO_EXPEDIENTE_DESC")
	private String estadoExpedienteDesc;

	
	
	

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getEstadoExpedienteCod() {
		return estadoExpedienteCod;
	}

	public void setEstadoExpedienteCod(Long estadoExpedienteCod) {
		this.estadoExpedienteCod = estadoExpedienteCod;
	}

	public String getEstadoExpedienteDesc() {
		return estadoExpedienteDesc;
	}

	public void setEstadoExpedienteDesc(String estadoExpedienteDesc) {
		this.estadoExpedienteDesc = estadoExpedienteDesc;
	}


}
