package NegocioComidas;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class NegocioComidasTest {

    @Test
    public void compararPreciosDeMenus_retornandotrue(){
        MenuInfantil menuInfantil = new MenuInfantil(1500.00, 3);
        double precio = menuInfantil.calculoPrecioVenta();
        double precioEsperado = 150;

        Assertions.assertEquals(precioEsperado, precio);
    }



}
