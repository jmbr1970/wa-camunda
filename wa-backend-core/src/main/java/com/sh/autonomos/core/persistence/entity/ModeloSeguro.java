package com.sh.autonomos.core.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "WEB", name = "WP2_MODELO_SEGURO")
public class ModeloSeguro extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MODELO_SEGURO_ID")
	private Long id;

	@Column(name = "MODELO_SEGURO_COD")
	private Long modeloSeguroCod;

	@Column(name = "MODELO_SEGURO_DESC")
	private String modeloSeguroDesc;

	
	
	

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getModeloSeguroCod() {
		return modeloSeguroCod;
	}

	public void setModeloSeguroCod(Long modeloSeguroCod) {
		this.modeloSeguroCod = modeloSeguroCod;
	}

	public String getModeloSeguroDesc() {
		return modeloSeguroDesc;
	}

	public void setModeloSeguroDesc(String modeloSeguroDesc) {
		this.modeloSeguroDesc = modeloSeguroDesc;
	}


}
