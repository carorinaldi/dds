package ar.edu.utn.frba.dds.entities;

import java.time.LocalDateTime;

public class Incidente {
    private Integer id;
    private Miembro abiertoPor;
    private Miembro cerradoPor;
    private String fechaApertura;
    private String fechaCierre;

    public Incidente() {
    }

    public Incidente(Miembro abiertoPor, Miembro cerradoPor, String fechaApertura, String fechaCierre) {
        this.abiertoPor = abiertoPor;
        this.cerradoPor = cerradoPor;
        this.fechaApertura = fechaApertura;
        this.fechaCierre = fechaCierre;
    }

    public Incidente(Integer id, Miembro abiertoPor, Miembro cerradoPor, String fechaApertura, String fechaCierre) {
        this.id = id;
        this.abiertoPor = abiertoPor;
        this.cerradoPor = cerradoPor;
        this.fechaApertura = fechaApertura;
        this.fechaCierre = fechaCierre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Miembro getAbiertoPor() {
        return abiertoPor;
    }

    public void setAbiertoPor(Miembro abiertoPor) {
        this.abiertoPor = abiertoPor;
    }

    public Miembro getCerradoPor() {
        return cerradoPor;
    }

    public void setCerradoPor(Miembro cerradoPor) {
        this.cerradoPor = cerradoPor;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(String fechaCierre) {
        this.fechaCierre = fechaCierre;
    }
}
