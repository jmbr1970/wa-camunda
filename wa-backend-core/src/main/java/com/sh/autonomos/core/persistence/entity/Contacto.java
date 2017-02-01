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
@Table(schema = "WEB", name = "WP2_CONTACTO")
public class Contacto extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CONTACTO_ID")
	private Long id;

	@Column(name = "CONTACTO_COD")
	private Long contactoCod;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "APELLIDO1")
	private String apellido1;

	@Column(name = "APELLIDO2")
	private String apellido2;

	@Column(name = "NIF")
	private String nif;

	@Column(name = "OBSERVACIONES")
	private String observaciones;

	@Column(name = "CONTACTO_PRIORITARIO_FLAG")
	private String contactoPrioritarioFlag;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "EXPEDIENTE_ID", referencedColumnName = "EXPEDIENTE_ID")
	private Expediente expediente;
	
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name = "INFO_CIA_CONTACTO_ID", referencedColumnName = "INFO_CIA_CONTACTO_ID")
	private InfoCiaContacto infoCiaContacto;
	
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "DATO_CONTACTO_ID", referencedColumnName = "DATO_CONTACTO_ID")
	private DatoContacto datoContacto;
	
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "TIPO_CONTACTO_ID", referencedColumnName = "TIPO_CONTACTO_ID")
	private TipoContacto tipoContacto;
	
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

	public Long getContactoCod() {
		return contactoCod;
	}

	public void setContactoCod(Long contactoCod) {
		this.contactoCod = contactoCod;
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

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getContactoPrioritarioFlag() {
		return contactoPrioritarioFlag;
	}

	public void setContactoPrioritarioFlag(String contactoPrioritarioFlag) {
		this.contactoPrioritarioFlag = contactoPrioritarioFlag;
	}

	public Expediente getExpediente() {
		return expediente;
	}

	public void setExpediente(Expediente expediente) {
		this.expediente = expediente;
	}

	public DatoContacto getDatoContacto() {
		return datoContacto;
	}

	public void setDatoContacto(DatoContacto datoContacto) {
		this.datoContacto = datoContacto;
	}

	public TipoContacto getTipoContacto() {
		return tipoContacto;
	}

	public void setTipoContacto(TipoContacto tipoContacto) {
		this.tipoContacto = tipoContacto;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public InfoCiaContacto getInfoCiaContacto() {
		return infoCiaContacto;
	}

	public void setInfoCiaContacto(InfoCiaContacto infoCiaContacto) {
		this.infoCiaContacto = infoCiaContacto;
	}

}
