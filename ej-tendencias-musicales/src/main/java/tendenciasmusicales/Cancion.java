package tendenciasmusicales;

import lombok.Getter;
import lombok.Setter;
import tendenciasmusicales.popularidades.Normal;
import tendenciasmusicales.popularidades.Popularidad;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter
@Getter
public class Cancion {
    private String nombre;
    private Album album;
    private int cantReproducciones;
    private int cantLikes;
    private int cantDislikes;
    private Popularidad popularidad;
    private LocalDateTime fechaHoraUltVez;

    public Cancion(String nombre) {
        this.nombre = nombre;
        this.cantReproducciones = 0;
        this.cantLikes = 0;
        this.cantDislikes = 0;
        this.popularidad = new Normal();

    }

    public void reproducir(){
        this.cantReproducciones++; //aumenta la cantidad de reproducciones total
        this.popularidad.reproducir(this);
        this.fechaHoraUltVez = LocalDateTime.now();

    }

    public String detalleCompleto(){
        return this.popularidad.detalleCompletoPara(this); //le pateamos la pelota a popularidad
    }
}
