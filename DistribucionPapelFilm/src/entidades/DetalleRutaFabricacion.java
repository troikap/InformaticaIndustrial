
package entidades;

/**
 *
 * @author TroikaP
 */
public class DetalleRutaFabricacion extends Entidad {
    
    private int ordenDetalleRutaFabricacion;
    private CentroTrabajo centroTrabajo;

    public DetalleRutaFabricacion() {
    }

    public int getOrdenDetalleRutaFabricacion() {
        return ordenDetalleRutaFabricacion;
    }

    public void setOrdenDetalleRutaFabricacion(int ordenDetalleRutaFabricacion) {
        this.ordenDetalleRutaFabricacion = ordenDetalleRutaFabricacion;
    }

    public CentroTrabajo getCentroTrabajo() {
        return centroTrabajo;
    }

    public void setCentroTrabajo(CentroTrabajo centroTrabajo) {
        this.centroTrabajo = centroTrabajo;
    }
    
}
