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
@Table(schema = "WEB", name = "WP2_DIRECCION")
public class Direccion extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "DIRECCION_ID")
	private Long id;

	@Column(name = "DIRECCION_COD")
	private Long direccionCod;

	@Column(name = "DIRECCION")
	private String direccion;
	
	@Column(name = "POBLACION")
	private String poblacion;
	
	@Column(name = "CODIGO_POSTAL")
	private Long codigoPostal;
	
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "PAIS_ID", referencedColumnName = "PAIS_ID")
    private Pais pais;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "PROVINCIA_ID", referencedColumnName = "PROVINCIA_ID")
    private Provincia provincia;

	
	
	

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDireccionCod() {
		return direccionCod;
	}

	public void setDireccionCod(Long direccionCod) {
		this.direccionCod = direccionCod;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public Long getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(Long codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}


}
