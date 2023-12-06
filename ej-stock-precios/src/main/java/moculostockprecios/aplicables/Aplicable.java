package moculostockprecios.aplicables;

import moculostockprecios.Producto;

public abstract class Aplicable extends Producto {
    protected Producto producto;
    public Aplicable(String descripcion, Producto producto) {
        super(descripcion);
        this.producto = producto;
    }

    @Override
    public int stock() {
        return this.producto.stock();
    }
}
