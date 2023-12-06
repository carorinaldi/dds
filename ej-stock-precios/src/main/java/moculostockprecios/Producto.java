package moculostockprecios;

public abstract class Producto {
    private String descripcion;

    public Producto(String descripcion) {
        this.descripcion = descripcion;
    }

    public abstract double precio();

    public abstract int stock();

}
