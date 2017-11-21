
package entidades;

import java.util.List;

/**
 *
 * @author TroikaP
 */
public class OrdenProduccionEstado extends Entidad {
    
    private String fechaOrdenProduccionEstado;
    private List<SubArticulo> subArticuloList;
    private CentroTrabajo centroTrabajo;
    private MaquinaHerramienta maquinaHerramienta;
    private ProductoProcesoElaboracion productoProcesoElaboracion;
    private EstadoOrdenProduccion estadoOrdenProduccion;

    public OrdenProduccionEstado() {
    }

    public String getFechaOrdenProduccionEstado() {
        return fechaOrdenProduccionEstado;
    }

    public void setFechaOrdenProduccionEstado(String fechaOrdenProduccionEstado) {
        this.fechaOrdenProduccionEstado = fechaOrdenProduccionEstado;
    }

    public List<SubArticulo> getSubArticuloList() {
        return subArticuloList;
    }

    public void setSubArticuloList(List<SubArticulo> subArticuloList) {
        this.subArticuloList = subArticuloList;
    }
    
    public void addSubArticuloList (SubArticulo subArticulo)
    {
        subArticuloList.add(subArticulo);
    }

    public CentroTrabajo getCentroTrabajo() {
        return centroTrabajo;
    }

    public void setCentroTrabajo(CentroTrabajo centroTrabajo) {
        this.centroTrabajo = centroTrabajo;
    }

    public MaquinaHerramienta getMaquinaHerramienta() {
        return maquinaHerramienta;
    }

    public void setMaquinaHerramienta(MaquinaHerramienta maquinaHerramienta) {
        this.maquinaHerramienta = maquinaHerramienta;
    }

    public ProductoProcesoElaboracion getProductoProcesoElaboracion() {
        return productoProcesoElaboracion;
    }

    public void setProductoProcesoElaboracion(ProductoProcesoElaboracion productoProcesoElaboracion) {
        this.productoProcesoElaboracion = productoProcesoElaboracion;
    }

    public EstadoOrdenProduccion getEstadoOrdenProduccion() {
        return estadoOrdenProduccion;
    }

    public void setEstadoOrdenProduccion(EstadoOrdenProduccion estadoOrdenProduccion) {
        this.estadoOrdenProduccion = estadoOrdenProduccion;
    }
    
}
