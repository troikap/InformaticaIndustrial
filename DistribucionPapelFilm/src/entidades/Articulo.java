
package entidades;

import java.util.Date;

/**
 *
 * @author TroikaP
 */
public class Articulo extends Entidad {
    
    private int codigoArticulo;
    private String descripcionArticulo;
    private String fechaInhabilitacionArticulo;
    private String nombreArticulo;
    private Proveedor proveedor;
    private TipoArticulo tipoArticulo;

    public Articulo() {
    }

    public int getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(int codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public String getDescripcionArticulo() {
        return descripcionArticulo;
    }

    public void setDescripcionArticulo(String descripcionArticulo) {
        this.descripcionArticulo = descripcionArticulo;
    }

    public String getFechaInhabilitacionArticulo() {
        return fechaInhabilitacionArticulo;
    }

    public void setFechaInhabilitacionArticulo(String fechaInhabilitacionArticulo) {
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
