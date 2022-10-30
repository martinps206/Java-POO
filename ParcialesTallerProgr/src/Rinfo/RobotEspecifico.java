package Rinfo;

public class RobotEspecifico extends Robot{
    private int [][]floresDepositadasPorEsquina = new int[100][100];

    public RobotEspecifico(String nombre, int cantFloresbolsa) {
        super(nombre, cantFloresbolsa);
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                floresDepositadasPorEsquina[i][j]=0;
            }
        }
    }
    
    public void depositarFlor(){
        floresDepositadasPorEsquina[getNroAvenida()][getNroCalle()]++;
    }
    
    public double calcularEnergiaConsumida(){
        int total = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                total = total + floresDepositadasPorEsquina[i][j];
            }
        }
        return Math.sqrt(getNumeroPasos()+total);
    }
    
    public void devolverFloresDepositadasEnEsquina(int a, int c){
        int total = floresDepositadasPorEsquina[a][c];
        setCantFloresbolsa(getCantFloresbolsa()+total);
        floresDepositadasPorEsquina[a][c] = 0;
    }
}
