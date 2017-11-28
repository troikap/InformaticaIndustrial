
package main;

import dto.DTOPT;
import dto.DTOProveedor;
import entidades.ProductoTerminado;
import entidades.Proveedor;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TroikaP
 */
public class ExpertoDistribucionPapelFilm {
    
    public String nuevaFecha()
        {
            String algo= "";
            try {
                //para agregar fecha nueva en formato my sql
                Date nuevoDia= new Date();
                SimpleDateFormat dt = new SimpleDateFormat("dd/mm/yyyy");
            
                Object date = dt.parse(DateFormat.getDateInstance().format(nuevoDia));
                SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-mm-dd");
                algo=dt1.format(date);
                //System.out.println(algo);
                } catch (ParseException ex) 
                    {
                    Logger.getLogger(Experto.class.getName()).log(Level.SEVERE, null, ex);
                    }
            return algo;
        }
    public List<DTOProveedor> BuscarProveedor (String nombre,boolean habilitado) 
        {
            List<DTOCriterio> criterioList = new ArrayList<>();
            DTOCriterio criterio1 = new DTOCriterio();
            criterio1.setAtributo("fechaInhabilitacionProveedor");
            criterio1.setOperacion("isNull");
            criterio1.setValor(null);
            criterioList.clear();
            if (habilitado) {criterioList.add(criterio1);}
            DTOCriterio criterio2 = new DTOCriterio();
            criterio2.setAtributo("nombreProveedor");
            criterio2.setOperacion("LIKE");
            criterio2.setValor(nombre);
            if (nombre != null)criterioList.add(criterio2);
            
            List<Object> busqueda = FachadaPersistencia.getInstance().buscar("Proveedor", criterioList);
            List<DTOProveedor> listdtoProveedor = new ArrayList<>();
            for (Object entidad : busqueda) {
                DTOProveedor dto = new DTOProveedor();
                dto.setCodigoDTOProveedor(((Proveedor)entidad).getCodigoProveedor());
                dto.setNombreDTOProveedor(((Proveedor)entidad).getNombreProveedor());
                dto.setFechaDTOProveedor(((Proveedor)entidad).getFechaInhabilitacionProveedor());
                dto.setCorreoDTOProveedor(((Proveedor)entidad).getCorreoProveedor());
                dto.setDireccionDTOProveedor(((Proveedor)entidad).getDireccionProveedor());
                dto.setTelefonoDTOProveedor(((Proveedor)entidad).getTelefonoProveedor());
                dto.setEliminar(false);
                String f = ((Proveedor)entidad).getFechaInhabilitacionProveedor();
                if (f!=null){
                dto.setFechaDTOProveedor(f);
                }
                else dto.setFechaDTOProveedor("SI");
                listdtoProveedor.add(dto);
            }
            return listdtoProveedor;
        }
    public void EliminarProveedor(DTOProveedor dtoEliminado)
        {
            List<DTOCriterio> criterioList = new ArrayList<>();
            DTOCriterio criterio1 = new DTOCriterio();
            criterio1.setAtributo("codigoProveedor");
            criterio1.setOperacion("LIKE");
            criterio1.setValor(dtoEliminado.getCodigoDTOProveedor());
            criterioList.clear();
            criterioList.add(criterio1);
            Proveedor eliminarProveedor = (Proveedor)FachadaPersistencia.getInstance().buscar("Proveedor", criterioList).get(0);
            String alfa = nuevaFecha();
            eliminarProveedor.setFechaInhabilitacionProveedor(alfa);
            System.out.println("vamos por aca" + eliminarProveedor);
            FachadaPersistencia.getInstance().guardar(eliminarProveedor);
        }
    
    public void GuardarProveedor(DTOProveedor dtoNuevo)
    {
                Proveedor nuevoProveedor = new Proveedor();
                nuevoProveedor.setCodigoProveedor(dtoNuevo.getCodigoDTOProveedor());
                nuevoProveedor.setNombreProveedor(dtoNuevo.getNombreDTOProveedor());
                nuevoProveedor.setFechaInhabilitacionProveedor(null);
                nuevoProveedor.setCorreoProveedor(dtoNuevo.getCorreoDTOProveedor());
                nuevoProveedor.setDireccionProveedor(dtoNuevo.getDireccionDTOProveedor());
                nuevoProveedor.setTelefonoProveedor(dtoNuevo.getTelefonoDTOProveedor());
                /*System.out.println("experto" );
                String a = "";
                boolean b = true;
                List<DTOProveedor> listaAVerificar = BuscarProveedor(a, b);
                System.out.println("en experto" );
                for(DTOProveedor prov : listaAVerificar)
                {
                    if (prov.getCodigoDTOProveedor() != nuevoProveedor.getCodigoProveedor()) 
                    {   
                        if (nuevoProveedor.getNombreProveedor() != null && nuevoProveedor.getCorreoProveedor()!=null && nuevoProveedor.getDireccionProveedor()!=null && nuevoProveedor.getTelefonoProveedor()!=0)
                        {
                            FachadaPersistencia.getInstance().guardar(nuevoProveedor);
                        }
                        else {
                            System.out.println("Alguno de los datos no existe.");
                        }
                    }
                    else {
                    System.out.println("Ya existe Codigo");
                }
            }*/
                FachadaPersistencia.getInstance().guardar(nuevoProveedor);
        }
    
    public List<DTOPT> buscarPT(String nombre, boolean inhabilitado){
        List<DTOCriterio> criterioList = new ArrayList<>();
            DTOCriterio criterio1 = new DTOCriterio();
            criterio1.setAtributo("fechaInhabilitacionProductoTerminado");
            criterio1.setOperacion("isNull");
            criterio1.setValor(null);
            criterioList.clear();
            if (inhabilitado) {criterioList.add(criterio1);}
            DTOCriterio criterio2 = new DTOCriterio();
            criterio2.setAtributo("nombreProductoTerminado");
            criterio2.setOperacion("LIKE");
            criterio2.setValor(nombre);
            if (nombre != null)criterioList.add(criterio2);
            
            List<Object> busqueda = FachadaPersistencia.getInstance().buscar("ProductoTerminado", criterioList);
            List<DTOPT> listdtoPT = new ArrayList<>();
            for (Object entidad : busqueda) {
                DTOPT dto = new DTOPT();
                dto.setCodigo(((ProductoTerminado)entidad).getCodigoProductoTerminado());
                dto.setNombre(((ProductoTerminado)entidad).getNombreProductoTerminado());
                dto.setCosto(((ProductoTerminado)entidad).getCostoProductoTerminado());
                dto.setHabilitado(((ProductoTerminado)entidad).getFechaInhabilitacionProductoTerminado());
                dto.setStock(((ProductoTerminado)entidad).getStockProductoTerminado());
                 
                List<DTOCriterio> criterioList2 = new ArrayList<>();
                    DTOCriterio criterio3 = new DTOCriterio();
                    criterio3.setAtributo("ProductoTerminado");
                    criterio3.setOperacion("LIKE");
                    criterio3.setValor(entidad);
                    List<Object> busqueda2 = FachadaPersistencia.getInstance().buscar("OrdenProduccion", criterioList2);
                dto.setCantidadOP(busqueda2.size());
                
                
                String f = ((ProductoTerminado)entidad).getFechaInhabilitacionProductoTerminado();
                if (f!=null){
                dto.setHabilitado(f);
                }
                else dto.setHabilitado("SI");
                
                listdtoPT.add(dto);
            }
            return listdtoPT;
        }
        
    }
