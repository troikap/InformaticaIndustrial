
package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TroikaP
 */
public class OrdenProduccion extends Entidad {
    
    private String fechaEntregaOrdenProduccion;
    private String fechaRecepcionOrdenProduccion;
    private int numeroOrdenProduccion;
    private ProductoTerminado productoTerminado;
    private List<OrdenProduccionEstado> ordenProduccionEstadoList = new ArrayList<>();

    public OrdenProduccion() {
    }

    public List<OrdenProduccionEstado> getOrdenProduccionEstadoList() {
        return ordenProduccionEstadoList;
    }

    public void setOrdenProduccionEstadoList(List<OrdenProduccionEstado> listaOrdenProduccionEstado) {
        this.ordenProduccionEstadoList = listaOrdenProduccionEstado;
    }

    public void addOrdenProduccionEstadoList (OrdenProduccionEstado ordenProduccionEstado)
    {
        ordenProduccionEstadoList.add(ordenProduccionEstado);
    }
    
    public String getFechaEntregaOrdenProduccion() {
        return fechaEntregaOrdenProduccion;
    }

    public void setFechaEntregaOrdenProduccion(String fechaEntregaOrdenProduccion) {
        this.fechaEntregaOrdenProduccion = fechaEntregaOrdenProduccion;
    }

    public String getFechaRecepcionOrdenProduccion() {
        return fechaRecepcionOrdenProduccion;
    }

    public void setFechaRecepcionOrdenProduccion(String fechaRecepcionOrdenProduccion) {
        this.fechaRecepcionOrdenProduccion = fechaRecepcionOrdenProduccion;
    }

    public int getNumeroOrdenProduccion() {
        return numeroOrdenProduccion;
    }

    public void setNumeroOrdenProduccion(int numeroOrdenProduccion) {
        this.numeroOrdenProduccion = numeroOrdenProduccion;
    }

    public ProductoTerminado getProductoTerminado() {
        return productoTerminado;
    }

    public void setProductoTerminado(ProductoTerminado productoTerminado) {
        this.productoTerminado = productoTerminado;
    }

    
    
}
