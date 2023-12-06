package domain.lugares;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ciudad {
    private String nombre;
    private Pais pais;
    private List<Aeropuerto> aeropuertos;

    public Ciudad(String nombre) {
        this.nombre = nombre;
        this.aeropuertos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public List<Aeropuerto> getAeropuertos() {
        return aeropuertos;
    }

    public Integer cantAeropuertos() {
        return this.aeropuertos.size();
    }

    public void agregarAeropuestos(Aeropuerto ... aeropuertos){
        Collections.addAll(this.aeropuertos,aeropuertos);
    }

    public Integer cantPasajerosQueLlegaronElDia(LocalDate dia){
        //TODO  significa para hacer mas adelante
        return 0;
    }

    public void metodoPrueba(){
        Pais argentina = new Pais();
        argentina.agregarCiudades(this, this,this);
    }
}
