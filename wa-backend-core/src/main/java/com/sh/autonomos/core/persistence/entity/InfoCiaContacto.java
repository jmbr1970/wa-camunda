package com.sh.autonomos.core.persistence.entity;

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
@Table(schema = "WEB", name = "WP2_INFO_CIA_CONTACTO")
public class InfoCiaContacto extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "INFO_CIA_CONTACTO_ID")
	private Long id;

	@Column(name = "INFO_CIA_CONTACTO_COD")
	private Long infoCiaContactoCod;

	@Column(name = "SINIESTRO_CIA_CONTRARIA")
	private String siniestroCiaContraria;
	
	@Column(name = "POLIZA_CIA_CONTRARIA_NUM")
	private String polizaCiaContrariaNum;
	
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "ASEGURADORA_ID", referencedColumnName = "ASEGURADORA_ID")
    private Aseguradora aseguradora;

	
	
	

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getInfoCiaContactoCod() {
		return infoCiaContactoCod;
	}

	public void setInfoCiaContactoCod(Long infoCiaContactoCod) {
		this.infoCiaContactoCod = infoCiaContactoCod;
	}

	public String getSiniestroCiaContraria() {
		return siniestroCiaContraria;
	}

	public void setSiniestroCiaContraria(String siniestroCiaContraria) {
		this.siniestroCiaContraria = siniestroCiaContraria;
	}

	public String getPolizaCiaContrariaNum() {
		return polizaCiaContrariaNum;
	}

	public void setPolizaCiaContrariaNum(String polizaCiaContrariaNum) {
		this.polizaCiaContrariaNum = polizaCiaContrariaNum;
	}

	public Aseguradora getAseguradora() {
		return aseguradora;
	}

	public void setAseguradora(Aseguradora aseguradora) {
		this.aseguradora = aseguradora;
	}


}
