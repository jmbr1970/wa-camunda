package com.sh.autonomos.core.persistence.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "WEB", name = "WP2_CITA")
public class Cita extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CITA_ID")
	private Long id;
	
	@Column(name = "CITA_COD")
	private String citaCod;
	
	@Column(name = "FECHA_HORA_CITA")
	private Timestamp fechaHoraCita;
	
	@Column(name = "ESTIMACION_HORAS")
	private Integer estimacionHoras;
	

	
	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCitaCod() {
		return citaCod;
	}

	public void setCitaCod(String citaCod) {
		this.citaCod = citaCod;
	}

	public Timestamp getFechaHoraCita() {
		return fechaHoraCita;
	}

	public void setFechaHoraCita(Timestamp fechaHoraCita) {
		this.fechaHoraCita = fechaHoraCita;
	}

	public Integer getEstimacionHoras() {
		return estimacionHoras;
	}

	public void setEstimacionHoras(Integer estimacionHoras) {
		this.estimacionHoras = estimacionHoras;
	}


}
