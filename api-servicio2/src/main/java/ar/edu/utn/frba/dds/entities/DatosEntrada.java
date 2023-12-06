package ar.edu.utn.frba.dds.entities;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class DatosEntrada {
    private List<Incidente> incidentes;
    private Comunidad comunidad;

    public DatosEntrada(){
    }
    public DatosEntrada(List<Incidente> incidentes, Comunidad comunidad) {
        this.incidentes = incidentes;
        this.comunidad = comunidad;
    }

    public List<Incidente> getIncidentes() {
        return incidentes;
    }

    public void setIncidentes(List<Incidente> incidentes) {
        this.incidentes = incidentes;
    }

    public Comunidad getComunidad() {
        return comunidad;
    }

    public void setComunidad(Comunidad comunidad) {
        this.comunidad = comunidad;
    }

}

/*

    public static void main(String[] args) {
        LocalDateTime fecha = LocalDateTime.now();
        LocalDateTime fecha2 = LocalDateTime.now().plusMinutes(4320).plusHours(1);
        long diff = ChronoUnit.MINUTES.between(fecha,fecha2);
        System.out.println("entre fecha2: "+ fecha2 + " y fecha: "+fecha + "pasaron los sig minutos: " + diff);
    }*/
