package com.sh.autonomos.core.persistence.entity;

import java.sql.Timestamp;

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
@Table(schema = "WEB", name = "WP2_TASK_EXTENDIDA")
public class TaskExtendida extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TASK_EXTENDIDA_ID")
	private Long id;
	
	@Column(name = "FECHA_HORA_LIMITE")
	private Timestamp fechaHoraLimite;
	
	@Column(name = "USER_CLAIM_ID")
	private String userClaimId;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "EXPEDIENTE_ID", referencedColumnName = "EXPEDIENTE_ID")
    private Expediente expediente;
	
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "INTERVENCION_ID", referencedColumnName = "INTERVENCION_ID")
    private Intervencion intervencion;
	
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "TIPO_TASK_ID", referencedColumnName = "TIPO_TASK_ID")
    private TipoTask tipoTask;

	
	
	

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getFechaHoraLimite() {
		return fechaHoraLimite;
	}

	public void setFechaHoraLimite(Timestamp fechaHoraLimite) {
		this.fechaHoraLimite = fechaHoraLimite;
	}

	public String getUserClaimId() {
		return userClaimId;
	}

	public void setUserClaimId(String userClaimId) {
		this.userClaimId = userClaimId;
	}

	public Expediente getExpediente() {
		return expediente;
	}

	public void setExpediente(Expediente expediente) {
		this.expediente = expediente;
	}

	public Intervencion getIntervencion() {
		return intervencion;
	}

	public void setIntervencion(Intervencion intervencion) {
		this.intervencion = intervencion;
	}

	public TipoTask getTipoTask() {
		return tipoTask;
	}

	public void setTipoTask(TipoTask tipoTask) {
		this.tipoTask = tipoTask;
	}


}
