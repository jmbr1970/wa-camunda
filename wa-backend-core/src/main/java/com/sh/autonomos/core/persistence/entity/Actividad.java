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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "WEB", name = "WP2_ACTIVIDAD")
public class Actividad extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ACTIVIDAD_ID")
	private Long id;

	@Column(name = "ACTIVIDAD_COD")
	private String carteraCod;

	@Column(name = "EXPEDIENTE_NUM")
	private String expedienteNum;
	
	@Column(name = "EXPEDIENTE_AJENO_NUM")
	private String expedienteAjenoNum;
	
	@Column(name = "FECHA_HORA_ALTA")
	private Timestamp fechaHoraAlta;
	
	@Column(name = "CAUSA_EXPEDIENTE")
	private String causaExpediente;
	
	@Column(name = "GREMIO_DESC")
	private String gremioDesc;
	
	@Column(name = "FECHA_HORA_CIERRE_TECNICO")
	private Timestamp fechaHoraCierreTecnico;
	
	@Column(name = "COSTE")
	private Long coste;
	
	@Column(name = "SERVICIO_DESC")
	private String servicioDesc;
	
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "EXPEDIENTE_ID", referencedColumnName = "EXPEDIENTE_ID")
    private Expediente expediente;
    
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "GREMIO_ID", referencedColumnName = "GREMIO_ID")
    private Gremio gremio;
    
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "ESTADO_ACTIVIDAD_ID", referencedColumnName = "ESTADO_ACTIVIDAD_ID")
    private EstadoActividad estadoActividad;
	
	

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCarteraCod() {
		return carteraCod;
	}

	public void setCarteraCod(String carteraCod) {
		this.carteraCod = carteraCod;
	}

	public String getExpedienteNum() {
		return expedienteNum;
	}

	public void setExpedienteNum(String expedienteNum) {
		this.expedienteNum = expedienteNum;
	}

	public String getExpedienteAjenoNum() {
		return expedienteAjenoNum;
	}

	public void setExpedienteAjenoNum(String expedienteAjenoNum) {
		this.expedienteAjenoNum = expedienteAjenoNum;
	}

	public Timestamp getFechaHoraAlta() {
		return fechaHoraAlta;
	}

	public void setFechaHoraAlta(Timestamp fechaHoraAlta) {
		this.fechaHoraAlta = fechaHoraAlta;
	}

	public String getCausaExpediente() {
		return causaExpediente;
	}

	public void setCausaExpediente(String causaExpediente) {
		this.causaExpediente = causaExpediente;
	}

	public String getGremioDesc() {
		return gremioDesc;
	}

	public void setGremioDesc(String gremioDesc) {
		this.gremioDesc = gremioDesc;
	}

	public Timestamp getFechaHoraCierreTecnico() {
		return fechaHoraCierreTecnico;
	}

	public void setFechaHoraCierreTecnico(Timestamp fechaHoraCierreTecnico) {
		this.fechaHoraCierreTecnico = fechaHoraCierreTecnico;
	}

	public Long getCoste() {
		return coste;
	}

	public void setCoste(Long coste) {
		this.coste = coste;
	}

	public String getServicioDesc() {
		return servicioDesc;
	}

	public void setServicioDesc(String servicioDesc) {
		this.servicioDesc = servicioDesc;
	}

	public Expediente getExpediente() {
		return expediente;
	}

	public void setExpediente(Expediente expediente) {
		this.expediente = expediente;
	}

	public Gremio getGremio() {
		return gremio;
	}

	public void setGremio(Gremio gremio) {
		this.gremio = gremio;
	}

	public EstadoActividad getEstadoActividad() {
		return estadoActividad;
	}

	public void setEstadoActividad(EstadoActividad estadoActividad) {
		this.estadoActividad = estadoActividad;
	}


}
