
package entidades;

/**
 *
 * @author TroikaP
 */
public class SubArticulo extends Entidad {
    
    private int codigoSubArticulo;
    private float costoSubArticulo;
    private String descripcionSubArticulo;
    private String fechaInhabilitacionSubArticulo;
    private String nombreSubArticulo;
    private int stockSubArticulo;
    private Articulo articulo;

    public SubArticulo() {
    }

    public int getCodigoSubArticulo() {
        return codigoSubArticulo;
    }

    public void setCodigoSubArticulo(int codigoSubArticulo) {
        this.codigoSubArticulo = codigoSubArticulo;
    }

    public float getCostoSubArticulo() {
        return costoSubArticulo;
    }

    public void setCostoSubArticulo(float costoSubArticulo) {
        this.costoSubArticulo = costoSubArticulo;
    }

    public String getDescripcionSubArticulo() {
        return descripcionSubArticulo;
    }

    public void setDescripcionSubArticulo(String descripcionSubArticulo) {
        this.descripcionSubArticulo = descripcionSubArticulo;
    }

    public String getFechaInhabilitacionSubArticulo() {
        return fechaInhabilitacionSubArticulo;
    }

    public void setFechaInhabilitacionSubArticulo(String fechaInhabilitacionSubArticulo) {
        this.fechaInhabilitacionSubArticulo = fechaInhabilitacionSubArticulo;
    }

    public String getNombreSubArticulo() {
        return nombreSubArticulo;
    }

    public void setNombreSubArticulo(String nombreSubArticulo) {
        this.nombreSubArticulo = nombreSubArticulo;
    }

    public int getStockSubArticulo() {
        return stockSubArticulo;
    }

    public void setStockSubArticulo(int stockSubArticulo) {
        this.stockSubArticulo = stockSubArticulo;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
    
}
