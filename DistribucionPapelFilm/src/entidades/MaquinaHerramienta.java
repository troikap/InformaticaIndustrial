
package entidades;

/**
 *
 * @author TroikaP
 */
public class MaquinaHerramienta extends Entidad {
    
    private int codigoMaquinaHerramienta;
    private String descripcionMaquinaHerramienta;
    private String nombreMaquinaHerramienta;
    private int numeroMaquinaHerramienta;
    private String fechaInhabilitacionMaquinaHerramienta;

    public MaquinaHerramienta() {
    }

    public String getFechaInhabilitacionMaquinaHerramienta() {
        return fechaInhabilitacionMaquinaHerramienta;
    }

    public void setFechaInhabilitacionMaquinaHerramienta(String fechaInhabilitacionMaquinaHerramienta) {
        this.fechaInhabilitacionMaquinaHerramienta = fechaInhabilitacionMaquinaHerramienta;
    }

    public int getCodigoMaquinaHerramienta() {
        return codigoMaquinaHerramienta;
    }

    public void setCodigoMaquinaHerramienta(int codigoMaquinaHerramienta) {
        this.codigoMaquinaHerramienta = codigoMaquinaHerramienta;
    }

    public String getDescripcionMaquinaHerramienta() {
        return descripcionMaquinaHerramienta;
    }

    public void setDescripcionMaquinaHerramienta(String descripcionMaquinaHerramienta) {
        this.descripcionMaquinaHerramienta = descripcionMaquinaHerramienta;
    }

    public String getNombreMaquinaHerramienta() {
        return nombreMaquinaHerramienta;
    }

    public void setNombreMaquinaHerramienta(String nombreMaquinaHerramienta) {
        this.nombreMaquinaHerramienta = nombreMaquinaHerramienta;
    }

    public int getNumeroMaquinaHerramienta() {
        return numeroMaquinaHerramienta;
    }

    public void setNumeroMaquinaHerramienta(int numeroMaquinaHerramienta) {
        this.numeroMaquinaHerramienta = numeroMaquinaHerramienta;
    }
    
}
