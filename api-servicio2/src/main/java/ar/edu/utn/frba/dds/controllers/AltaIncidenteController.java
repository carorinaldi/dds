package ar.edu.utn.frba.dds.controllers;

import ar.edu.utn.frba.dds.entities.Incidente;
import ar.edu.utn.frba.dds.repo.RepoIncidente;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import io.javalin.http.HttpStatus;

public class AltaIncidenteController implements Handler {

    private RepoIncidente repo;

    public AltaIncidenteController(RepoIncidente repo) {
        super();
        this.repo = repo;
    }
    @Override
    public void handle(Context ctx) throws Exception {
        Incidente incidente = ctx.bodyAsClass(Incidente.class);
        //el metodo bodyasclass es que si el cuerpo del mensaje es un json,
        // crea el objeto Producto.class con los parametros que le pasamos
        this.repo.add(incidente);
        ctx.status(HttpStatus.CREATED);
        ctx.result("Incidente agregado correctamente");
        ctx.json(repo.all());
    }
}