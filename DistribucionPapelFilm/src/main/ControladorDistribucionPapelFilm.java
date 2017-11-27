
package main;
import java.util.*;
import dto.*;
import java.text.ParseException;
/**
 *
 * @author TroikaP
 */
public class ControladorDistribucionPapelFilm {

    private ExpertoDistribucionPapelFilm experto = (ExpertoDistribucionPapelFilm) FabricaExpertoDistribucionPapelFilm.getInstancia().crearExperto("CU1");

    public List<DTOProveedor> BuscarProveedor(String a,boolean b) 
    {
        return experto.BuscarProveedor(a,b);
    }
    public void EliminarProveedor(DTOProveedor a) 
    {
        experto.EliminarProveedor(a);
    }
    public void GuardarProveedor(DTOProveedor dto, boolean Agregar)
    {
        experto.GuardarProveedor(dto, Agregar);
    }
    public List<DTOTipoArticulo> BuscarTipoArticulo(String a,boolean b) 
    {
        return experto.BuscarTipoArticulo(a,b);
    }
    public void EliminarTipoArticulo(DTOTipoArticulo a) 
    {
        experto.EliminarTipoArticulo(a);
    }
    public void GuardarTipoArticulo(DTOTipoArticulo dto, boolean Agregar)
    {
        experto.GuardarTipoArticulo(dto, Agregar);
    }
}
  