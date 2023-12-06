package domain.torneo;

import domain.equipos.Categoria;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;

public class Torneo {
    private HashMap<Integer, LocalDate> fecha;
    private List<Dia> diasDelaSemana;
    private List<LocalTime> horarios;
    private List<Categoria> categorias;
    private int cantEquipos;
    private int cantFechas;
    private TipoTorneo tipoTorneo;
}
