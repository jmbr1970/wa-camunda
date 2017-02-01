package com.sh.autonomos.core.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "WEB", name = "WP2_TIPO_TASK")
public class TipoTask extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TIPO_TASK_ID")
	private Long id;

	@Column(name = "TIPO_TASK_DESC")
	private String tipoTaskDesc;

	
	
	

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoTaskDesc() {
		return tipoTaskDesc;
	}

	public void setTipoTaskDesc(String tipoTaskDesc) {
		this.tipoTaskDesc = tipoTaskDesc;
	}


}
