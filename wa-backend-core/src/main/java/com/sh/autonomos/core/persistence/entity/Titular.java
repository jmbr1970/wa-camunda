package com.sh.autonomos.core.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "WEB", name = "WP2_TITULAR")
public class Titular extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TITULAR_ID")
	private Long id;

	@Column(name = "TITULAR_COD")
	private String direccionCod;

	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "APELLIDO1")
	private String apellido1;
	
	@Column(name = "APELLIDO2")
	private String apellido2;
	
	@Column(name = "DNI")
	private Long dni;
	
	@Column(name = "OBSERVACIONES")
	private String observaciones;
	
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "DATO_CONTACTO_ID", referencedColumnName = "DATO_CONTACTO_ID")
    private DatoContacto datoContacto;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "DIRECCION_ID", referencedColumnName = "DIRECCION_ID")
    private Direccion direccion;

	
	
	

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDireccionCod() {
		return direccionCod;
	}

	public void setDireccionCod(String direccionCod) {
		this.direccionCod = direccionCod;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public Long getDni() {
		return dni;
	}

	public void setDni(Long dni) {
		this.dni = dni;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public DatoContacto getDatoContacto() {
		return datoContacto;
	}

	public void setDatoContacto(DatoContacto datoContacto) {
		this.datoContacto = datoContacto;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	
}
