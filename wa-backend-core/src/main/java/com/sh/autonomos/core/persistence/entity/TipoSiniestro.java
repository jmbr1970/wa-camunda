package com.sh.autonomos.core.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "WEB", name = "WP2_TIPO_SINIESTRO")
public class TipoSiniestro extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TIPO_SINIESTRO_ID")
	private Long id;

	@Column(name = "TIPO_SINIESTRO_COD")
	private Long tipoSiniestroCod;

	@Column(name = "TIPO_SINIESTRO_DESC")
	private String tipoSiniestroDesc;

	
	
	

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTipoSiniestroCod() {
		return tipoSiniestroCod;
	}

	public void setTipoSiniestroCod(Long tipoSiniestroCod) {
		this.tipoSiniestroCod = tipoSiniestroCod;
	}

	public String getTipoSiniestroDesc() {
		return tipoSiniestroDesc;
	}

	public void setTipoSiniestroDesc(String tipoSiniestroDesc) {
		this.tipoSiniestroDesc = tipoSiniestroDesc;
	}


}
