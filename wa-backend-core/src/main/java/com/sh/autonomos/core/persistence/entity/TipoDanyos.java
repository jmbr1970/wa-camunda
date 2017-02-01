package com.sh.autonomos.core.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "WEB", name = "WP2_TIPO_DA�OS")
public class TipoDanyos extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TIPO_DA�OS_ID")
	private Long id;

	@Column(name = "TIPO_DA�OS_COD")
	private Long tipoDanyosCod;

	@Column(name = "TIPO_DA�OS_DESC")
	private String tipoDanyosDesc;

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTipoDanyosCod() {
		return tipoDanyosCod;
	}

	public void setTipoDanyosCod(Long tipoDanyosCod) {
		this.tipoDanyosCod = tipoDanyosCod;
	}

	public String getTipoDanyosDesc() {
		return tipoDanyosDesc;
	}

	public void setTipoDanyosDesc(String tipoDanyosDesc) {
		this.tipoDanyosDesc = tipoDanyosDesc;
	}
}