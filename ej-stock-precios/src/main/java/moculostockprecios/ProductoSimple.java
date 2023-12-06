package moculostockprecios;

public class ProductoSimple extends Producto{

    private double precio;
    private int stock;

    public ProductoSimple(String descripcion, double precio, int stock) {
        super(descripcion);
        this.stock=stock;
        this.precio=precio;
    }

    @Override
    public double precio() {
        return this.precio;
    }

    @Override
    public int stock() {
        return this.stock;
    }
}
