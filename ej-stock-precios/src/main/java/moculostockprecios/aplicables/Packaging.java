package moculostockprecios.aplicables;

import moculostockprecios.Producto;

public class Packaging extends Aplicable {
    private double precio;
    public Packaging(String descripcion,Producto producto, double precio) {
        super(descripcion, producto);
        this.precio = precio;
    }

    @Override
    public double precio() {
        return super.producto.precio() + this.precio;
    }
}
