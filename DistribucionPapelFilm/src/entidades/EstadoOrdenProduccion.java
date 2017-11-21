/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author TroikaP
 */
public class EstadoOrdenProduccion extends Entidad {
    
    private String nombreEstadoOrdenProduccion;
    private int codigoEstadoOrdenProduccion;
    private String fechaInhabilitacionEstadoOrdenProduccion;

    public EstadoOrdenProduccion() {
    }

    public String getFechaInhabilitacionEstadoOrdenProduccion() {
        return fechaInhabilitacionEstadoOrdenProduccion;
    }

    public void setFechaInhabilitacionEstadoOrdenProduccion(String fechaInhabilitacionEstadoOrdenProduccion) {
        this.fechaInhabilitacionEstadoOrdenProduccion = fechaInhabilitacionEstadoOrdenProduccion;
    }

    public int getCodigoEstadoOrdenProduccion() {
        return codigoEstadoOrdenProduccion;
    }

    public void setCodigoEstadoOrdenProduccion(int codigoEstadoOrdenProduccion) {
        this.codigoEstadoOrdenProduccion = codigoEstadoOrdenProduccion;
    }
    
    public String getNombreEstadoOrdenProduccion() {
        return nombreEstadoOrdenProduccion;
    }

    public void setNombreEstadoOrdenProduccion(String nombreEstadoOrdenProduccion) {
        this.nombreEstadoOrdenProduccion = nombreEstadoOrdenProduccion;
    }
    
}
