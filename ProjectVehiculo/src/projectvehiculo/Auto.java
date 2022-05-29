package projectvehiculo;

public class Auto extends Vehiculo implements vel_max{
    private int cantPuertas;

    public Auto(int cantPuertas, String modelo, int anio, String marca) {
        super(modelo, anio, marca);
        this.cantPuertas = cantPuertas;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    // Estoy que le meto cualquier cosa XD
    @Override
    public int ocupantes() {
        int cant = 0;
        if (this.cantPuertas > 2 && this.anio > 2018){
            cant = 5;
        } else {
            cant = 4;
        }
        return cant;
    }

    @Override
    public String toString() {
        return "Auto{" + super.toString() + ", cantPuertas = " + cantPuertas + '}';
    }
    
    
}
