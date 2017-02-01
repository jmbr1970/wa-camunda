package com.sh.autonomos.core.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "WEB", name = "WP2_GREMIO_PRESUPUESTO")
public class GremioPresupuesto extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "GREMIO_PRESUPUESTO_ID")
	private Long id;
	
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "PRESUPEUSTO_ID", referencedColumnName = "PRESUPEUSTO_ID")
    private Presupuesto pesupuesto;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "GREMIO_ID", referencedColumnName = "GREMIO_ID")
    private Gremio gremio;

	
	

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Presupuesto getPesupuesto() {
		return pesupuesto;
	}

	public void setPesupuesto(Presupuesto pesupuesto) {
		this.pesupuesto = pesupuesto;
	}

	public Gremio getGremio() {
		return gremio;
	}

	public void setGremio(Gremio gremio) {
		this.gremio = gremio;
	}


}
