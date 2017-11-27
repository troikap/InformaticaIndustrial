
package dto;

/**
 *
 * @author TroikaP
 */
public class DTOTipoArticulo {
    
    private int codigoDTOTipoArticulo;
    private String nombreDTOTipoArticulo;
    private String fechaDTOTipoArticulo;

    public DTOTipoArticulo(){
        
    }

    public int getCodigoDTOTipoArticulo() {
        return codigoDTOTipoArticulo;
    }

    public void setCodigoDTOTipoArticulo(int codigoDTOTipoArticulo) {
        this.codigoDTOTipoArticulo = codigoDTOTipoArticulo;
    }

    public String getNombreDTOTipoArticulo() {
        return nombreDTOTipoArticulo;
    }

    public void setNombreDTOTipoArticulo(String nombreDTOTipoArticulo) {
        this.nombreDTOTipoArticulo = nombreDTOTipoArticulo;
    }

    public String getFechaDTOTipoArticulo() {
        return fechaDTOTipoArticulo;
    }

    public void setFechaDTOTipoArticulo(String fechaDTOTipoArticulo) {
        this.fechaDTOTipoArticulo = fechaDTOTipoArticulo;
    }
    
    
}
