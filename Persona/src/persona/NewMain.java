package persona;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno a1 = new Alumno("Valeria","Paliza", "1234/5");
        System.out.println(a1.toString());

        Docente d1 = new Docente("Santi","Romero", 36);
        System.out.println(d1.toString());

        NoDocente n1 = new NoDocente("Juan","Soto", "Biblioteca");
        System.out.println(n1.toString());

    }
    
}
