package models.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Campo {
    private boolean esObligatorio;
    private String nombreCampo;
    private TipoCampo tipoCampo;
    private List<Opcion> opciones;
}
