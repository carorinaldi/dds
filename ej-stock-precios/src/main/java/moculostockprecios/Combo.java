package moculostockprecios;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Combo extends Producto {
    private Set<Producto> productos;

    public Combo(String descripcion) {
        super(descripcion);
        this.productos = new HashSet<>();
    }

    public void agregarProducto(Producto ... productos){ // esto se llama argumentos variables
        // me pueden llegar 0, 1, o muchos parametros(tienen que ser el mismo tipo)
        //puedo agregar 0 1 o muchos productos
        Collections.addAll(this.productos, productos);
    }

    @Override
    public int stock() {
        return Collections.min(this.productos, Comparator.comparing(Producto::stock)).stock();
    }

    @Override
    public double precio() {
        return this.productos.stream().mapToDouble(p -> p.precio()).sum();
        /*
        puedo reemplazar una expresion lambda por una referencia medtodo Producto::precio
        siempre y cuando ese metodo no reciba ningun argumento
        */
    }
}

