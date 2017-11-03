/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.List;

/**
 *
 * @author TroikaP
 */
public class RutaFabricacion {
    
    private int numeroRutaFabricacion;
    private List<DetalleRutaFabricacion> listaDetalleRutaFabricacion;

    public int getNumeroRutaFabricacion() {
        return numeroRutaFabricacion;
    }

    public List<DetalleRutaFabricacion> getListaDetalleRutaFabricacion() {
        return listaDetalleRutaFabricacion;
    }

    public void setListaDetalleRutaFabricacion(List<DetalleRutaFabricacion> listaDetalleRutaFabricacion) {
        this.listaDetalleRutaFabricacion = listaDetalleRutaFabricacion;
    }

    public void setNumeroRutaFabricacion(int numeroRutaFabricacion) {
        this.numeroRutaFabricacion = numeroRutaFabricacion;
    }

}
