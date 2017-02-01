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
@Table(schema = "WEB", name = "WP2_ITEM_LINEA_PRESUPUESTO")
public class ItemLineaPresupuesto extends BaseModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ITEM_LINEA_PRESUPUESTO_ID")
	private Long id;

	@Column(name = "ITEM_LINEA_PRESUPUESTO_COD")
	private Long itemLineaPresupuestoCod;

	@Column(name = "ITEM_LINEA_PRESUPUESTO_DESC")
	private String itemLineaPresupuestoDesc;
	
	@Column(name = "importeCliente")
	private Long importeCliente;
	
	@Column(name = "importeProveedor")
	private Long importeProveedor;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "TIPO_INTERVENCION_LINEA_PRESUPUESTO_ID", referencedColumnName = "TIPO_INTERVENCION_LINEA_PRESUPUESTO_ID")
    private TipoIntervencionLineaPresupuesto tipoIntervencionLineaPresupuesto;
	
	

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getItemLineaPresupuestoCod() {
		return itemLineaPresupuestoCod;
	}

	public void setItemLineaPresupuestoCod(Long itemLineaPresupuestoCod) {
		this.itemLineaPresupuestoCod = itemLineaPresupuestoCod;
	}

	public String getItemLineaPresupuestoDesc() {
		return itemLineaPresupuestoDesc;
	}

	public void setItemLineaPresupuestoDesc(String itemLineaPresupuestoDesc) {
		this.itemLineaPresupuestoDesc = itemLineaPresupuestoDesc;
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

	public TipoIntervencionLineaPresupuesto getTipoIntervencionLineaPresupuesto() {
		return tipoIntervencionLineaPresupuesto;
	}

	public void setTipoIntervencionLineaPresupuesto(TipoIntervencionLineaPresupuesto tipoIntervencionLineaPresupuesto) {
		this.tipoIntervencionLineaPresupuesto = tipoIntervencionLineaPresupuesto;
	}


}
