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
public class Proveedor extends Entidad {
    
    private int codigoProveedor;
    private String correoProveedor;
    private String direccionProveedor;
    private String nombreProveedor;
    private int telefonoProveedor;
    private String fechaInhabilitacionProveedor;

    public Proveedor() {
    }

    public String getFechaInhabilitacionProveedor() {
        return fechaInhabilitacionProveedor;
    }

    public void setFechaInhabilitacionProveedor(String fechaInhabilitacionProveedor) {
        this.fechaInhabilitacionProveedor = fechaInhabilitacionProveedor;
    }
    
    public int getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(int codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }
    
    public String getCorreoProveedor() {
        return correoProveedor;
    }

    public void setCorreoProveedor(String correoProveedor) {
        this.correoProveedor = correoProveedor;
    }

    public String getDireccionProveedor() {
        return direccionProveedor;
    }

    public void setDireccionProveedor(String direccionProveedor) {
        this.direccionProveedor = direccionProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public int getTelefonoProveedor() {
        return telefonoProveedor;
    }

    public void setTelefonoProveedor(int telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }
}
