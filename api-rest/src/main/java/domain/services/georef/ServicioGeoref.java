package domain.services.georef;

import domain.services.georef.entities.ListadoDeMunicipios;
import domain.services.georef.entities.ListadoDeProvincias;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class ServicioGeoref {
    //creo un Singleton
    private static ServicioGeoref instancia = null;
    private static final String urlAPI = "https://apis.datos.gob.ar/georef/api/"; //ruta absoluta
    private Retrofit retrofit;

    private ServicioGeoref() {
        this.retrofit = new Retrofit.Builder() //Builder ayuda a la construccion de un objeto
                .baseUrl(urlAPI)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static ServicioGeoref getInstancia() {
        if(instancia == null) {
            instancia = new ServicioGeoref();
        }
        return instancia;
    }

    public ListadoDeProvincias listadoDeProvincias() throws IOException {
        GeorefService georefService = this.retrofit.create(GeorefService.class);
        /* le estoy diciendo a retrofit creame un objeto q implemente la interfaz Georef y retrofit se va a encargar
        de crear un objeto que entienda estos metodos que habia definido en esta interfaz
        */

        Call<ListadoDeProvincias> requestProvinciasArg = georefService.provincias();
        Response<ListadoDeProvincias> responceProvinciasArg= requestProvinciasArg.execute(); //Aca va a hacer la request
        return responceProvinciasArg.body();
    }

    public ListadoDeMunicipios listadoDeMunicipiosDeProvincia(int id) throws IOException {
        GeorefService georefService = this.retrofit.create(GeorefService.class);
        Call<ListadoDeMunicipios> requestMunicipiosDeProvincia = georefService.municipios(id,"id, nombre", 200);
        Response<ListadoDeMunicipios> responseMunicipiosDeProvincia = requestMunicipiosDeProvincia.execute();
        return responseMunicipiosDeProvincia.body();
    }
}
