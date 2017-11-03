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
public class ArticuloProducto {
    
    private int cantidadFabricacion;
    private SubArticulo subArticulo;

    public int getCantidadFabricacion() {
        return cantidadFabricacion;
    }

    public void setCantidadFabricacion(int cantidadFabricacion) {
        this.cantidadFabricacion = cantidadFabricacion;
    }

    public SubArticulo getSubArticulo() {
        return subArticulo;
    }

    public void setSubArticulo(SubArticulo subArticulo) {
        this.subArticulo = subArticulo;
    }
    
}
