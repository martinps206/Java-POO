/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complementario1;

/**
 *
 * @author BBarros
 */
public class Discografica {

    private String nombre;
    private String ciudad;
    private String nombreDueno; // ¿Atributo o nueva clase?
    private Solista[] solistas;
    private int dfSolistas;
    private int dlSolistas;
    private Banda[] bandas;
    private int dfBandas;
    private int dlBandas;

    public Discografica(String nombre, String ciudad, String nombreDueno, int dfSolistas, int dfBandas) {
        setNombre(nombre);
        setCiudad(ciudad);
        setNombreDueno(nombreDueno);
        this.solistas = new Solista[dfSolistas];
        this.dfSolistas = dfSolistas; // ¿así o hay que declarar getter/setter y usar: setDfSolistas(dfSolistas);?
        this.dlSolistas = 0;
        this.bandas = new Banda[dfBandas];
        this.dfBandas = dfBandas; // ¿así o hay que declarar getter/setter y usar: setDfBandas(dfBandas);?
        this.dlBandas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    public Solista getSolistas(int pos) {
        return solistas[pos];
    }

    /*
    public int getDfSolistas() {
        return dfSolistas;
    }

    public void setDfSolistas(int dfSolistas) {
        this.dfSolistas = dfSolistas;
    }
     */
    public Banda getBandas(int pos) {
        return bandas[pos];
    }

    /*
    public int getDfBandas() {
        return dfBandas;
    }

    public void setDfBandas(int dfBandas) {
        this.dfBandas = dfBandas;
    }
     */
    // b) Implemente la posibilidad de agregar artistas solistas y bandas a una discográfica.
    public void agregarSolista(Solista s) {
        if (dlSolistas < dfSolistas) {
            solistas[dlSolistas] = s;
            dlSolistas++;
            System.out.println("El solista fue agregado correctamente");
        } else {
            System.out.println("Lo sentimos, no puede representar a más solistas.");
        }
    }

    public void agregarBanda(Banda b) {
        if (dlBandas < dfSolistas) {
            bandas[dlBandas] = b;
            dlBandas++;
            System.out.println("La banda fue agregada correctamente");
        } else {
            System.out.println("Lo sentimos, no puede representar a más bandas.");
        }
    }

    // i. La cantidad de bandas representadas por una discográfica
    public int cantidadBandasRepresentadas() {
        return dlBandas;
    }

    // ii. Dado un instrumento, la cantidad de artistas solistas que tocan dicho instrumento
    public int instrumentosSolistas(String instrumento) {
        int cantidadSolistas = 0;

        for (int i = 0; i < dlSolistas; i++) {
            if (instrumento.equalsIgnoreCase(solistas[i].getInstrumento())) {
                cantidadSolistas++;
            }
        }
        return cantidadSolistas;
    }

    // iii. El nombre de la banda con más integrantes
    public String bandaMasIntegrantes() {
        String banda = "no hay bandas registradas";
        int cantidadIntegrantes = 0;

        for (int i = 0; i < dlBandas; i++) {
            if (cantidadIntegrantes < bandas[i].getCantidadIntegrantes()) {
                cantidadIntegrantes = bandas[i].getCantidadIntegrantes();
                banda = bandas[i].getNombre();
            }
        }
        return banda;
    }

    // iv. La cantidad de bandas formadas en la misma ciudad que la discográfica
    public int bandasMismaCiudad() {
        int cantidadBandas = 0;

        for (int i = 0; i < dlBandas; i++) {
            if (this.ciudad.equalsIgnoreCase(bandas[i].getCiudadFormacion())) {
                cantidadBandas++;
            }
        }
        return cantidadBandas;
    }
}
