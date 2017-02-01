package com.sh.autonomos.core.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "WEB", name = "WP2_ESTADO_SERVICIO")
public class EstadoServicio extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ESTADO_SERVICIO_ID")
	private Long id;

	@Column(name = "ESTADO_SERVICIO_COD")
	private Long estadoServicioCod;

	@Column(name = "ESTADO_SERVICIO_DESC")
	private String estadoServicioDesc;

	
	
	

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getEstadoServicioCod() {
		return estadoServicioCod;
	}

	public void setEstadoServicioCod(Long estadoServicioCod) {
		this.estadoServicioCod = estadoServicioCod;
	}

	public String getEstadoServicioDesc() {
		return estadoServicioDesc;
	}

	public void setEstadoServicioDesc(String estadoServicioDesc) {
		this.estadoServicioDesc = estadoServicioDesc;
	}


}
