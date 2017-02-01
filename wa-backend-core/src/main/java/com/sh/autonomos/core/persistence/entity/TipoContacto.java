package com.sh.autonomos.core.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "WEB", name = "WP2_TIPO_CONTACTO")
public class TipoContacto extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TIPO_CONTACTO_ID")
	private Long id;

	@Column(name = "TIPO_CONTACTO_COD")
	private Long tipoContactoCod;

	@Column(name = "TIPO_CONTACTO_DESC")
	private String tipoContactoDesc;

	
	
	

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTipoContactoCod() {
		return tipoContactoCod;
	}

	public void setTipoContactoCod(Long tipoContactoCod) {
		this.tipoContactoCod = tipoContactoCod;
	}

	public String getTipoContactoDesc() {
		return tipoContactoDesc;
	}

	public void setTipoContactoDesc(String tipoContactoDesc) {
		this.tipoContactoDesc = tipoContactoDesc;
	}


}
