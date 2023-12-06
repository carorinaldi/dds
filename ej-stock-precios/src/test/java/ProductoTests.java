import moculostockprecios.Combo;
import moculostockprecios.Producto;
import moculostockprecios.ProductoSimple;
import moculostockprecios.aplicables.DescuentoFijo;
import moculostockprecios.aplicables.Packaging;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoTests {

    private Producto casco;
    private Producto guantes;
    private Producto chaleco;
    private Producto piloto;
    private Combo comboSimple;

    @BeforeEach
    public void init() {
        this.casco = new ProductoSimple("casco",100.0,5);
        this.guantes = new ProductoSimple("casco",100.0,4);
        this.chaleco = new ProductoSimple("casco",100.0,3);

        this.comboSimple = new Combo("Combo Simple");
        this.comboSimple.agregarProducto(casco,guantes,chaleco);
    }

    @Test
    public void comboSimpleVale300(){
        Assertions.assertEquals(300,this.comboSimple.precio());
        Assertions.assertEquals(3,this.comboSimple.stock());
    }

    @Test
    public void comboRecargadoVale400(){
        this.piloto = new ProductoSimple("Piloto", 100, 6);
        Combo comboRecargado = new Combo("Combo Recargado");
        comboRecargado.agregarProducto(this.comboSimple, piloto);
        Assertions.assertEquals(400,comboRecargado.precio());
        Assertions.assertEquals(3,comboRecargado.stock());
    }

    @Test
    public void comboSimpleConDescuentoVale200(){
        DescuentoFijo descuento100 = new DescuentoFijo("Descuento de 100", this.comboSimple, 100);
        Assertions.assertEquals(200, descuento100.precio());
        Assertions.assertEquals(3,descuento100.stock());
    }

    @Test
    public void combosConPaquete(){
        Packaging paqueteParaSimple = new Packaging("Paquete de 50", this.comboSimple, 50);

        Assertions.assertEquals(350, paqueteParaSimple.precio());

        this.piloto = new ProductoSimple("Piloto", 100, 6);
        Combo comboRecargado = new Combo("Combo Recargado");
        comboRecargado.agregarProducto(paqueteParaSimple, piloto);

        Assertions.assertEquals(450, comboRecargado.precio());

        Packaging paqueteGigante = new Packaging("Paquete Gigante", comboRecargado, 100);
        Assertions.assertEquals(550, paqueteGigante.precio());

        DescuentoFijo descuento100 = new DescuentoFijo("Descuento de 100", paqueteGigante, 100);
        Assertions.assertEquals(450, descuento100.precio());

        DescuentoFijo descuento50 = new DescuentoFijo("Descuento de 50", descuento100, 50);
        Assertions.assertEquals(400, descuento50.precio());

    }

}
