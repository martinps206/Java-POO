package VentasProxyDinamico;

public class Shoes implements ISell{

    @Override
    public void sell() {
        System.out.println("Necesito contactar un vendedor de zapatos");
    }
}
