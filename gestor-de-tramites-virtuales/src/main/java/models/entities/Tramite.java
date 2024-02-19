package models.entities;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class Tramite {

    private String nombre;
    private int codigo;
    private int tiempoResolucion;
    private List<Formulario> formularios;

}
