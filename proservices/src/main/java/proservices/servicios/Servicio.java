package proservices.servicios;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


//JPA es un standard que define Java que nos permite realizar la persistencia de datos de nuestras
// clases pero sin quedar pegados en un ORM en particular, es decir q podriamos llegar a cambiar de ORM
// y deberia funcionar estas anotaciones igual
//JPA establece la Interfaz y Hibernate implementa la Interfaz de JPA. Java busca desacoplar justamente
// el ORM de todo el resto
@Entity //si yo quiero decir que esta clase es persistente (usar siempre javax persistence)
// Ojo que no toda Entidad va a ser una tabla
@Table(name="servicio")  // Aclara como queremos q se llame la tabla. Buscar nomenclatura comun en todo el equipo
@Getter
@Setter
public class Servicio {
    @Id
    @GeneratedValue //Genera clave subrogada
    private Integer id; //Los ORM no se llevan muy bien con las claves compuestas
    @Column(name="nombre")
    private String nombre;
    @OneToMany(mappedBy = "servicio") //mappedBy para relaciones bidireccionales y dice encontrame del otro lado como el atributo servicio
    private List<Tarea> tareas;

    @Override
    public String toString() {
        return this.nombre;
    }

    // @Transient ORM no persistas este atributo

    public Servicio() { this.tareas = new ArrayList<>();}
}
