package Banco;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Martin", "Paliza", 21);
        Persona p2 = new Persona("Luis", "Paliza", 82);
        Persona p3 = new Persona("Gustavo", "Paliza", 75);
        Persona p4 = new Persona("Diego", "Paliza", 42);
        Persona p5 = new Persona("Valeria", "Paliza", 18);

        Banco banco = new Banco();
        banco.atender(p1);

        banco.suspendeVentanilla();

        banco.atender(p2);
        banco.atender(p3);

        banco.cerraVentanilla();
        banco.atender(p4);
    }
}
