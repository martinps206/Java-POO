package projectvehiculo;

public class Moto extends Vehiculo implements vel_max{
    private String cilindrada;

    public Moto(String modelo, int anio, String marca, String cilindrada) {
        super(modelo, anio, marca);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    @Override
    public int ocupantes() {
        int cant = 0;
        if (this.cilindrada.equalsIgnoreCase("Alta")) {
            cant = 2;
        } else {
            if (this.cilindrada.equalsIgnoreCase("Baja")) {
                cant = 1;
            } else {
                return cant;
            }
        }
        return cant;
    }

    @Override
    public String toString() {
        return "Moto{" + super.toString() + ", cilindrada = " + cilindrada + '}';
    }
    
}
