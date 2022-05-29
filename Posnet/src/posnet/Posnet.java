package posnet;

public class Posnet {
    
    public static final double RECARGO_POR_CUOTAS = 0.03;
    public static final int MIN_CANT_CUOTAS = 1;
    public static final int MAX_CANT_CUOTAS = 6;
    
    public Ticket efectuarPago(TarjetaDeCredito tarjeta, double montoAbonar, int cantCuota){
        Ticket elTicket = null;
        if (datosValidos(tarjeta, montoAbonar, cantCuota)){
            double montoFinal = montoAbonar + montoAbonar*recargoSegunCuotas(cantCuota);
            if (tarjeta.tieneSaldoDisponible(montoFinal)){
                tarjeta.descontar(montoFinal);
                String nomApe = tarjeta.nombreCompletoDeTitular();
                double montoPorCuota = montoFinal / cantCuota;
                elTicket = new Ticket(nomApe, montoFinal, montoPorCuota);
            }
        }
        return elTicket;
    }
    
    private boolean datosValidos(TarjetaDeCredito tarjeta, double monto, int cant){
        boolean tarjetaValida = tarjeta != null;
        boolean esMontoValido = monto > 0;
        boolean cantCuotasValidas = cant >= MIN_CANT_CUOTAS && cant <= MAX_CANT_CUOTAS;
        return tarjetaValida && esMontoValido && cantCuotasValidas;
    }

    private double recargoSegunCuotas(int cantCuota){
        
        return (cantCuota - 1) * RECARGO_POR_CUOTAS;
    }

}
