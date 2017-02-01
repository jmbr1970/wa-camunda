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
@Table(schema = "WEB", name = "WP2_RECHAZO_PROVEEDOR")
public class RechazoProveedor extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "RECHAZO_PROVEEDOR_ID")
	private Long id;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "INTERVENCION_ID", referencedColumnName = "INTERVENCION_ID")
    private Intervencion intervencion;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "PROVEEDOR_ID", referencedColumnName = "PROVEEDOR_ID")
    private Proveedor proveedor;
    
	
	

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Intervencion getIntervencion() {
		return intervencion;
	}

	public void setIntervencion(Intervencion intervencion) {
		this.intervencion = intervencion;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}


}
