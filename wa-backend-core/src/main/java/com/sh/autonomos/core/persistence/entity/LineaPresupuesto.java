package com.sh.autonomos.core.persistence.entity;

import java.sql.Timestamp;

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
@Table(schema = "WEB", name = "WP2_LINEA_PRESUPUESTO")
public class LineaPresupuesto extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "LINEA_PRESUPUESTO_ID")
	private Long id;

	@Column(name = "UNIDADES")
	private Long unidades;

	@Column(name = "importeCliente")
	private Long importeCliente;
	
	@Column(name = "importeProveedor")
	private Long importeProveedor;
	
	@Column(name = "USUARIO_MODIFICACION")
	private String usuarioModificacion;
	
	@Column(name = "FECHA_HORA_MODIFICACION")
	private Timestamp fechaHoraModificacion;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "GREMIO_PRESUPUESTO_ID", referencedColumnName = "GREMIO_PRESUPUESTO_ID")
    private GremioPresupuesto gremioPresupuesto;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "ITEM_LINEA_PRESUPUESTO_ID", referencedColumnName = "ITEM_LINEA_PRESUPUESTO_ID")
    private ItemLineaPresupuesto itemLineaPresupuesto;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "TIPO_DA�OS_ID", referencedColumnName = "TIPO_DA�OS_ID")
    private TipoDanyos tipoDanyos;
    
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "PROVEEDOR_ID", referencedColumnName = "PROVEEDOR_ID")
    private Proveedor proveedor;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "ESTADO_LINEA_PRESUPUESTO_ID", referencedColumnName = "ESTADO_LINEA_PRESUPUESTO_ID")
    private EstadoLineaPresupuesto estadoLineaPresupuesto;

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUnidades() {
		return unidades;
	}

	public void setUnidades(Long unidades) {
		this.unidades = unidades;
	}

	public Long getImporteCliente() {
		return importeCliente;
	}

	public void setImporteCliente(Long importeCliente) {
		this.importeCliente = importeCliente;
	}

	public Long getImporteProveedor() {
		return importeProveedor;
	}

	public void setImporteProveedor(Long importeProveedor) {
		this.importeProveedor = importeProveedor;
	}

	public String getUsuarioModificacion() {
		return usuarioModificacion;
	}

	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}

	public Timestamp getFechaHoraModificacion() {
		return fechaHoraModificacion;
	}

	public void setFechaHoraModificacion(Timestamp fechaHoraModificacion) {
		this.fechaHoraModificacion = fechaHoraModificacion;
	}

	public GremioPresupuesto getGremioPresupuesto() {
		return gremioPresupuesto;
	}

	public void setGremioPresupuesto(GremioPresupuesto gremioPresupuesto) {
		this.gremioPresupuesto = gremioPresupuesto;
	}

	public ItemLineaPresupuesto getItemLineaPresupuesto() {
		return itemLineaPresupuesto;
	}

	public void setItemLineaPresupuesto(ItemLineaPresupuesto itemLineaPresupuesto) {
		this.itemLineaPresupuesto = itemLineaPresupuesto;
	}

	public TipoDanyos getTipoDanyos() {
		return tipoDanyos;
	}

	public void setTipoDanyos(TipoDanyos tipoDanyos) {
		this.tipoDanyos = tipoDanyos;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public EstadoLineaPresupuesto getEstadoLineaPresupuesto() {
		return estadoLineaPresupuesto;
	}

	public void setEstadoLineaPresupuesto(EstadoLineaPresupuesto estadoLineaPresupuesto) {
		this.estadoLineaPresupuesto = estadoLineaPresupuesto;
	}
}