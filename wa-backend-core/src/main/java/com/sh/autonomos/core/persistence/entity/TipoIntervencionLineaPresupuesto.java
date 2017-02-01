package com.sh.autonomos.core.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "WEB", name = "WP2_TIPO_INTERVENCION_LINEA_PRESUPUESTO")
public class TipoIntervencionLineaPresupuesto extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TIPO_INTERVENCION_LINEA_PRESUPUESTO_ID")
	private Long id;

	@Column(name = "TIPO_INTERVENCION_LINEA_PRESUPUESTO_COD")
	private Long tipoIntervencionLineaPresupuestoCod;

	@Column(name = "TIPO_INTERVENCION_LINEA_PRESUPUESTO_DESC")
	private String tipoIntervencionLineaPresupuestoDesc;

	
	
	

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTipoIntervencionLineaPresupuestoCod() {
		return tipoIntervencionLineaPresupuestoCod;
	}

	public void setTipoIntervencionLineaPresupuestoCod(Long tipoIntervencionLineaPresupuestoCod) {
		this.tipoIntervencionLineaPresupuestoCod = tipoIntervencionLineaPresupuestoCod;
	}

	public String getTipoIntervencionLineaPresupuestoDesc() {
		return tipoIntervencionLineaPresupuestoDesc;
	}

	public void setTipoIntervencionLineaPresupuestoDesc(String tipoIntervencionLineaPresupuestoDesc) {
		this.tipoIntervencionLineaPresupuestoDesc = tipoIntervencionLineaPresupuestoDesc;
	}


}
