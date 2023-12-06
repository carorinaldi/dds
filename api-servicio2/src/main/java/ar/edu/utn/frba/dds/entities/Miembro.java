package ar.edu.utn.frba.dds.entities;

public class Miembro {
    private Integer id;
    private double puntaje;


    public Miembro(){
    }
    public Miembro(Integer id, double puntaje) {
        this.id = id;
        this.puntaje = puntaje;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }
}
