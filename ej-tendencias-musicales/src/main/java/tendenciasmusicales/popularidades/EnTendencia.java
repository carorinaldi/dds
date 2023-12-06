package tendenciasmusicales.popularidades;

import tendenciasmusicales.Cancion;

public class EnTendencia extends Popularidad{



    public EnTendencia() {

    }

    public void moverANormalSiEsPosible(Cancion cancion){
        //TODO (aca tendria toda la logica de verificar la cantidad de tiempo si es mayor a 24hs)
        //pero ademas es el metodo que voy a llamr desde mi CRON TASK
        //Mi Cron task va a poder llamar a este metodo, va a evaluar si lo puede mover, pero lo va a hacer
        //de forma asincronica, cada una hora por ejemplo
    }
    @Override
    public void reproducir(Cancion cancion) {
        this.moverANormalSiEsPosible(cancion);

    }

    @Override
    protected String leyenda(Cancion cancion) {
        return cancion.getAlbum().getArtista().getNombre() + " - " + cancion.getAlbum().getNombre();
    }

    @Override
    protected String icono() {
        return Icono.FIRE.texto();
    }
}
