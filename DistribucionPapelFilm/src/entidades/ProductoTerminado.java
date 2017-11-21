/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TroikaP
 */
public class ProductoTerminado extends Entidad {
    
    private int codigoProductoTerminado;
    private float costoProductoTerminado;
    private String nombreProductoTerminado;
    private int stockProductoTerminado;
    private String fechaInhabilitacionProductoTerminado;
    private List<ArticuloProducto> articuloProductoList = new ArrayList<>();
    private RutaFabricacion rutaFabricacion;

    public ProductoTerminado() {
    }

    
    public String getFechaInhabilitacionProductoTerminado() {
        return fechaInhabilitacionProductoTerminado;
    }

    public void setFechaInhabilitacionProductoTerminado(String fechaInhabilitacionProductoTerminado) {
        this.fechaInhabilitacionProductoTerminado = fechaInhabilitacionProductoTerminado;
    }
    
    public int getCodigoProductoTerminado() {
        return codigoProductoTerminado;
    }

    public List<ArticuloProducto> getArticuloProductoList() {
        return articuloProductoList;
    }

    public void setArticuloProductoList(List<ArticuloProducto> ArticuloProductoList) {
        this.articuloProductoList = ArticuloProductoList;
    }

    public void addArticuloProductoList (ArticuloProducto articuloProducto)
    {
        articuloProductoList.add(articuloProducto);
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
