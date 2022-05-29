package CatedraMatematica;

public class Alumno {
    public String firstName;
    private String lastName;
    private int dni;
    private int worksDelivered;

    public Alumno(String firstName, String lastName, int dni) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dni = dni;
        this.worksDelivered = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getWorksDelivered() {
        return worksDelivered;
    }

    public void setWorksDelivered(int worksDelivered) {
        this.worksDelivered = worksDelivered;
    }

    @Override
    public String toString() {
        return "Alumno{" + "firtNamte=" + firstName + ", lastsName=" + lastName + ", dni=" + dni + ", worksDelivered=" + worksDelivered + '}';
    }
    
    
}
