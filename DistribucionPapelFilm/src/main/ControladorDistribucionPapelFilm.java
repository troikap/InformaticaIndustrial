
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
    public void GuardarProveedor(DTOProveedor dtoProv)
    {
        
        experto.GuardarProveedor(dtoProv);
    }
    
}
  