package Jugueteria;

public class Main {
    public static void main(String[] args) {
        Combo combo = Combo.getInstance();
        Cupon c = combo.agregarProducto("combo");
        System.out.println();
    }
}
