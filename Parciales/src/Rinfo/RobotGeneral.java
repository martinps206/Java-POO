package Rinfo;

public class RobotGeneral extends Robot{
    private int contFloresDepositadas;

    public RobotGeneral(int contFloresDepositadas, String nombre, int cantFloresbolsa) {
        super(nombre, cantFloresbolsa);
        this.contFloresDepositadas = 0;
    }

    public int getContFloresDepositadas() {
        return contFloresDepositadas;
    }

    public void setContFloresDepositadas(int contFloresDepositadas) {
        this.contFloresDepositadas = contFloresDepositadas;
    }
    
    public void depositarFlor(){
        contFloresDepositadas++;
    }
    
    public double calcularEnergiaConsumida(){
        return getNumeroPasos()*0.15+contFloresDepositadas*0.20;
    }
}
