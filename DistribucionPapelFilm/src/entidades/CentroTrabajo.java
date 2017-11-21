
package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TroikaP
 */
public class CentroTrabajo extends Entidad {
    
    private int codigoCentroTrabajo;
    private String nombreCentroTrabajo;
    private float tiempoPorUnidadCentroTrabajo;
    private String tipoDeUnidadCentroTrabajo;
    private String fechaInhabilitacionCentroTrabajo;
    private List<MaquinaHerramienta> maquinaHerramientaList = new ArrayList<>();

    public CentroTrabajo() {
    }

    public String getFechaInhabilitacionCentroTrabajo() {
        return fechaInhabilitacionCentroTrabajo;
    }

    public void setFechaInhabilitacionCentroTrabajo(String fechaInhabilitacionCentroTrabajo) {
        this.fechaInhabilitacionCentroTrabajo = fechaInhabilitacionCentroTrabajo;
    }

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

    public List<MaquinaHerramienta> getMaquinaHerramientaList() {
        return maquinaHerramientaList;
    }

    public void setMaquinaHerramientaList(List<MaquinaHerramienta> listaMaquinaHerramienta) {
        this.maquinaHerramientaList = listaMaquinaHerramienta;
    }
    
    public void addMaquinaHerramientaList (MaquinaHerramienta numeracionAtributo)
    {
        maquinaHerramientaList.add(numeracionAtributo);
    }
    
}
