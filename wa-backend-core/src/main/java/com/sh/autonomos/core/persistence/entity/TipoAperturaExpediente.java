package com.sh.autonomos.core.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "WEB", name = "WP2_TIPO_APERTURA_EXPEDIENTE")
public class TipoAperturaExpediente extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TIPO_APERTURA_EXPEDIENTE_ID")
	private Long id;

	@Column(name = "TIPO_APERTURA_EXPEDIENTE_COD")
	private Long tipoAperturaExpedienteCod;

	@Column(name = "TIPO_APERTURA_EXPEDIENTE_DESC")
	private String tipoAperturaExpedienteDesc;

	
	
	

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTipoAperturaExpedienteCod() {
		return tipoAperturaExpedienteCod;
	}

	public void setTipoAperturaExpedienteCod(Long tipoAperturaExpedienteCod) {
		this.tipoAperturaExpedienteCod = tipoAperturaExpedienteCod;
	}

	public String getTipoAperturaExpedienteDesc() {
		return tipoAperturaExpedienteDesc;
	}

	public void setTipoAperturaExpedienteDesc(String tipoAperturaExpedienteDesc) {
		this.tipoAperturaExpedienteDesc = tipoAperturaExpedienteDesc;
	}


}
