package ar.edu.utn.frba.dds.controllers;

import ar.edu.utn.frba.dds.repo.RepoIncidente;
import io.javalin.http.Context;
import io.javalin.http.Handler;

public class ListaIncidenteController implements Handler {
    private RepoIncidente repo;
    public ListaIncidenteController(RepoIncidente repo) {
        super();
        this.repo = repo;
    }
    @Override
    public void handle(Context ctx) throws Exception {
        ctx.json(repo.all());
    }

    public void calcularPuntaje(){

    }
}
