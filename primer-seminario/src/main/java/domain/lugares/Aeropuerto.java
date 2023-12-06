package domain.lugares;

import domain.viajes.Vuelo;

import java.time.LocalDate;
import java.util.List;

public class Aeropuerto {
    private String nombre;
    private String codigoInternacional;
    private Ciudad ciudad;
    private List<Vuelo> vuelos;

    public Integer cantVuelosQueLlegaronElDia(LocalDate dia){
        //TODO
        return 0;
    }

    public Integer cantVuelosQuePartieronElDia(LocalDate dia){
        //TODO
        return 0;
    }

}
