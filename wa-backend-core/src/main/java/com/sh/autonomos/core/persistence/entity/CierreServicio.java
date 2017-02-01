package com.sh.autonomos.core.persistence.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "WEB", name = "WP2_CIERRE_SERVICIO")
public class CierreServicio extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CIERRE_SERVICIO_ID")
	private Long id;

	@Column(name = "FECHA_HORA_CIERRE_SERVICIO")
	private Timestamp fechaHoraCierreServicio;

	
	
	

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getFechaHoraCierreServicio() {
		return fechaHoraCierreServicio;
	}

	public void setFechaHoraCierreServicio(Timestamp fechaHoraCierreServicio) {
		this.fechaHoraCierreServicio = fechaHoraCierreServicio;
	}


}
