package proservices.servicios;

import javax.persistence.*;

@Entity
@Table(name = "tarea")
public class Tarea {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion", columnDefinition = "text")//para poder describir muchas cosas
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "sercicio_id",referencedColumnName = "id") //FK hacia la tabla servicio
    private Servicio servicio;
}
