package com.sh.autonomos.core.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "WEB", name = "WP2_GROUP_AGRUPACION")
public class GroupAgrupacion extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "GROUP_AGRUPACION_ID")
	private Long id;

	@Column(name = "GROUP_AGRUPACION_DESC")
	private String groupAgrupacionDesc;

	
	
	

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGroupAgrupacionDesc() {
		return groupAgrupacionDesc;
	}

	public void setGroupAgrupacionDesc(String groupAgrupacionDesc) {
		this.groupAgrupacionDesc = groupAgrupacionDesc;
	}


}
