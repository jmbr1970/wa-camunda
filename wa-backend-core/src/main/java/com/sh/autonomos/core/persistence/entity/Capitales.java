package com.sh.autonomos.core.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "WEB", name = "WP2_CAPITALES")
public class Capitales extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CAPITALES_ID")
	private Long id;

	@Column(name = "CAPITALES_COD")
	private Long capitalesCod;

	@Column(name = "CAPITAL_CONTINENTE")
	private Long capitalContinente;
	
	@Column(name = "CAPITAL_CONTENIDO")
	private Long capitalContenido;
	
	@Column(name = "RESPONSABILIDAD_CIVIL")
	private Long responsabilidadCivil;

	
	
	

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCapitalesCod() {
		return capitalesCod;
	}

	public void setCapitalesCod(Long capitalesCod) {
		this.capitalesCod = capitalesCod;
	}

	public Long getCapitalContinente() {
		return capitalContinente;
	}

	public void setCapitalContinente(Long capitalContinente) {
		this.capitalContinente = capitalContinente;
	}

	public Long getCapitalContenido() {
		return capitalContenido;
	}

	public void setCapitalContenido(Long capitalContenido) {
		this.capitalContenido = capitalContenido;
	}

	public Long getResponsabilidadCivil() {
		return responsabilidadCivil;
	}

	public void setResponsabilidadCivil(Long responsabilidadCivil) {
		this.responsabilidadCivil = responsabilidadCivil;
	}



}
