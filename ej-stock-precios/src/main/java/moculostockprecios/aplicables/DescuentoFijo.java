package moculostockprecios.aplicables;

import moculostockprecios.Producto;

public class DescuentoFijo extends Aplicable{
    private double valor;
    public DescuentoFijo(String descripcion, Producto producto, double valor) {
        super(descripcion, producto);
        this.valor = valor;
    }

    @Override
    public double precio() {
        return super.producto.precio() - this.valor;
    }
}
