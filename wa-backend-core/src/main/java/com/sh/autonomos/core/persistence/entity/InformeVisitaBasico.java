package com.sh.autonomos.core.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "WEB", name = "WP2_INFORME_VISITA_BASICO")
public class InformeVisitaBasico extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "INFORME_VISITA_BASICO_ID")
	private Long id;
	
	@Column(name = "TRABAJOS_REALIZ_CLIENTE_DESC")
	private String trabajosRealizClienteDesc;
	
	@Column(name = "CLIENTE_AUSENTE_FLAG")
	private Boolean clienteAusenteFlag;
	
	@Column(name = "REALIZADO_TRABAJOS_FLAG")
	private Boolean realizadoTrabajosFlag;
	
	@Column(name = "EXISTE_PERJUDICADO_FLAG")
	private Boolean existePerjudicadoFlag;
	
	@Column(name = "TRABAJOS_REALIZ_PERJUDICADO_DESC")
	private String trabajosRealizPerjudicadoDesc;
	
	@Column(name = "SINIESTRO_SIN_COBERTURA_FLAG")
	private Boolean siniestroSinCoberturaFlag;
	
	@Column(name = "TERCER_CAUSANTE_FLAG")
	private Boolean tercerCausanteFlag;
	
	@Column(name = "SE_REQUIERE_PERITO_FLAG")
	private Boolean seRequierePeritoFlag;
	
	@Column(name = "ASEGURADO_SOL_INDEM_FLAG")
	private Boolean aseguradoSolIndemFlag;
	
	@Column(name = "VALORACION_APROX_DA�OS")
	private Long valoracionAproxDanyos;
	
	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTrabajosRealizClienteDesc() {
		return trabajosRealizClienteDesc;
	}

	public void setTrabajosRealizClienteDesc(String trabajosRealizClienteDesc) {
		this.trabajosRealizClienteDesc = trabajosRealizClienteDesc;
	}

	public Boolean getClienteAusenteFlag() {
		return clienteAusenteFlag;
	}

	public void setClienteAusenteFlag(Boolean clienteAusenteFlag) {
		this.clienteAusenteFlag = clienteAusenteFlag;
	}

	public Boolean getRealizadoTrabajosFlag() {
		return realizadoTrabajosFlag;
	}

	public void setRealizadoTrabajosFlag(Boolean realizadoTrabajosFlag) {
		this.realizadoTrabajosFlag = realizadoTrabajosFlag;
	}

	public Boolean getExistePerjudicadoFlag() {
		return existePerjudicadoFlag;
	}

	public void setExistePerjudicadoFlag(Boolean existePerjudicadoFlag) {
		this.existePerjudicadoFlag = existePerjudicadoFlag;
	}

	public String getTrabajosRealizPerjudicadoDesc() {
		return trabajosRealizPerjudicadoDesc;
	}

	public void setTrabajosRealizPerjudicadoDesc(String trabajosRealizPerjudicadoDesc) {
		this.trabajosRealizPerjudicadoDesc = trabajosRealizPerjudicadoDesc;
	}

	public Boolean getSiniestroSinCoberturaFlag() {
		return siniestroSinCoberturaFlag;
	}

	public void setSiniestroSinCoberturaFlag(Boolean siniestroSinCoberturaFlag) {
		this.siniestroSinCoberturaFlag = siniestroSinCoberturaFlag;
	}

	public Boolean getTercerCausanteFlag() {
		return tercerCausanteFlag;
	}

	public void setTercerCausanteFlag(Boolean tercerCausanteFlag) {
		this.tercerCausanteFlag = tercerCausanteFlag;
	}

	public Boolean getSeRequierePeritoFlag() {
		return seRequierePeritoFlag;
	}

	public void setSeRequierePeritoFlag(Boolean seRequierePeritoFlag) {
		this.seRequierePeritoFlag = seRequierePeritoFlag;
	}

	public Boolean getAseguradoSolIndemFlag() {
		return aseguradoSolIndemFlag;
	}

	public void setAseguradoSolIndemFlag(Boolean aseguradoSolIndemFlag) {
		this.aseguradoSolIndemFlag = aseguradoSolIndemFlag;
	}

	public Long getValoracionAproxDanyos() {
		return valoracionAproxDanyos;
	}

	public void setValoracionAproxDanyos(Long valoracionAproxDanyos) {
		this.valoracionAproxDanyos = valoracionAproxDanyos;
	}


}
