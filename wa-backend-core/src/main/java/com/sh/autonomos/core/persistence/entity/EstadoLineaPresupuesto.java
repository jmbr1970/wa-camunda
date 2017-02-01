package com.sh.autonomos.core.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "WEB", name = "WP2_ESTADO_LINEA_PRESUPUESTO")
public class EstadoLineaPresupuesto extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ESTADO_LINEA_PRESUPUESTO_ID")
	private Long id;

	@Column(name = "ESTADO_LINEA_PRESUPUESTO_COD")
	private Long estadoLineaPresupuestoCod;

	@Column(name = "ESTADO_LINEA_PRESUPUESTO_DESC")
	private String estadoLineaPresupuestoDesc;

	
	
	

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getEstadoLineaPresupuestoCod() {
		return estadoLineaPresupuestoCod;
	}

	public void setEstadoLineaPresupuestoCod(Long estadoLineaPresupuestoCod) {
		this.estadoLineaPresupuestoCod = estadoLineaPresupuestoCod;
	}

	public String getEstadoLineaPresupuestoDesc() {
		return estadoLineaPresupuestoDesc;
	}

	public void setEstadoLineaPresupuestoDesc(String estadoLineaPresupuestoDesc) {
		this.estadoLineaPresupuestoDesc = estadoLineaPresupuestoDesc;
	}


}
