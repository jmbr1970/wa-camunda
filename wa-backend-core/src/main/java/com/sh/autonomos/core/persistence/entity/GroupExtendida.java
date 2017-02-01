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
@Table(schema = "WEB", name = "WP2_ID_GROUP_EXTENDIDA")
public class GroupExtendida extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "GROUP_EXTENDIDA_ID")
	private Long id;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "GROUP_AGRUPACION_ID", referencedColumnName = "GROUP_AGRUPACION_ID")
    private GroupAgrupacion groupAgrupacion;

	
	
	

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public GroupAgrupacion getGroupAgrupacion() {
		return groupAgrupacion;
	}

	public void setGroupAgrupacion(GroupAgrupacion groupAgrupacion) {
		this.groupAgrupacion = groupAgrupacion;
	}

}
