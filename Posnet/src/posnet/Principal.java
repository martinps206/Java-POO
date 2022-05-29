package posnet;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Posnet posnet = new Posnet();
        Persona p = new Persona("40545665", "Pepe", "Gomez", "1112345678", "pepe@fakemail.com");
        TarjetaDeCredito t = new TarjetaDeCredito("FakeBank", "1234567890123456", 15000, p, EntidadFinanciera.BIRZA);

        System.out.println("Tarjeta antes del pago");
        System.out.println(t);

        System.out.println("Ticket tras pagar...");
        Ticket ticketGenerado = posnet.efectuarPago(t, 10000, 5);
        System.out.println(ticketGenerado);

        System.out.println("Tarjeta despues del pago");
        System.out.println(t);
       
        
    }
    
}
