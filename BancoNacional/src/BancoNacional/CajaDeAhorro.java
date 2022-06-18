package BancoNacional;

public class CajaDeAhorro {
    private double saldo;
    private double tasaInteres;

    public double getSaldo() {
        return saldo;
    }

    public CajaDeAhorro(double saldo, double tasaInteres) {
        this.saldo = saldo;
        this.tasaInteres = tasaInteres;
    }

    public CajaDeAhorro() {
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    @Override
    public String toString() {
        return "CajaDeAhorro{" +
                "saldo=" + saldo +
                ", tasaInteres=" + tasaInteres +
                '}';
    }
}
