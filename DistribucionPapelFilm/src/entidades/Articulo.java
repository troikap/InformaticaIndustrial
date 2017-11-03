/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author TroikaP
 */
public class Articulo {
    
    private int codigoArticulo;
    private String descripccionArticulo;
    private Date fechaInhabilitacionArticulo;
    private String nombreArticulo;
    private Proveedor proveedor;
    private TipoArticulo tipoArticulo;

    public int getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(int codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public String getDescripccionArticulo() {
        return descripccionArticulo;
    }

    public void setDescripccionArticulo(String descripccionArticulo) {
        this.descripccionArticulo = descripccionArticulo;
    }

    public Date getFechaInhabilitacionArticulo() {
        return fechaInhabilitacionArticulo;
    }

    public void setFechaInhabilitacionArticulo(Date fechaInhabilitacionArticulo) {
        this.fechaInhabilitacionArticulo = fechaInhabilitacionArticulo;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public TipoArticulo getTipoArticulo() {
        return tipoArticulo;
    }

    public void setTipoArticulo(TipoArticulo tipoArticulo) {
        this.tipoArticulo = tipoArticulo;
    }
    
}
