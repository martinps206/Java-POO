import Universidad.Alumnos;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Martin");

        //Circulo objeto_1 = new Circulo();

        //Circulo objeto_2 = new Circulo(10);

        //Circulo objeto_3 = new Circulo("rojo", 5);

        //System.out.println("Superficie : " + objeto_3.superficie());

        //Persona objeto_1 = new Persona("Erika", "Herazo", 26,"1234678","Conviviente");
        //Persona objeto_2 = new Persona("Dayanna", "Bechara", 26, "45678912", "Union libre");

        //System.out.println("Objeto : " + objeto_1.toString());
        //System.out.println("Objeto : " + objeto_2.toString());

        Alumnos a = new Alumnos("Martin", "Paliza", "1234678", "martin@email.com", "1234/1");
        a.examenFinal("Matematica 1", 10);
        a.examenFinal("Matematica 2", 5);
        System.out.println(a.calcularPromedioGeneral());
    }
}