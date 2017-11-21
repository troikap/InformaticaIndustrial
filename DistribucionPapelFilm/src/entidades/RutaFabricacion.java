
package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TroikaP
 */
public class RutaFabricacion extends Entidad {
    
    private int numeroRutaFabricacion;
    private List<DetalleRutaFabricacion> detalleRutaFabricacionList = new ArrayList<>();

    public RutaFabricacion() {
    }

    public List<DetalleRutaFabricacion> getDetalleRutaFabricacionList() {
        return detalleRutaFabricacionList;
    }

    public void setDetalleRutaFabricacionList(List<DetalleRutaFabricacion> detalleRutaFabricacionList) {
        this.detalleRutaFabricacionList = detalleRutaFabricacionList;
    }
    
    public void addDetalleRutaFabricacionList (DetalleRutaFabricacion detalleRutaFabricacion)
    {
        detalleRutaFabricacionList.add(detalleRutaFabricacion);
    }

    public int getNumeroRutaFabricacion() {
        return numeroRutaFabricacion;
    }

    public void setNumeroRutaFabricacion(int numeroRutaFabricacion) {
        this.numeroRutaFabricacion = numeroRutaFabricacion;
    }

}
