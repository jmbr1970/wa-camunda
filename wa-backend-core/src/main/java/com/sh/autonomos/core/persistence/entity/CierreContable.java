package com.sh.autonomos.core.persistence.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "WEB", name = "WP2_CIERRE_CONTABLE")
public class CierreContable extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CIERRE_CONTABLE_ID")
	private Long id;

	@Column(name = "FECHA_HORA_CIERRE_CONTABLE")
	private Timestamp fechaHoraCierreContable;

	
	
	

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getFechaHoraCierreContable() {
		return fechaHoraCierreContable;
	}

	public void setFechaHoraCierreContable(Timestamp fechaHoraCierreContable) {
		this.fechaHoraCierreContable = fechaHoraCierreContable;
	}


}
