import domain.Alumno;
import domain.Inscripcion;
import domain.Materia;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;


public class InscripcionTest {

    Materia pdep = new Materia("Paradigmas de Programacion", null);
    Materia ayed = new Materia("ALgoritmos y Estructura de Datos", null);
    Materia disenio = new Materia("disenio de sistemas", List.of(pdep,ayed));
    Materia discreta = new Materia("Matematica Discreta", null);
    Materia amii = new Materia("Analisis Matematico 2", List.of(discreta));

    Alumno caro = new Alumno("Carolina", 1718356,new ArrayList<>(List.of(pdep,discreta)));
    Alumno belu = new Alumno("Belen", 1725649,new ArrayList<>(List.of(amii,pdep,discreta,ayed)));

    /*----------------------------------------------------------------------------------------------------------*/

    public void imprimirMateriasAprobadas(Alumno alumno) {
        System.out.println("\nMaterias Aprobadas de " + alumno.getNombre() + ":");
        for(Materia materia: alumno.getMateriasAprobadas()){
            System.out.println("*" + materia.getNombre());
        }
    }

    /*----------------------------------------------------------------------------------------------------------*/
    @Test
    public void beluCuentaConLasCorrelativasParaDisenio(){
        Assertions.assertTrue(disenio.tieneLasCorrelativas(belu));
        this.imprimirMateriasAprobadas(belu);
    }

    @Test
    public void caroNoPuedeInscribirseADisenio(){
        Inscripcion inscrDisenio = new Inscripcion(caro, disenio);
        Assertions.assertEquals(caro.getMateriasAprobadas().size(),2);
        this.imprimirMateriasAprobadas(caro);
    }

    @Test
    public void caroPudoInscribirseADisenio(){
        caro.aprobo(ayed);
        Inscripcion inscrDisenio = new Inscripcion(caro, disenio);
        Assertions.assertTrue(inscrDisenio.aprobada());
        this.imprimirMateriasAprobadas(caro);
    }

    @Test
    public void caroAproboUnaMateria(){
        caro.aprobo(ayed);
        Assertions.assertTrue(caro.getMateriasAprobadas().contains(ayed));
        this.imprimirMateriasAprobadas(caro);
    }
}
