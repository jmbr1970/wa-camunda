package com.sh.autonomos.core.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "WEB", name = "WP2_DATO_CONTACTO")
public class DatoContacto extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "DATO_CONTACTO_ID")
	private Long id;

	@Column(name = "DATO_CONTACTO_COD")
	private Long datoContactoCod;

	@Column(name = "TELEFONO_MOVIL")
	private Integer telefonoMovil;
	
	@Column(name = "TELEFONO_PARTICULAR")
	private Integer telefonoParticular;
	
	@Column(name = "TELEFONO_FIJO")
	private Integer telefonoFijo;
	
	@Column(name = "EMAIL")
	private String email;
	
	
	
	

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDatoContactoCod() {
		return datoContactoCod;
	}

	public void setDatoContactoCod(Long datoContactoCod) {
		this.datoContactoCod = datoContactoCod;
	}

	public Integer getTelefonoMovil() {
		return telefonoMovil;
	}

	public void setTelefonoMovil(Integer telefonoMovil) {
		this.telefonoMovil = telefonoMovil;
	}

	public Integer getTelefonoParticular() {
		return telefonoParticular;
	}

	public void setTelefonoParticular(Integer telefonoParticular) {
		this.telefonoParticular = telefonoParticular;
	}

	public Integer getTelefonoFijo() {
		return telefonoFijo;
	}

	public void setTelefonoFijo(Integer telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}
