package domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    public Materia(String nombre, List<Materia> correlativas) {
        this.nombre = nombre;
        this.correlativas = correlativas;
    }

    public Materia() {

    }

    public boolean tieneLasCorrelativas(Alumno alumno) {
        return alumno.getMateriasAprobadas().containsAll(this.correlativas);
    }


}
