package proyectos;

public class ProyectoTransferencia {

    public class Cliente{
        private int dni;
        private int numeroCuenta;
        private String tipoMoneda;
        private String direccion;
        private double capitalCuenta;
        private String telefono;
        private String email;
        private String estadoCuenta;
        
        public Cliente(){
        }
    }
    
    public class Receptor{
        private int dni;
        private int numeroCuenta;
        
        public Receptor(){
        }
    }
    
    public class Transferencia{
        private int dniCliente;
        private int dniReceptor;
        private int numeroCuentaCliente;
        private int numeroCuentaReceptor;
        private double monto;
        private String moneda;
        private double tipoCambio; 
        private int contDolares = 0;
        private int contPesos = 0;
        
        public Transferencia(){
        }
        
    }
    
    public Transferencia operacionTransferencia(Cliente c, Receptor r){
        Transferencia t = null;
        t.dniCliente = c.dni;
        t.dniReceptor = r.dni;
        t.numeroCuentaCliente = c.numeroCuenta;
        t.numeroCuentaReceptor = r.numeroCuenta;
        t.monto = 0;
        t.moneda = c.tipoMoneda;
        
     
        if(c.estadoCuenta == "Activo" && c.capitalCuenta >= t.monto){
            if(c.dni != r.dni){
                t.monto = t.monto + 0.5*t.monto;
            }
            if(t.moneda == "Dolares"){
                t.monto = t.monto + 2;
                t.contDolares++;
            }else{
                t.contPesos++;
            }
        }
        return t;
    }
    
    public void totalTransferencias(Transferencia t){
        double totalPesos = 0;
        double totalDolares = 0;
        int cont = 0;
        while (t.equals(null)){
            if (t.moneda == "Pesos"){
                totalPesos  = totalPesos + t.monto; 
            }else{
                
                totalDolares = totalDolares + t.monto;
                if (t.tipoCambio == 104.85){
                    cont++;
                }
            }
        }
        
        System.out.println("Total de transacciones," + t.contPesos + " y monto de las transferencias en pesos" + totalPesos );
        System.out.println("Total de transacciones," + t.contDolares + " y monto de las transferencias en pesos" + totalDolares );
        System.out.print("Total de las transferencias en dólares pero al cambio del día en pesos, el cual sería un valor fijo de 104,85 pesos"+cont);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
   
    }
    
}
