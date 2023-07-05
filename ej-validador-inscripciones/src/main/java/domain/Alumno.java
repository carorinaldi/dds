package domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Alumno {
    String nombre;
    int legajo;
    List<Materia> materiasAprobadas = new ArrayList<>();


    public Alumno(String nombre, int legajo, List<Materia> materiasAprobadas) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.materiasAprobadas = materiasAprobadas;
        }

    public void aprobo(Materia unaMateria){
        this.materiasAprobadas.add(unaMateria);
    }
}
