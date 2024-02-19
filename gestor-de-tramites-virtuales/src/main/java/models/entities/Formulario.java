package models.entities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
@Getter
@Setter
public class Formulario {
    private List<Campo> campos;
    private LocalDate fechaVto;
    private int fueRenovado;

}
/*
    Marcar como “vencidos” aquellos formularios que se encuentren en su fecha de
        vencimiento y realizar el envío de email correspondiente

        Consideraciones necesarias:

        • La fecha de vencimiento debe ser calculada y aplicada sobre los formularios (plantillas).
        • Este requerimiento sirve para el punto 4). Para poder “vencer los formularios automáticamente” es necesario
        configurar un Cron Task que verifique, cada cierto tiempo, si el formulario ya entró en su periodo de vencimiento.
        • Además, es necesario modelar, en algún atributo, el concepto de "fueRenovado" y la cant. de veces que lo fue
CRONTASK DE FORMA ASINCRONA
*/