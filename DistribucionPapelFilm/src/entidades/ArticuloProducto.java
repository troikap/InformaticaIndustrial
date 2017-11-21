
package entidades;

/**
 *
 * @author TroikaP
 */
public class ArticuloProducto extends Entidad {
    
    private int cantidadFabricacion;
    private SubArticulo subArticulo;

    public ArticuloProducto() {
    }

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
