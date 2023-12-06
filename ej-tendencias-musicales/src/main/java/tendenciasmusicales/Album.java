package tendenciasmusicales;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Album {
    private String nombre;
    private int anio;
    private Artista artista;
}
