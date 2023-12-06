package tendenciasmusicales.popularidades;

import tendenciasmusicales.Cancion;

public abstract class Popularidad {
    public abstract void reproducir(Cancion cancion);
    public String detalleCompletoPara(Cancion cancion){
        String detalle = "";
        detalle += this.icono();
        detalle += " - ";
        detalle += this.leyenda(cancion);
        return detalle;
    } // por esto es una clase abstracta y no una interfaz--> porque lleva cuerpo

    abstract protected String leyenda(Cancion cancion);

    abstract protected String icono();
}
