
package main;

import dto.*;
import entidades.*;
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
            List<DTOProveedor> listdto = new ArrayList<>();
            for (Object entidad : busqueda) {
                DTOProveedor dto = new DTOProveedor();
                dto.setCodigoDTOProveedor(((Proveedor)entidad).getCodigoProveedor());
                dto.setNombreDTOProveedor(((Proveedor)entidad).getNombreProveedor());
                dto.setFechaDTOProveedor(((Proveedor)entidad).getFechaInhabilitacionProveedor());
                dto.setCorreoDTOProveedor(((Proveedor)entidad).getCorreoProveedor());
                dto.setDireccionDTOProveedor(((Proveedor)entidad).getDireccionProveedor());
                dto.setTelefonoDTOProveedor(((Proveedor)entidad).getTelefonoProveedor());
                String f = ((Proveedor)entidad).getFechaInhabilitacionProveedor();
                if (f!=null){
                dto.setFechaDTOProveedor(f);
                }
                else dto.setFechaDTOProveedor("SI");
                listdto.add(dto);
            }
            return listdto;
        }
    public void EliminarProveedor(DTOProveedor dtoEliminado)
        {
            List<DTOCriterio> criterioList = new ArrayList<>();
            DTOCriterio criterio1 = new DTOCriterio();
            criterio1.setAtributo("codigoProveedor");
            criterio1.setOperacion("=");
            criterio1.setValor(dtoEliminado.getCodigoDTOProveedor());
            criterioList.clear();
            criterioList.add(criterio1);
            Proveedor eliminarProveedor = (Proveedor)FachadaPersistencia.getInstance().buscar("Proveedor", criterioList).get(0);
            String alfa = nuevaFecha();
            eliminarProveedor.setFechaInhabilitacionProveedor(alfa);
            FachadaPersistencia.getInstance().guardar(eliminarProveedor);
        }
    public void GuardarProveedor(DTOProveedor dtoNuevo, boolean Agregar)
        {
            int uno = dtoNuevo.getCodigoDTOProveedor();
            String dos = dtoNuevo.getNombreDTOProveedor();
            int tres = dtoNuevo.getTelefonoDTOProveedor();
            String cuatro = dtoNuevo.getCorreoDTOProveedor();
            String cinco = dtoNuevo.getDireccionDTOProveedor();
            String seis = dtoNuevo.getFechaDTOProveedor();
            Proveedor nuevo = new Proveedor();
            nuevo.setCodigoProveedor(uno);
            nuevo.setNombreProveedor(dos);
            nuevo.setTelefonoProveedor(tres);
            nuevo.setCorreoProveedor(cuatro);
            nuevo.setDireccionProveedor(cinco);
            nuevo.setFechaInhabilitacionProveedor(seis);
            List<Object> lista = FachadaPersistencia.getInstance().buscar("Proveedor", null);
            List<DTOProveedor> listDTO = new ArrayList<>();
            for (Object entidad : lista) 
                {
                    DTOProveedor cadaDTO= new DTOProveedor();
                    cadaDTO.setCodigoDTOProveedor(((Proveedor)entidad).getCodigoProveedor());
                    cadaDTO.setNombreDTOProveedor(((Proveedor)entidad).getNombreProveedor());
                    cadaDTO.setTelefonoDTOProveedor(((Proveedor)entidad).getTelefonoProveedor());
                    cadaDTO.setCorreoDTOProveedor(((Proveedor)entidad).getCorreoProveedor());
                    cadaDTO.setDireccionDTOProveedor(((Proveedor)entidad).getDireccionProveedor());
                    listDTO.add(cadaDTO);
                }
            if (Agregar == true)
            {
                System.out.println("AGREGAR");
                int contador=0;
                for (DTOProveedor cadaDTO : listDTO)
                    {
                        if(cadaDTO.getCodigoDTOProveedor()== uno){}
                        else{contador += 1;}
                    }
                if (contador !=0){
                    System.out.println("estamos agregando en nuevoProveedor "+nuevo.getCodigoProveedor()+" "+nuevo.getNombreProveedor()+" "+nuevo.getTelefonoProveedor()+" "+nuevo.getCorreoProveedor()+" "+nuevo.getDireccionProveedor());
                    FachadaPersistencia.getInstance().guardar(nuevo);
                }else{System.out.println("Ya existe otro Proveedor con ese Codigo");}
            }
            else 
            {
                System.out.println("MODIFICAR");
                int contador=0;
                for (DTOProveedor cadaDTO : listDTO)
                    {
                        if(uno == cadaDTO.getCodigoDTOProveedor())
                        {
                            if(!dos.equals(cadaDTO.getNombreDTOProveedor())){contador+=1;System.out.println("nombre diferente");}else{ System.out.println("nombre igual");}
                            if(tres != cadaDTO.getTelefonoDTOProveedor()){contador+=1;System.out.println("tel igual");}else{ System.out.println("tel igual");}
                            if(!cuatro.equals(cadaDTO.getCorreoDTOProveedor())){contador+=1;System.out.println("correo diferente");}else{ System.out.println("correo igual");}
                            if(!cinco.equals(cadaDTO.getDireccionDTOProveedor())){contador+=1;System.out.println("direccion diferente");}else{ System.out.println("direccion igual");}
                        }
                    }
                    if (contador != 0){
                        System.out.println("estamos modificando con nuevoProveedor "+nuevo.getCodigoProveedor()+" "+nuevo.getNombreProveedor()+" "+nuevo.getTelefonoProveedor()+" "+nuevo.getCorreoProveedor()+" "+nuevo.getDireccionProveedor());
                        List<DTOCriterio> criterioList = new ArrayList<>();
                        DTOCriterio criterio = new DTOCriterio();
                        criterio.setAtributo("codigoProveedor");
                        criterio.setOperacion("=");
                        criterio.setValor(nuevo.getCodigoProveedor());
                        criterioList.clear();
                        criterioList.add(criterio);
                        Proveedor modificar= (Proveedor)FachadaPersistencia.getInstance().buscar("Proveedor", criterioList).get(0);
                        modificar.setNombreProveedor(nuevo.getNombreProveedor());
                        modificar.setTelefonoProveedor(nuevo.getTelefonoProveedor());
                        modificar.setCorreoProveedor(nuevo.getCorreoProveedor());
                        modificar.setDireccionProveedor(nuevo.getDireccionProveedor());
                        modificar.setFechaInhabilitacionProveedor(nuevo.getFechaInhabilitacionProveedor());
                        String OID = modificar.getOID();
                        FachadaPersistencia.getInstance().guardar(modificar);
                    }else{System.out.println("No existe Modificacion alguna");}
                }
            }
    public List<DTOTipoArticulo> BuscarTipoArticulo (String nombre,boolean habilitado) 
        {
            List<DTOCriterio> criterioList = new ArrayList<>();
            DTOCriterio criterio1 = new DTOCriterio();
            criterio1.setAtributo("fechaInhabilitacionTipoArticulo");
            criterio1.setOperacion("isNull");
            criterio1.setValor(null);
            criterioList.clear();
            if (habilitado) {criterioList.add(criterio1);}
            DTOCriterio criterio2 = new DTOCriterio();
            criterio2.setAtributo("nombreTipoArticulo");
            criterio2.setOperacion("LIKE");
            criterio2.setValor(nombre);
            if (nombre != null)criterioList.add(criterio2);
            List<Object> busqueda = FachadaPersistencia.getInstance().buscar("TipoArticulo", criterioList);
            List<DTOTipoArticulo> listdto = new ArrayList<>();
            for (Object entidad : busqueda) {
                DTOTipoArticulo dto = new DTOTipoArticulo();
                dto.setCodigoDTOTipoArticulo(((TipoArticulo)entidad).getCodigoTipoArticulo());
                dto.setNombreDTOTipoArticulo(((TipoArticulo)entidad).getNombreTipoArticulo());
                dto.setFechaDTOTipoArticulo(((TipoArticulo)entidad).getFechaInhabilitacionTipoArticulo());
                String f = ((TipoArticulo)entidad).getFechaInhabilitacionTipoArticulo();
                if (f!=null){
                dto.setFechaDTOTipoArticulo(f);
                }
                else dto.setFechaDTOTipoArticulo("SI");
                listdto.add(dto);
            }
            return listdto;
        }
    public void EliminarTipoArticulo(DTOTipoArticulo dtoEliminado)
        {
            List<DTOCriterio> criterioList = new ArrayList<>();
            DTOCriterio criterio1 = new DTOCriterio();
            criterio1.setAtributo("codigoTipoArticulo");
            criterio1.setOperacion("=");
            criterio1.setValor(dtoEliminado.getCodigoDTOTipoArticulo());
            criterioList.clear();
            criterioList.add(criterio1);
            TipoArticulo eliminarTipoArticulo = (TipoArticulo)FachadaPersistencia.getInstance().buscar("TipoArticulo", criterioList).get(0);
            String alfa = nuevaFecha();
            eliminarTipoArticulo.setFechaInhabilitacionTipoArticulo(alfa);
            FachadaPersistencia.getInstance().guardar(eliminarTipoArticulo);
        }
   public void GuardarTipoArticulo(DTOTipoArticulo dtoNuevo, boolean Agregar)
        {
            int uno = dtoNuevo.getCodigoDTOTipoArticulo();
            String dos = dtoNuevo.getNombreDTOTipoArticulo();
            String tres = dtoNuevo.getFechaDTOTipoArticulo();
            TipoArticulo nuevo = new TipoArticulo();
            nuevo.setCodigoTipoArticulo(uno);
            nuevo.setNombreTipoArticulo(dos);
            nuevo.setFechaInhabilitacionTipoArticulo(tres);
            List<Object> lista = FachadaPersistencia.getInstance().buscar("TipoArticulo", null);
            List<DTOTipoArticulo> listDTO = new ArrayList<>();
            for (Object entidad : lista) 
                {
                    DTOTipoArticulo cadaDTO= new DTOTipoArticulo();
                    cadaDTO.setCodigoDTOTipoArticulo(((TipoArticulo)entidad).getCodigoTipoArticulo());
                    cadaDTO.setNombreDTOTipoArticulo(((TipoArticulo)entidad).getNombreTipoArticulo());
                    listDTO.add(cadaDTO);
                }
            if (Agregar == true)
            {
                System.out.println("AGREGAR");
                int contador=0;
                for (DTOTipoArticulo cadaDTO : listDTO)
                    {
                        if(cadaDTO.getCodigoDTOTipoArticulo()== uno){}
                        else{contador += 1;}
                    }
                if (contador !=0){
                    System.out.println("estamos agregando en nuevoTipoArticulo "+nuevo.getCodigoTipoArticulo()+" "+nuevo.getNombreTipoArticulo());
                    FachadaPersistencia.getInstance().guardar(nuevo);
                }else{System.out.println("Ya existe otro TipoArticulo con ese Codigo");}
            }
            else 
            {
                System.out.println("MODIFICAR");
                int contador=0;
                for (DTOTipoArticulo cadaDTO : listDTO)
                    {
                        if(uno == cadaDTO.getCodigoDTOTipoArticulo())
                        {
                            if(!dos.equals(cadaDTO.getNombreDTOTipoArticulo())){contador+=1;System.out.println("nombre diferente");}else{ System.out.println("nombre igual");}
                        }
                    }
                    if (contador != 0){
                        System.out.println("estamos modificando con nuevoTipoArticulo "+nuevo.getCodigoTipoArticulo()+" "+nuevo.getNombreTipoArticulo());
                        List<DTOCriterio> criterioList = new ArrayList<>();
                        DTOCriterio criterio = new DTOCriterio();
                        criterio.setAtributo("codigoTipoArticulo");
                        criterio.setOperacion("=");
                        criterio.setValor(nuevo.getCodigoTipoArticulo());
                        criterioList.clear();
                        criterioList.add(criterio);
                        TipoArticulo modificar= (TipoArticulo)FachadaPersistencia.getInstance().buscar("TipoArticulo", criterioList).get(0);
                        modificar.setNombreTipoArticulo(nuevo.getNombreTipoArticulo());
                        modificar.setFechaInhabilitacionTipoArticulo(nuevo.getFechaInhabilitacionTipoArticulo());
                        FachadaPersistencia.getInstance().guardar(modificar);
                    }else{System.out.println("No existe Modificacion alguna");}
            }
        }
    public List<DTOArticulo> BuscarArticulo (String nombre,boolean habilitado) 
        {
            List<DTOCriterio> criterioList = new ArrayList<>();
            DTOCriterio criterio1 = new DTOCriterio();
            criterio1.setAtributo("fechaInhabilitacionArticulo");
            criterio1.setOperacion("isNull");
            criterio1.setValor(null);
            criterioList.clear();
            if (habilitado) {criterioList.add(criterio1);}
            DTOCriterio criterio2 = new DTOCriterio();
            criterio2.setAtributo("nombreArticulo");
            criterio2.setOperacion("LIKE");
            criterio2.setValor(nombre);
            if (nombre != null)criterioList.add(criterio2);
            List<Object> busqueda = FachadaPersistencia.getInstance().buscar("Articulo", criterioList);
            List<DTOArticulo> listdto = new ArrayList<>();
            for (Object entidad : busqueda) {
                DTOArticulo dto = new DTOArticulo();
                dto.setCodigoDTOArticulo(((Articulo)entidad).getCodigoArticulo());
                dto.setNombreDTOArticulo(((Articulo)entidad).getNombreArticulo());
                dto.setFechaDTOArticulo(((Articulo)entidad).getFechaInhabilitacionArticulo());
                dto.setDescripcionDTOArticulo(((Articulo)entidad).getDescripcionArticulo());
                String f = ((Articulo)entidad).getFechaInhabilitacionArticulo();
                if (f!=null){
                dto.setFechaDTOArticulo(f);
                }
                else dto.setFechaDTOArticulo("SI");
                listdto.add(dto);
            }
            return listdto;
        }
    public void EliminarArticulo(DTOArticulo dtoEliminado)
        {
            List<DTOCriterio> criterioList = new ArrayList<>();
            DTOCriterio criterio1 = new DTOCriterio();
            criterio1.setAtributo("codigoArticulo");
            criterio1.setOperacion("=");
            criterio1.setValor(dtoEliminado.getCodigoDTOArticulo());
            criterioList.clear();
            criterioList.add(criterio1);
            Articulo eliminarArticulo = (Articulo)FachadaPersistencia.getInstance().buscar("Articulo", criterioList).get(0);
            String alfa = nuevaFecha();
            eliminarArticulo.setFechaInhabilitacionArticulo(alfa);
            FachadaPersistencia.getInstance().guardar(eliminarArticulo);
        }
    public void GuardarArticulo(DTOArticulo dtoNuevo, boolean Agregar)
        {
            int uno = dtoNuevo.getCodigoDTOArticulo();
            String dos = dtoNuevo.getNombreDTOArticulo();
            String tres = dtoNuevo.getDescripcionDTOArticulo();
            String cuatro = dtoNuevo.getFechaDTOArticulo();
            Articulo nuevo = new Articulo();
            nuevo.setCodigoArticulo(uno);
            nuevo.setNombreArticulo(dos);
            nuevo.setDescripcionArticulo(tres);
            nuevo.setFechaInhabilitacionArticulo(cuatro);
            List<Object> lista = FachadaPersistencia.getInstance().buscar("Articulo", null);
            List<DTOArticulo> listDTO = new ArrayList<>();
            for (Object entidad : lista) 
                {
                    DTOArticulo cadaDTO= new DTOArticulo();
                    cadaDTO.setCodigoDTOArticulo(((Articulo)entidad).getCodigoArticulo());
                    cadaDTO.setNombreDTOArticulo(((Articulo)entidad).getNombreArticulo());
                    cadaDTO.setDescripcionDTOArticulo(((Articulo)entidad).getDescripcionArticulo());
                    listDTO.add(cadaDTO);
                }
            if (Agregar == true)
            {
                System.out.println("AGREGAR");
                int contador=0;
                for (DTOArticulo cadaDTO : listDTO)
                    {
                        if(cadaDTO.getCodigoDTOArticulo()!= uno){contador += 1;}
                        else{}
                    }
                if (contador ==0){
                    System.out.println("hola que ace");
                    System.out.println("dtoNuevo.getDtoTipoArticuloDTOArticulo().getCodigoDTOTipoArticulo() es "
                            + dtoNuevo.getDtoTipoArticuloDTOArticulo().getCodigoDTOTipoArticulo())
                           ;
                    System.out.println("hola que ace");
                    
                    if(dtoNuevo.getDtoTipoArticuloDTOArticulo().equals(null))
                    {
                    } else {
                        TipoArticulo nuevo1 = new TipoArticulo();
                        List<DTOCriterio> criterioList = new ArrayList<>();
                        DTOCriterio criterio = new DTOCriterio();
                        criterio.setAtributo("codigoTipoArticulo");
                        criterio.setOperacion("=");
                        criterio.setValor(nuevo1.getCodigoTipoArticulo());
                        criterioList.clear();
                        criterioList.add(criterio);
                        TipoArticulo nuevo2= (TipoArticulo)FachadaPersistencia.getInstance().buscar("TipoArticulo", criterioList).get(0);
                        nuevo.setTipoArticulo(nuevo2);
                        System.out.println("modificando tipo articulo");
                    }
                    if(dtoNuevo.getDtoProveedorDTOArticulo().getCodigoDTOProveedor()!=0)
                    {
                        Proveedor nuevo1 = new Proveedor();
                        List<DTOCriterio> criterioList = new ArrayList<>();
                        DTOCriterio criterio = new DTOCriterio();
                        criterio.setAtributo("codigoProveedor");
                        criterio.setOperacion("=");
                        criterio.setValor(nuevo1.getCodigoProveedor());
                        criterioList.clear();
                        criterioList.add(criterio);
                        Proveedor nuevo2= (Proveedor)FachadaPersistencia.getInstance().buscar("Proveedor", criterioList).get(0);
                        nuevo.setProveedor(nuevo2);
                        System.out.println("modificando proveedor");
                    }
                    System.out.println("estamos agregando en nuevoArticulo "+nuevo.getCodigoArticulo()+" "+nuevo.getNombreArticulo()+" "+nuevo.getDescripcionArticulo());
                    FachadaPersistencia.getInstance().guardar(nuevo);
                }else{System.out.println("Ya existe otro Articulo con ese Codigo");}
            }
            else 
            {
                System.out.println("MODIFICAR");
                int contador=0;
                for (DTOArticulo cadaDTO : listDTO)
                    {
                        if(uno == cadaDTO.getCodigoDTOArticulo())
                        {
                            if(!dos.equals(cadaDTO.getNombreDTOArticulo())){contador+=1;System.out.println("nombre diferente");}else{ System.out.println("nombre igual");}
                            if(!tres.equals(cadaDTO.getDescripcionDTOArticulo())){contador+=1;System.out.println("descripcion diferente");}else{ System.out.println("descripcion igual");}
                        }
                    }
                    if (contador != 0){
                        System.out.println("estamos modificando con nuevoArticulo "+nuevo.getCodigoArticulo()+" "+nuevo.getNombreArticulo()+" "+nuevo.getDescripcionArticulo());
                        List<DTOCriterio> criterioList = new ArrayList<>();
                        DTOCriterio criterio = new DTOCriterio();
                        criterio.setAtributo("codigoArticulo");
                        criterio.setOperacion("=");
                        criterio.setValor(nuevo.getCodigoArticulo());
                        criterioList.clear();
                        criterioList.add(criterio);
                        Articulo modificar= (Articulo)FachadaPersistencia.getInstance().buscar("Articulo", criterioList).get(0);
                        modificar.setNombreArticulo(nuevo.getNombreArticulo());
                        modificar.setDescripcionArticulo(nuevo.getDescripcionArticulo());
                        modificar.setFechaInhabilitacionArticulo(nuevo.getFechaInhabilitacionArticulo());
                        String OID = modificar.getOID();
                        FachadaPersistencia.getInstance().guardar(modificar);
                    }else{System.out.println("No existe Modificacion alguna");}
                }
            }
    }