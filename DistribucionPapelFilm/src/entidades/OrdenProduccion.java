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
public class OrdenProduccion {
    
    private Date fechaEntregaOrdenProduccion;
    private Date fechaRecepcionOrdenProduccion;
    private int numeroOrdenProduccion;
    private ProductoTerminado productoTerminado;
    private List<OrdenProduccionEstado> listaOrdenProduccionEstado;

    public List<OrdenProduccionEstado> getListaOrdenProduccionEstado() {
        return listaOrdenProduccionEstado;
    }

    public void setListaOrdenProduccionEstado(List<OrdenProduccionEstado> listaOrdenProduccionEstado) {
        this.listaOrdenProduccionEstado = listaOrdenProduccionEstado;
    }

    public Date getFechaEntregaOrdenProduccion() {
        return fechaEntregaOrdenProduccion;
    }

    public void setFechaEntregaOrdenProduccion(Date fechaEntregaOrdenProduccion) {
        this.fechaEntregaOrdenProduccion = fechaEntregaOrdenProduccion;
    }

    public Date getFechaRecepcionOrdenProduccion() {
        return fechaRecepcionOrdenProduccion;
    }

    public void setFechaRecepcionOrdenProduccion(Date fechaRecepcionOrdenProduccion) {
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
