/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;
import java.util.List;

/**
 *
 * @author TroikaP
 */
public class OrdenProduccionEstado {
    
    private Date fechaOrdenProduccionEstado;
    private List<SubArticulo> listaSubArticulo;
    private CentroTrabajo centroTrabajo;
    private MaquinaHerramienta maquinaHerramienta;
    private ProductoProcesoElaboracion productoProcesoElaboracion;
    private EstadoOrdenProduccion estadoOrdenProduccion;

    public Date getFechaOrdenProduccionEstado() {
        return fechaOrdenProduccionEstado;
    }

    public void setFechaOrdenProduccionEstado(Date fechaOrdenProduccionEstado) {
        this.fechaOrdenProduccionEstado = fechaOrdenProduccionEstado;
    }

    public List<SubArticulo> getListaSubArticulo() {
        return listaSubArticulo;
    }

    public void setListaSubArticulo(List<SubArticulo> listaSubArticulo) {
        this.listaSubArticulo = listaSubArticulo;
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
