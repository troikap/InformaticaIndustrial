
package dto;
import entidades.TipoArticulo;
import entidades.Proveedor;
/**
 *
 * @author TroikaP
 */
public class DTOArticulo {
    private int codigoDTOArticulo;
    private String descripcionDTOArticulo;
    private String fechaDTOArticulo;
    private String nombreDTOArticulo;
    private DTOProveedor dtoProveedorDTOArticulo;
    private DTOTipoArticulo dtoTipoArticuloDTOArticulo;

    public int getCodigoDTOArticulo() {
        return codigoDTOArticulo;
    }

    public void setCodigoDTOArticulo(int codigoDTOArticulo) {
        this.codigoDTOArticulo = codigoDTOArticulo;
    }

    public String getDescripcionDTOArticulo() {
        return descripcionDTOArticulo;
    }

    public void setDescripcionDTOArticulo(String descripcionDTOArticulo) {
        this.descripcionDTOArticulo = descripcionDTOArticulo;
    }

    public String getFechaDTOArticulo() {
        return fechaDTOArticulo;
    }

    public void setFechaDTOArticulo(String fechaDTOArticulo) {
        this.fechaDTOArticulo = fechaDTOArticulo;
    }

    public String getNombreDTOArticulo() {
        return nombreDTOArticulo;
    }

    public void setNombreDTOArticulo(String nombreDTOArticulo) {
        this.nombreDTOArticulo = nombreDTOArticulo;
    }

    public DTOProveedor getDtoProveedorDTOArticulo() {
        return dtoProveedorDTOArticulo;
    }

    public void setDtoProveedorDTOArticulo(DTOProveedor dtoProveedorDTOArticulo) {
        this.dtoProveedorDTOArticulo = dtoProveedorDTOArticulo;
    }
    

    public DTOTipoArticulo getDtoTipoArticuloDTOArticulo() {
        return dtoTipoArticuloDTOArticulo;
    }

    public void setDtoTipoArticuloDTOArticulo(DTOTipoArticulo dtoTipoArticuloDTOArticulo) {
        this.dtoTipoArticuloDTOArticulo = dtoTipoArticuloDTOArticulo;
    }
    
    
}
