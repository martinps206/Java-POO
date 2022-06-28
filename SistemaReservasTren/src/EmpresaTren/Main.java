package EmpresaTren;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception{
        ArrayList<Empresa> listaEmpresa = new ArrayList<>();

        Empresa empresa01 = new Empresa("AISA TREN, S.A.U.");
        Recorrido rec01 = new Recorrido("Buenos Aires", "Lujan");
        Recorrido rec02 = new Recorrido("Buenos Aires", "Mercedes");

        Reserva r1 = new Reserva("001", rec01, 80);
        Reserva r2 = new Reserva("002", rec01, 80);
        Reserva r3 = new Reserva("003", rec02, 100);

        empresa01.addReserva(r1);
        empresa01.addReserva(r2);
        empresa01.addReserva(r3);

        Empresa empresa02 = new Empresa("FERROVIAL CONSTRUCCION");
        Recorrido rec11 = new Recorrido("Alberti", "Lujan");
        Recorrido rec12 = new Recorrido("Alberti", "Buenos Aires");

        Reserva r4 = new Reserva("004", rec11, 50);
        Reserva r5 = new Reserva("005", rec11, 50);
        Reserva r6 = new Reserva("006", rec11, 50);
        Reserva r7 = new Reserva("007", rec12, 75);
        Reserva r8 = new Reserva("008", rec12, 75);
        Reserva r9 = new Reserva("009", rec12, 75);

        empresa02.addReserva(r4);
        empresa02.addReserva(r5);
        empresa02.addReserva(r6);
        empresa02.addReserva(r7);
        empresa02.addReserva(r8);
        empresa02.addReserva(r9);


        listaEmpresa.add(empresa01);
        listaEmpresa.add(empresa02);

        for (Empresa e: listaEmpresa) {
            System.out.println(e.toString());
            System.out.println("Recaudacion total es : " + e.recaudacionTotal());
        }

        //empresa01.getReserva().get(0).cantVecesRecorrida("Lujan");

        empresa01.cantVecesRecorrida("Lujan");
        empresa02.cantVecesRecorrida("Alberti");


    }
}
