package models.entities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class Entidad {

    private String denominacioLegal;
    private int demoraResolucion;
    private LocalDate fechaAltaIGJ;
    private List<Tramite> tramites;


}
