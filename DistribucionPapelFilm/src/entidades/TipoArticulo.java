
package entidades;

/**
 *
 * @author TroikaP
 */
public class TipoArticulo extends Entidad {
    
    private int codigoTipoArticulo;
    private String nombreTipoArticulo;
    private String fechaInhabilitacionTipoArticulo;

    public TipoArticulo(){
        
    }
    
    public String getFechaInhabilitacionTipoArticulo() {
        return fechaInhabilitacionTipoArticulo;
    }

    public void setFechaInhabilitacionTipoArticulo(String fechaInhabilitacionTipoArticulo) {
        this.fechaInhabilitacionTipoArticulo = fechaInhabilitacionTipoArticulo;
    }

    public int getCodigoTipoArticulo() {
        return codigoTipoArticulo;
    }

    public void setCodigoTipoArticulo(int codigoTipoArticulo) {
        this.codigoTipoArticulo = codigoTipoArticulo;
    }

    public String getNombreTipoArticulo() {
        return nombreTipoArticulo;
    }

    public void setNombreTipoArticulo(String nombreTipoArticulo) {
        this.nombreTipoArticulo = nombreTipoArticulo;
    }
    
}
