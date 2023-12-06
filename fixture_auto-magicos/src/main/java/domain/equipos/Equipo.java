package domain.equipos;

import java.util.List;

public class Equipo {
    private String nombre;
    private Categoria categoria;
    private List<Jugador> jugadores;
    private String nivelExperiencia;
    public static Integer cantMaxJugadores = 8;

}
