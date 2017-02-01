package com.sh.autonomos.core.persistence.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "WEB", name = "WP2_LLEGADA")
public class Llegada extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "LLEGADA_ID")
	private Long id;
	
	@Column(name = "FECHA_HORA_LLEGADA")
	private Timestamp fechaHoraLlegada;
	
	@Column(name = "FECHA_HORA_NOTIF_LLEGADA")
	private Timestamp fechaHoraNotifLlegada;
	

	
	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getFechaHoraLlegada() {
		return fechaHoraLlegada;
	}

	public void setFechaHoraLlegada(Timestamp fechaHoraLlegada) {
		this.fechaHoraLlegada = fechaHoraLlegada;
	}

	public Timestamp getFechaHoraNotifLlegada() {
		return fechaHoraNotifLlegada;
	}

	public void setFechaHoraNotifLlegada(Timestamp fechaHoraNotifLlegada) {
		this.fechaHoraNotifLlegada = fechaHoraNotifLlegada;
	}


}
