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
@Table(schema = "WEB", name = "WP2_EXPEDIENTE")
public class Expediente extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "EXPEDIENTE_ID")
	private Long id;

	@Column(name = "EXPEDIENTE_NUM")
	private String expedienteNum;

	@Column(name = "EXPEDIENTE_AJENO_NUM")
	private String expedienteAjenoNum;

	@Column(name = "PEDIDO_NUM")
	private String pedidoNum;

	@Column(name = "FECHA_HORA_OCURRENCIA")
	private Timestamp fechaHoraOcurrencia;

	@Column(name = "FECHA_HORA_ALTA")
	private Timestamp fechaHoraAlta;

	@Column(name = "FECHA_HORA_CIERRE")
	private Timestamp fechaHoraCierre;

	@Column(name = "EXPEDIENTE_DESC")
	private String expedienteDesc;

	@Column(name = "CAUSA")
	private String causa;

	@Column(name = "VIP_FLAG")
	private Boolean vIPFlag;

	@Column(name = "PERITO_FLAG")
	private Boolean peritoFlag;

	@Column(name = "INCIDENCIA_FLAG")
	private Boolean incidenciaFlag;

	@Column(name = "FRAUDE_FLAG")
	private Boolean fraudeFlag;
	
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "CAPITALES_ID", referencedColumnName = "CAPITALES_ID")
    private Capitales capitales;
    
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "TITULAR_ID", referencedColumnName = "TITULAR_ID")
    private Titular titular;
    
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "CARTERA_ID", referencedColumnName = "CARTERA_ID")
    private Cartera cartera;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "TIPO_APERTURA_EXPEDIENTE_ID", referencedColumnName = "TIPO_APERTURA_EXPEDIENTE_ID")
    private TipoAperturaExpediente tipoAperturaExpediente;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "TIPO_SINIESTRO_ID", referencedColumnName = "TIPO_SINIESTRO_ID")
    private TipoSiniestro tipoSiniestro;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "IMPUTACION_CULPA_ID", referencedColumnName = "IMPUTACION_CULPA_ID")
    private ImputacionCulpa imputacionCulpa;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "ESTADO_EXPEDIENTE_ID", referencedColumnName = "ESTADO_EXPEDIENTE_ID")
    private EstadoExpediente estadoExpediente;
    
    @OneToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "CIERRE_TECNICO_ID", referencedColumnName = "CIERRE_TECNICO_ID")
    private CierreTecnico cierreTecnico;
    
    @OneToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "CIERRE_OPERATIVO_ID", referencedColumnName = "CIERRE_OPERATIVO_ID")
    private CierreOperativo cierreOperativo;
    
    @OneToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "CIERRE_CONTABLE_ID", referencedColumnName = "CIERRE_CONTABLE_ID")
    private CierreContable cierreContable;
	
	

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getPedidoNum() {
		return pedidoNum;
	}

	public void setPedidoNum(String pedidoNum) {
		this.pedidoNum = pedidoNum;
	}

	public Timestamp getFechaHoraOcurrencia() {
		return fechaHoraOcurrencia;
	}

	public void setFechaHoraOcurrencia(Timestamp fechaHoraOcurrencia) {
		this.fechaHoraOcurrencia = fechaHoraOcurrencia;
	}

	public Timestamp getFechaHoraAlta() {
		return fechaHoraAlta;
	}

	public void setFechaHoraAlta(Timestamp fechaHoraAlta) {
		this.fechaHoraAlta = fechaHoraAlta;
	}

	public Timestamp getFechaHoraCierre() {
		return fechaHoraCierre;
	}

	public void setFechaHoraCierre(Timestamp fechaHoraCierre) {
		this.fechaHoraCierre = fechaHoraCierre;
	}

	public String getExpedienteDesc() {
		return expedienteDesc;
	}

	public void setExpedienteDesc(String expedienteDesc) {
		this.expedienteDesc = expedienteDesc;
	}

	public String getCausa() {
		return causa;
	}

	public void setCausa(String causa) {
		this.causa = causa;
	}

	public Boolean getvIPFlag() {
		return vIPFlag;
	}

	public void setvIPFlag(Boolean vIPFlag) {
		this.vIPFlag = vIPFlag;
	}

	public Boolean getPeritoFlag() {
		return peritoFlag;
	}

	public void setPeritoFlag(Boolean peritoFlag) {
		this.peritoFlag = peritoFlag;
	}

	public Boolean getIncidenciaFlag() {
		return incidenciaFlag;
	}

	public void setIncidenciaFlag(Boolean incidenciaFlag) {
		this.incidenciaFlag = incidenciaFlag;
	}

	public Boolean getFraudeFlag() {
		return fraudeFlag;
	}

	public void setFraudeFlag(Boolean fraudeFlag) {
		this.fraudeFlag = fraudeFlag;
	}

	public Capitales getCapitales() {
		return capitales;
	}

	public void setCapitales(Capitales capitales) {
		this.capitales = capitales;
	}

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public Cartera getCartera() {
		return cartera;
	}

	public void setCartera(Cartera cartera) {
		this.cartera = cartera;
	}

	public TipoAperturaExpediente getTipoAperturaExpediente() {
		return tipoAperturaExpediente;
	}

	public void setTipoAperturaExpediente(TipoAperturaExpediente tipoAperturaExpediente) {
		this.tipoAperturaExpediente = tipoAperturaExpediente;
	}

	public TipoSiniestro getTipoSiniestro() {
		return tipoSiniestro;
	}

	public void setTipoSiniestro(TipoSiniestro tipoSiniestro) {
		this.tipoSiniestro = tipoSiniestro;
	}

	public ImputacionCulpa getImputacionCulpa() {
		return imputacionCulpa;
	}

	public void setImputacionCulpa(ImputacionCulpa imputacionCulpa) {
		this.imputacionCulpa = imputacionCulpa;
	}

	public EstadoExpediente getEstadoExpediente() {
		return estadoExpediente;
	}

	public void setEstadoExpediente(EstadoExpediente estadoExpediente) {
		this.estadoExpediente = estadoExpediente;
	}

	public CierreTecnico getCierreTecnico() {
		return cierreTecnico;
	}

	public void setCierreTecnico(CierreTecnico cierreTecnico) {
		this.cierreTecnico = cierreTecnico;
	}

	public CierreOperativo getCierreOperativo() {
		return cierreOperativo;
	}

	public void setCierreOperativo(CierreOperativo cierreOperativo) {
		this.cierreOperativo = cierreOperativo;
	}

	public CierreContable getCierreContable() {
		return cierreContable;
	}

	public void setCierreContable(CierreContable cierreContable) {
		this.cierreContable = cierreContable;
	}

}
