/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialTeatro;

/**
 *
 * @author Usuario
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Teatro t = new Teatro("Colon", "Caba", "Martin");
        Obras o1 = new Obras("Romeo", "Luis");
        t.agregarObra(o1);
        t.edadMaximaActor();
    }
    
}
