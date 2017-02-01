package com.sh.autonomos.core.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(schema = "WEB", name = "WP2_PROVEEDOR_DATO_CONTACTO")
public class ProveedorDatoContacto implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name = "PROVEEDOR_ID", referencedColumnName = "PROVEEDOR_ID")
    private Proveedor proveedor;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn(name = "DATO_CONTACTO_ID", referencedColumnName = "DATO_CONTACTO_ID")
    private DatoContacto datoContacto;
    
	@Column(name = "DATO_CONTACTO_PRIORITARIO_FLAG")
	private Boolean datoContactoPrioritarioFlag;
	
	@Column(name = "DATO_CONTACTO_COMUNICACIONES_FLAG")
	private Boolean datoContactoComunicacionesFlag;

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public DatoContacto getDatoContacto() {
		return datoContacto;
	}

	public void setDatoContacto(DatoContacto datoContacto) {
		this.datoContacto = datoContacto;
	}

	public Boolean getDatoContactoPrioritarioFlag() {
		return datoContactoPrioritarioFlag;
	}

	public void setDatoContactoPrioritarioFlag(Boolean datoContactoPrioritarioFlag) {
		this.datoContactoPrioritarioFlag = datoContactoPrioritarioFlag;
	}

	public Boolean getDatoContactoComunicacionesFlag() {
		return datoContactoComunicacionesFlag;
	}

	public void setDatoContactoComunicacionesFlag(Boolean datoContactoComunicacionesFlag) {
		this.datoContactoComunicacionesFlag = datoContactoComunicacionesFlag;
	}

	
	
}
