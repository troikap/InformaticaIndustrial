
package main;

/**
 *
 * @author TroikaP
 */
public class MainDistribucionPapelFilm {
    
    public static void main (String[] args)
    {
        ControladorDistribucionPapelFilm controlador = new ControladorDistribucionPapelFilm();
        InterfazPrincipal interfaz= new InterfazPrincipal(controlador);
        interfaz.setVisible(true);
    }
}
