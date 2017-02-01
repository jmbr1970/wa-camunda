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
@Table(schema = "WEB", name = "WP2_SERVICIO")
public class Servicio extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SERVICIO_ID")
	private Long id;

	@Column(name = "SERVICIO_COD")
	private String servicioCod;
	
	@Column(name = "ORDEN_SERVICIO")
	private Integer ordenServicio;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;
	
	@Column(name = "OBSERVACIONES")
	private String observaciones;
	
	@Column(name = "FECHA_HORA_ESTADO")
	private Timestamp fechaHoraEstado;
	
	@Column(name = "FECHA_HORA_ALTA")
	private Timestamp fechaHoraAlta;
	
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "EXPEDIENTE_ID", referencedColumnName = "EXPEDIENTE_ID")
    private Expediente expediente;
    
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "DIRECCION_ID", referencedColumnName = "DIRECCION_ID")
    private Direccion direccion;
    
    @OneToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "CIERRE_SERVICIO_ID", referencedColumnName = "CIERRE_SERVICIO_ID")
    private CierreServicio cierreServicio;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "GREMIO_ID", referencedColumnName = "GREMIO_ID")
    private Gremio gremio;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "TIPO_SERVICIO_ID", referencedColumnName = "TIPO_SERVICIO_ID")
    private TipoServicio tipoServicio;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "ESTADO_SERVICIO_ID", referencedColumnName = "ESTADO_SERVICIO_ID")
    private EstadoServicio estadoServicio;

	

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getServicioCod() {
		return servicioCod;
	}

	public void setServicioCod(String servicioCod) {
		this.servicioCod = servicioCod;
	}

	public Integer getOrdenServicio() {
		return ordenServicio;
	}

	public void setOrdenServicio(Integer ordenServicio) {
		this.ordenServicio = ordenServicio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Timestamp getFechaHoraEstado() {
		return fechaHoraEstado;
	}

	public void setFechaHoraEstado(Timestamp fechaHoraEstado) {
		this.fechaHoraEstado = fechaHoraEstado;
	}

	public Timestamp getFechaHoraAlta() {
		return fechaHoraAlta;
	}

	public void setFechaHoraAlta(Timestamp fechaHoraAlta) {
		this.fechaHoraAlta = fechaHoraAlta;
	}

	public Expediente getExpediente() {
		return expediente;
	}

	public void setExpediente(Expediente expediente) {
		this.expediente = expediente;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public CierreServicio getCierreServicio() {
		return cierreServicio;
	}

	public void setCierreServicio(CierreServicio cierreServicio) {
		this.cierreServicio = cierreServicio;
	}

	public Gremio getGremio() {
		return gremio;
	}

	public void setGremio(Gremio gremio) {
		this.gremio = gremio;
	}

	public TipoServicio getTipoServicio() {
		return tipoServicio;
	}

	public void setTipoServicio(TipoServicio tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	public EstadoServicio getEstadoServicio() {
		return estadoServicio;
	}

	public void setEstadoServicio(EstadoServicio estadoServicio) {
		this.estadoServicio = estadoServicio;
	}

}
