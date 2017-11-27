
package main;
import entidades.*;
import java.util.List;
import java.util.ArrayList;
import dto.*;
import java.text.ParseException;
/**
 *
 * @author TroikaP
 */
public class DecoradorDistribucionPapelFilm extends ExpertoDistribucionPapelFilm {
      
    //@Override
    public List<DTOProveedor> BuscarProveedor (String a, boolean b) 
    {
        FachadaInterna.getInstance().iniciarTransaccion();
        List<DTOProveedor> lista = super.BuscarProveedor(a, b);
        FachadaInterna.getInstance().finalizarTransaccion();
        return lista;
    }
    public void EliminarProveedor(DTOProveedor a) 
    {
        FachadaInterna.getInstance().iniciarTransaccion();
        super.EliminarProveedor(a);
        FachadaInterna.getInstance().finalizarTransaccion();
    }
    public void GuardarProveedor(DTOProveedor dto, boolean Agregar)
    {
        FachadaInterna.getInstance().iniciarTransaccion();
        super.GuardarProveedor(dto, Agregar);
        FachadaInterna.getInstance().finalizarTransaccion();
    }
    public List<DTOTipoArticulo> BuscarTipoArticulo (String a, boolean b) 
    {
        FachadaInterna.getInstance().iniciarTransaccion();
        List<DTOTipoArticulo> lista = super.BuscarTipoArticulo(a, b);
        FachadaInterna.getInstance().finalizarTransaccion();
        return lista;
    }
    public void EliminarTipoArticulo(DTOTipoArticulo a) 
    {
        FachadaInterna.getInstance().iniciarTransaccion();
        super.EliminarTipoArticulo(a);
        FachadaInterna.getInstance().finalizarTransaccion();
    }
    public void GuardarTipoArticulo(DTOTipoArticulo dto, boolean Agregar)
    {
        FachadaInterna.getInstance().iniciarTransaccion();
        super.GuardarTipoArticulo(dto, Agregar);
        FachadaInterna.getInstance().finalizarTransaccion();
    }
} 

