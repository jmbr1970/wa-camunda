package com.sh.autonomos.core.persistence.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "WEB", name = "WP2_INTERVENCION")
public class Intervencion extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "INTERVENCION_ID")
	private Long id;
	
	@Column(name = "LOCALIZADO_CLIENTE_CITA_FLAG")
	private Boolean localizadoClienteCitaFlag;
	
	@Column(name = "OBSERVACIONES")
	private String observaciones;
	
	@Column(name = "MOTIVO_REPROGRAMACION_CITA")
	private String motivoReprogramacionCita;
	
	@Column(name = "FECHA_HORA_ASIGNACION_PROVEEDOR")
	private Timestamp fechaHoraAsignacionProveedor;
	
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "SERVICIO_ID", referencedColumnName = "SERVICIO_ID")
    private Servicio servicio;
    
    @OneToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "CITA_ID", referencedColumnName = "CITA_ID")
    private Cita cita;
    
    @OneToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "INFORME_VISITA_BASICO_ID", referencedColumnName = "INFORME_VISITA_BASICO_ID")
    private InformeVisitaBasico informeVisitaBasico;
    
    @OneToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "LLEGADA_ID", referencedColumnName = "LLEGADA_ID")
    private Llegada llegada;
    
    @OneToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "PROVEEDOR_ID", referencedColumnName = "PROVEEDOR_ID")
    private Proveedor proveedor;
    
    @OneToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "OPERARIO_ID", referencedColumnName = "OPERARIO_ID")
    private Operario operario;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy ="intervencion")
    private List<ProveedorParaAsignar> proveedorParaAsignarList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy ="intervencion")
    private List<RechazoProveedor> rechadoProveedorList;

	

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getLocalizadoClienteCitaFlag() {
		return localizadoClienteCitaFlag;
	}

	public void setLocalizadoClienteCitaFlag(Boolean localizadoClienteCitaFlag) {
		this.localizadoClienteCitaFlag = localizadoClienteCitaFlag;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getMotivoReprogramacionCita() {
		return motivoReprogramacionCita;
	}

	public void setMotivoReprogramacionCita(String motivoReprogramacionCita) {
		this.motivoReprogramacionCita = motivoReprogramacionCita;
	}

	public Timestamp getFechaHoraAsignacionProveedor() {
		return fechaHoraAsignacionProveedor;
	}

	public void setFechaHoraAsignacionProveedor(Timestamp fechaHoraAsignacionProveedor) {
		this.fechaHoraAsignacionProveedor = fechaHoraAsignacionProveedor;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public Cita getCita() {
		return cita;
	}

	public void setCita(Cita cita) {
		this.cita = cita;
	}

	public InformeVisitaBasico getInformeVisitaBasico() {
		return informeVisitaBasico;
	}

	public void setInformeVisitaBasico(InformeVisitaBasico informeVisitaBasico) {
		this.informeVisitaBasico = informeVisitaBasico;
	}

	public Llegada getLlegada() {
		return llegada;
	}

	public void setLlegada(Llegada llegada) {
		this.llegada = llegada;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public Operario getOperario() {
		return operario;
	}

	public void setOperario(Operario operario) {
		this.operario = operario;
	}

	public List<ProveedorParaAsignar> getProveedorParaAsignarList() {
		return proveedorParaAsignarList;
	}

	public void setProveedorParaAsignarList(List<ProveedorParaAsignar> proveedorParaAsignarList) {
		this.proveedorParaAsignarList = proveedorParaAsignarList;
	}

	public List<RechazoProveedor> getRechadoProveedorList() {
		return rechadoProveedorList;
	}

	public void setRechadoProveedorList(List<RechazoProveedor> rechadoProveedorList) {
		this.rechadoProveedorList = rechadoProveedorList;
	}


}
