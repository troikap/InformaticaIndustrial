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
public class CentroTrabajo {
    
    private int codigoCentroTrabajo;
    private String nombreCentroTrabajo;
    private float tiempoPorUnidadCentroTrabajo;
    private String tipoDeUnidadCentroTrabajo;
    private List<MaquinaHerramienta> listaMaquinaHerramienta;

    public int getCodigoCentroTrabajo() {
        return codigoCentroTrabajo;
    }

    public void setCodigoCentroTrabajo(int codigoCentroTrabajo) {
        this.codigoCentroTrabajo = codigoCentroTrabajo;
    }

    public String getNombreCentroTrabajo() {
        return nombreCentroTrabajo;
    }

    public void setNombreCentroTrabajo(String nombreCentroTrabajo) {
        this.nombreCentroTrabajo = nombreCentroTrabajo;
    }

    public float getTiempoPorUnidadCentroTrabajo() {
        return tiempoPorUnidadCentroTrabajo;
    }

    public void setTiempoPorUnidadCentroTrabajo(float tiempoPorUnidadCentroTrabajo) {
        this.tiempoPorUnidadCentroTrabajo = tiempoPorUnidadCentroTrabajo;
    }

    public String getTipoDeUnidadCentroTrabajo() {
        return tipoDeUnidadCentroTrabajo;
    }

    public void setTipoDeUnidadCentroTrabajo(String tipoDeUnidadCentroTrabajo) {
        this.tipoDeUnidadCentroTrabajo = tipoDeUnidadCentroTrabajo;
    }

    public List<MaquinaHerramienta> getListaMaquinaHerramienta() {
        return listaMaquinaHerramienta;
    }

    public void setListaMaquinaHerramienta(List<MaquinaHerramienta> listaMaquinaHerramienta) {
        this.listaMaquinaHerramienta = listaMaquinaHerramienta;
    }
    
}
