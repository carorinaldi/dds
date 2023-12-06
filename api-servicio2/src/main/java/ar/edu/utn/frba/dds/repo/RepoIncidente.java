package ar.edu.utn.frba.dds.repo;

import ar.edu.utn.frba.dds.entities.Incidente;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;

public class RepoIncidente {
    private static Integer secuencia = 0;
    private Integer nextId() {
        secuencia = secuencia + 1;
        return secuencia ; }

    private Collection<Incidente> incidentes;

    public RepoIncidente() {
        this.incidentes = new ArrayList<>(); }
    public void add(Incidente incidente) {
        incidente.setId(nextId());
        this.incidentes.add(incidente); }
    public void remove(Incidente incidente) {
        this.incidentes = this.incidentes.stream().filter(
                x -> !x.getId().equals(
                        incidente.getId())).toList(); }
    public boolean exists(Long id) {
        return this.incidentes.stream().anyMatch(
                x -> x.getId().equals(id)); }
    public Incidente findById(Long id) {
        return this.incidentes.stream().filter(
                x -> x.getId().equals(id)
        ).findFirst().get(); }
    public Collection<Incidente> all() {
        return this.incidentes; }

    public void calcularPuntaje() {
        for (Incidente incidente : incidentes) {
            LocalDateTime fechaApertura = LocalDateTime.parse(incidente.getFechaApertura());
            LocalDateTime fechaCierre = LocalDateTime.parse(incidente.getFechaCierre());
            long diferenciaEnMinutos = ChronoUnit.MINUTES.between(fechaApertura, fechaCierre);

            if (diferenciaEnMinutos < 3) {
                incidente.getAbiertoPor().setPuntaje(incidente.getAbiertoPor().getPuntaje() - 0.2);

            }
        }


        //return this.incidentes.stream().
    }


}


//, DateTimeFormatter.ISO_DATE_TIME