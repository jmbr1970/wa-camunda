package com.sh.autonomos.core.persistence.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "WEB", name = "WP2_CARTERA")
public class Cartera extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CARTERA_ID")
	private Long id;

	@Column(name = "CARTERA_COD")
	private String carteraCod;

	@Column(name = "POLIZA_NUM")
	private String polizaNum;
	
	@Column(name = "FECHA_INICIO")
	private Timestamp fechaInicio;
	
	@Column(name = "FECHA_FIN")
	private Timestamp fechaFin;
	
	@Column(name = "FECHA_ULTIMA_REVISION")
	private Timestamp fechaUltimaRevision;
	
	@Column(name = "FECHA_BAJA_POLIZA")
	private Timestamp fechaBajaPoliza;
	
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "ASEGURADORA_ID", referencedColumnName = "ASEGURADORA_ID")
    private Aseguradora aseguradora;
    
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "MODELO_SEGURO_ID", referencedColumnName = "MODELO_SEGURO_ID")
    private ModeloSeguro modeloSeguro;
    
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "OFICINA_ID", referencedColumnName = "OFICINA_ID")
    private Oficina oficina;
	
	
	
	

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

	public String getPolizaNum() {
		return polizaNum;
	}

	public void setPolizaNum(String polizaNum) {
		this.polizaNum = polizaNum;
	}

	public Timestamp getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Timestamp fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Timestamp getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Timestamp fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Timestamp getFechaUltimaRevision() {
		return fechaUltimaRevision;
	}

	public void setFechaUltimaRevision(Timestamp fechaUltimaRevision) {
		this.fechaUltimaRevision = fechaUltimaRevision;
	}

	public Timestamp getFechaBajaPoliza() {
		return fechaBajaPoliza;
	}

	public void setFechaBajaPoliza(Timestamp fechaBajaPoliza) {
		this.fechaBajaPoliza = fechaBajaPoliza;
	}

	public Aseguradora getAseguradora() {
		return aseguradora;
	}

	public void setAseguradora(Aseguradora aseguradora) {
		this.aseguradora = aseguradora;
	}

	public ModeloSeguro getModeloSeguro() {
		return modeloSeguro;
	}

	public void setModeloSeguro(ModeloSeguro modeloSeguro) {
		this.modeloSeguro = modeloSeguro;
	}

	public Oficina getOficina() {
		return oficina;
	}

	public void setOficina(Oficina oficina) {
		this.oficina = oficina;
	}


}
