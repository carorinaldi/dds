package tendenciasmusicales.popularidades;

import tendenciasmusicales.Cancion;

public class EnAuge extends Popularidad{
    private static int cantReproduccionesMaximas = 50000;
    private static int cantMaxDislikes = 5000;
    private static int cantMaxLikes = 20000;
    private int cantReproducciones;
    private int cantDislikes;

    public EnAuge() {
        this.cantReproducciones = 0;
        this.cantDislikes = 0;
    }

    @Override
    public void reproducir(Cancion cancion) {
        this.cantReproducciones++;
        if(this.cantReproducciones>cantReproduccionesMaximas && cancion.getCantLikes() > cantMaxLikes) {
            cancion.setPopularidad(new EnTendencia());
        } else {
            if(this.cantDislikes>cantMaxDislikes){
                cancion.setPopularidad(new Normal());

            }
        }

    }


    @Override
    protected String leyenda(Cancion cancion) {
        return cancion.getAlbum().getArtista().getNombre();
    }

    @Override
    protected String icono() {
        return Icono.ROCKET.texto();
    }
}
