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
public class ProductoTerminado {
    
    private int codigoProductoTerminado;
    private float costoProductoTerminado;
    private String nombreProductoTerminado;
    private int stockProductoTerminado;
    private List<ArticuloProducto> listaArticuloProducto;
    private RutaFabricacion rutaFabricacion;

    public int getCodigoProductoTerminado() {
        return codigoProductoTerminado;
    }

    public List<ArticuloProducto> getListaArticuloProducto() {
        return listaArticuloProducto;
    }

    public void setListaArticuloProducto(List<ArticuloProducto> listaArticuloProducto) {
        this.listaArticuloProducto = listaArticuloProducto;
    }

    public void setCodigoProductoTerminado(int codigoProductoTerminado) {
        this.codigoProductoTerminado = codigoProductoTerminado;
    }

    public float getCostoProductoTerminado() {
        return costoProductoTerminado;
    }

    public void setCostoProductoTerminado(float costoProductoTerminado) {
        this.costoProductoTerminado = costoProductoTerminado;
    }

    public String getNombreProductoTerminado() {
        return nombreProductoTerminado;
    }

    public void setNombreProductoTerminado(String nombreProductoTerminado) {
        this.nombreProductoTerminado = nombreProductoTerminado;
    }

    public int getStockProductoTerminado() {
        return stockProductoTerminado;
    }

    public void setStockProductoTerminado(int stockProductoTerminado) {
        this.stockProductoTerminado = stockProductoTerminado;
    }

    public RutaFabricacion getRutaFabricacion() {
        return rutaFabricacion;
    }

    public void setRutaFabricacion(RutaFabricacion rutaFabricacion) {
        this.rutaFabricacion = rutaFabricacion;
    }
    
}
