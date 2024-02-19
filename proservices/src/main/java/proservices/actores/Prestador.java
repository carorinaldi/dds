package proservices.actores;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "prestador")
@Getter
@Setter
public class Prestador {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "foto") //la foto es del prestador, simplemente para nosotros es un String porque se guarda en el
    // filesystem, nosotros a nivel objetos solamente tenemos strings q representan el path
    private String foto;

    @Column(name = "nroDocumento")
    private String nroDocumento;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipoDocumento")
    private TipoDocumento tipoDocumento;

    @Column(name = "fechaNacimiento", columnDefinition = "DATE")
    private LocalDate fechaNacimiento;

    @Column(name = "cuiCuil")
    private String cuiCuil;

    @ElementCollection  //para colecciones de TipoDeDatos "primitivos" / Value Objects
    //Voy a tener q definir como se va a llamar la tabla,y le voy a decir como quiero q se llame la columna
    //que va a tener la FK que apunta a Prestador. Estoy definiendo de la otra tabla la columna q nos apunta
    @CollectionTable(name = "prestador_email", joinColumns = @JoinColumn(name = "prestador_id", referencedColumnName = "id"))
    @Column(name = "email") // defino como se llama la columna en la cual se va a guardar el string ppiamente dicho
    private Set<String> emails; //ojo que con los set defino q no permita duplicados

    @ElementCollection
    @CollectionTable(name = "prestador_telefono", joinColumns = @JoinColumn(name = "telefono_id",referencedColumnName = "id"))
    @Column(name = "numero")
    private Set<String> telefonos;

    @OneToMany
    @JoinColumn(name = "prestador_id",referencedColumnName = "id") //Al ser unidireaccional estoy diciendo como se va a llamar
    // el atributo de la otra tabla. No gusta tanto esta solucion
    private List<Disponibilidad> disponibilidades;

    @Transient
    private Reputacion reputacion;

    public Prestador() {
        this.emails = new HashSet<>();
        this.telefonos = new HashSet<>();
        this.disponibilidades = new ArrayList<>();
    }
}
