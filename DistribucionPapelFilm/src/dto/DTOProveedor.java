
package dto;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;

/**
 *
 * @author TroikaP
 */
public class DTOProveedor {
    
    private int codigoDTOProveedor;
    //private boolean eliminar;
    private String nombreDTOProveedor;
    private String fechaDTOProveedor;
    private String correoDTOProveedor;
    private String direccionDTOProveedor;
    private int telefonoDTOProveedor;

    
    public String getCorreoDTOProveedor() {
        return correoDTOProveedor;
    }

    public void setCorreoDTOProveedor(String correoDTOProveedor) {
        this.correoDTOProveedor = correoDTOProveedor;
    }

    public String getDireccionDTOProveedor() {
        return direccionDTOProveedor;
    }

    public void setDireccionDTOProveedor(String direccionDTOProveedor) {
        this.direccionDTOProveedor = direccionDTOProveedor;
    }

    public int getTelefonoDTOProveedor() {
        return telefonoDTOProveedor;
    }

    public void setTelefonoDTOProveedor(int telefonoDTOProveedor) {
        this.telefonoDTOProveedor = telefonoDTOProveedor;
    }

    public String getFechaDTOProveedor() {
        return fechaDTOProveedor;
    }

    public void setFechaDTOProveedor(String fecha) {
        this.fechaDTOProveedor = fecha;
    }
    
    public int getCodigoDTOProveedor() {
        return codigoDTOProveedor;
    }

    public void setCodigoDTOProveedor(int codigoDTOProveedor) {
        this.codigoDTOProveedor = codigoDTOProveedor;
    }
/*
    public boolean isEliminar() {
        return eliminar;
    }

    public void setEliminar(boolean eliminar) {
        this.eliminar = eliminar;
    }
*/
    public String getNombreDTOProveedor() {
        return nombreDTOProveedor;
    }

    public void setNombreDTOProveedor(String nombreDTOProveedor) {
        this.nombreDTOProveedor = nombreDTOProveedor;
    }
    
}
