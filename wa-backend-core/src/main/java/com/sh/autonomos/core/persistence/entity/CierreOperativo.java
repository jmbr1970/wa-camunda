package com.sh.autonomos.core.persistence.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "WEB", name = "WP2_CIERRE_OPERATIVO")
public class CierreOperativo extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CIERRE_OPERATIVO_ID")
	private Long id;

	@Column(name = "FECHA_HORA_CIERRE_OPERATIVO")
	private Timestamp fechaHoraCierreOperativo;

	
	
	

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getFechaHoraCierreOperativo() {
		return fechaHoraCierreOperativo;
	}

	public void setFechaHoraCierreOperativo(Timestamp fechaHoraCierreOperativo) {
		this.fechaHoraCierreOperativo = fechaHoraCierreOperativo;
	}


}
