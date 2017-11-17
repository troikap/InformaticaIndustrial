/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author TroikaP
 */
public class MainDistribucionPapelFilm {
    
    public static void main (String[] args)
    {
        ExpertoDistribucionPapelFilm experto = new ExpertoDistribucionPapelFilm();
        InterfazPrincipal interfaz= new InterfazPrincipal(experto);
        interfaz.setVisible(true);
    }
}
