package domain.services.georef.entities;

import java.util.List;

public class ListadoDeProvincias {
    /*
    Los atributos para las clases moldes van a ir publicos, es el unico caso donde el atributo es publico
     */
    public int cantidad;
    public int inicio;
    public int total;
    public Parametro parametros;
    public List<Provincia> provincias;

    /*
    to2 lo que me olvide de modelar no lo voy a poder utilizar pero no me va a romper
    */


    private class Parametro {
        /*
        una innerClass es una clase dentro de una clase
        */
        public List<String> campos;

    }
}
