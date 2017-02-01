package com.sh.autonomos.core.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "WEB", name = "WP2_TIPO_SERVICIO")
public class TipoServicio extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TIPO_SERVICIO_ID")
	private Long id;

	@Column(name = "TIPO_SERVICIO_COD")
	private Long tipoServicioCod;

	@Column(name = "TIPO_SERVICIO_DESC")
	private String tipoServicioDesc;

	
	
	

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTipoServicioCod() {
		return tipoServicioCod;
	}

	public void setTipoServicioCod(Long tipoServicioCod) {
		this.tipoServicioCod = tipoServicioCod;
	}

	public String getTipoServicioDesc() {
		return tipoServicioDesc;
	}

	public void setTipoServicioDesc(String tipoServicioDesc) {
		this.tipoServicioDesc = tipoServicioDesc;
	}


}
