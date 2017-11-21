
package main;

/**
 *
 * @author TroikaP
 */
public class FabricaExpertoDistribucionPapelFilm {
 
    private static FabricaExpertoDistribucionPapelFilm instancia;

    public FabricaExpertoDistribucionPapelFilm ()
    {
    }

    public static FabricaExpertoDistribucionPapelFilm getInstancia ()
    {
        if (instancia == null)
        {
            instancia = new FabricaExpertoDistribucionPapelFilm();
        }
        return instancia;
    }

    public Object crearExperto (String casoDeUso)
    {
        switch (casoDeUso)
        {
            case "CU1":
                return new DecoradorDistribucionPapelFilm();
            default:
                return null;
        }
    }

}

