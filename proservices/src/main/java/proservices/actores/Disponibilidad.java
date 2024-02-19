package proservices.actores;

import lombok.Getter;
import lombok.Setter;
import proservices.converters.DiaDeSemanaConverter;

import javax.persistence.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "disponibilidad")
@Getter
@Setter
public class Disponibilidad {

    @Id
    @GeneratedValue
    private Long id;

    @Convert(converter = DiaDeSemanaConverter.class) //aca si lo tengo q llamar directo
    //@Enumerated(EnumType.STRING)//los Enumerados no se transforman en tablas, JAMAS
    //Los enumerados se transforman en COLUMNAS
    @Column(name = "dia")
    private DayOfWeek dia; // es un enumerado de Java que ya existe, pero q esta en ingles, y yo lo quiero en español


    @Column(name = "horaInicio", columnDefinition = "TIME")
    private LocalTime horaInicio;

    @Column(name = "horaFin", columnDefinition = "TIME")
    private LocalTime horaFin;
}
