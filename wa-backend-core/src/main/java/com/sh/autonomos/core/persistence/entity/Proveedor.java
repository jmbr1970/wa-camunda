package com.sh.autonomos.core.persistence.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "WEB", name = "WP2_PROVEEDOR")
public class Proveedor extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PROVEEDOR_ID")
	private Long id;

	@Column(name = "PROVEEDOR_COD")
	private Long proveedorCod;

	@Column(name = "PROVEEDOR_NOMBRE")
	private String proveedorNombre;
	
	@Column(name = "OBSERVACIONES")
	private String observaciones;
	
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "DIRECCION_ID", referencedColumnName = "DIRECCION_ID")
    private Direccion direccion;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy ="proveedor")
    private List<ProveedorDatoContacto> proveedorDatoContactoList;

	
	
	

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProveedorCod() {
		return proveedorCod;
	}

	public void setProveedorCod(Long proveedorCod) {
		this.proveedorCod = proveedorCod;
	}

	public String getProveedorNombre() {
		return proveedorNombre;
	}

	public void setProveedorNombre(String proveedorNombre) {
		this.proveedorNombre = proveedorNombre;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public List<ProveedorDatoContacto> getProveedorDatoContactoList() {
		return proveedorDatoContactoList;
	}

	public void setProveedorDatoContactoList(List<ProveedorDatoContacto> proveedorDatoContactoList) {
		this.proveedorDatoContactoList = proveedorDatoContactoList;
	}


}
