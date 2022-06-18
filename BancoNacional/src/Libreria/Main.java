package Libreria;

public class Main {
    Usuario u1 = new Usuario("Dayanna Bechara");

    LibroDigital l1 =
            new LibroDigital("Don quijote", "123", 100, 10, u1, 132465795, 50);

    LibroFisico l2 = new LibroFisico("Media Noche enParis", "465", 150, 20, u1);
}
