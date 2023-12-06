package tendenciasmusicales.popularidades;

import tendenciasmusicales.Cancion;

public class Normal extends Popularidad {
    private static int cantReproduccionesMaximas = 1000;
    private int cantReproducciones;

    public Normal(){
        this.cantReproducciones = 0;
    }
    @Override
    public void reproducir(Cancion cancion) {
        this.cantReproducciones++; //aumenta la cantidad de reproducciones en Normal
        if(this.cantReproducciones > cantReproduccionesMaximas ){
            cancion.setPopularidad(new EnAuge()); // La instancia de Normal se esta desreferenciando asi misma
            // ella misma dice apunta a EnAuge, no me apuntes a mi y se lo lleva el garbage collector(porque nadie
            // la esta apuntando)
        }

    }

    //el formato lo tire para arriba, como va a mostrar la cancion lo sabe la clase padre (popularidad)
    @Override
    protected String leyenda(Cancion cancion) {
        return cancion.getAlbum().getArtista().getNombre();
    }

    @Override
    protected String icono() {
        return Icono.MUSICAL_NOTE.texto();
    }
}
