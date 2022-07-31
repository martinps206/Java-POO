package Jugueteria;

import java.util.ArrayList;

public class Combo extends Jugueteria{
    private static Combo instancia;
    private ArrayList<Jugueteria> jugueterias = new ArrayList<>();

    public Combo(double precio) {
        super(precio);
    }

    public Combo() {
        super();
    }

    @Override
    public double getPrecio() {
        double total = 0;
        for (Jugueteria j : jugueterias){
            total += j.getPrecio();
        }
        return total;
    }

    public static Combo getInstance(){
        if (instancia == null){
            instancia = new Combo();
        }
        return instancia;
    }

    public void agregarProducto(Jugueteria j){
        jugueterias.add(j);
    }

    @Override
    public double aplicarCupon(String cupon) {
        return 0;
    }

    @Override
    public String reporte() {
        return null;
    }

    public Cupon agregarProducto(String producto){
        if(producto.equalsIgnoreCase("Juguete")){
            return new Juguete(3000, "carrito", 5);
        } else if (producto.equalsIgnoreCase("Disfraz")) {
            return new Disfraz(2500, "Batman", "M");
        } else if (producto.equalsIgnoreCase("JuegoDemesa")) {
            return new JuegoDeMesa(4000,"poker",2, 9);
        } else if (producto.equalsIgnoreCase("combo")) {
            Combo combo = new Combo();
            combo.agregarProducto(new Juguete(3000, "carrito", 5));
            combo.agregarProducto(new Disfraz(2500, "Batman", "M"));
            combo.agregarProducto(new JuegoDeMesa(4000,"poker",2, 9));
            return combo;
        }else return null;
    }



}
