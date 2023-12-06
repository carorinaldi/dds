import java.util.ArrayList;
import java.util.List;

public class Gato {
    private String name;
    private List<String> ocupaciones;
    private String color;

    public Gato(String name, String color) {
        this.name = name;
        this.ocupaciones = new ArrayList<>();
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getOcupaciones() {
        return ocupaciones;
    }

    public void setOcupaciones(List<String> ocupaciones) {
        this.ocupaciones = ocupaciones;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
