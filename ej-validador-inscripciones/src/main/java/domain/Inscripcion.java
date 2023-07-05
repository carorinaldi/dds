package domain;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Inscripcion {
    private Alumno alumno;
    private Materia materia;

    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
    }

    public boolean aprobada(){
       return materia.tieneLasCorrelativas(this.alumno);
    }

}
