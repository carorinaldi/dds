package ar.edu.utn.frba.dds;

import ar.edu.utn.frba.dds.controllers.AltaIncidenteController;
import ar.edu.utn.frba.dds.controllers.ListaIncidenteController;
import ar.edu.utn.frba.dds.repo.RepoIncidente;
import io.javalin.Javalin;



public class Api {
    public static void main(String[] args) {
        RepoIncidente repo = new RepoIncidente();

        Integer port = Integer.parseInt(
                System.getProperty("port", "8080"));
        Javalin app = Javalin.create().start(port);

        app.get("/", ctx -> ctx.result("Hola Mundo"));

        app.post("/api/incidentes",
                new AltaIncidenteController(repo));

        app.get("/api/incidentes",
                new ListaIncidenteController(repo));

    }
}