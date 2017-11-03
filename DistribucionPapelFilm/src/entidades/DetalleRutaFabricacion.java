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
public class DetalleRutaFabricacion {
    
    private int ordenDetalleRutaFabricacion;
    private CentroTrabajo centroTrabajo;

    public int getOrdenDetalleRutaFabricacion() {
        return ordenDetalleRutaFabricacion;
    }

    public void setOrdenDetalleRutaFabricacion(int ordenDetalleRutaFabricacion) {
        this.ordenDetalleRutaFabricacion = ordenDetalleRutaFabricacion;
    }

    public CentroTrabajo getCentroTrabajo() {
        return centroTrabajo;
    }

    public void setCentroTrabajo(CentroTrabajo centroTrabajo) {
        this.centroTrabajo = centroTrabajo;
    }
    
}
