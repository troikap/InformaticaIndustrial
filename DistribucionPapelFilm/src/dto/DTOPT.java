/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;


/**
 *
 * @author Tongas
 */
public class DTOPT {
    
    private int codigo;
    private String nombre;
    private int cantidadOP;
    private float costo;
    private String habilitado;
    private int stock;

    public DTOPT() {
    }

    public DTOPT(int codigo, String nombre, int cantidadOP, float costo, String habilitado, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidadOP = cantidadOP;
        this.costo = costo;
        this.habilitado = habilitado;
        this.stock = stock;
    }

    

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(String habilitado) {
        this.habilitado = habilitado;
    }

    
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadOP() {
        return cantidadOP;
    }

    public void setCantidadOP(int cantidadOP) {
        this.cantidadOP = cantidadOP;
    }
    
    
    
}
