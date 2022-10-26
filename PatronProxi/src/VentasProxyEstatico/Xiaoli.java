package VentasProxyEstatico;

public class Xiaoli implements ISell{

    Mianmo mianmo;

    public Xiaoli(Mianmo mianmo) {
        this.mianmo = mianmo;
    }

    @Override
    public void sell() {
        System.out.println("Soy Xiaoli y ahora estoy haiendo una microempresa ");
        mianmo.sell();
    }
}
