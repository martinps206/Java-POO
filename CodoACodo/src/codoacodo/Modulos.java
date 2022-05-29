package codoacodo;

public class Modulos {
    public double perimetroCuadrado(double area){
        return 4*Math.sqrt(area);
    }
    
    public int divisionEntera(int num1, int num2){
        return num1/num2;
    }
    
    public int resto(int num1, int num2){
        return num1%num2;
    }
    
    public double division(double num1, double num2){
        return num1/num2;
    }
    
    public int perimetro(int diametro){
        return diametro*(int)Math.PI;
    }
    
    public double perimetroCirculo(int radio){
        return 2*radio*Math.PI;
    }
    
    public double superficieCirculo(int radio){
        return (int)Math.PI*radio^2;
    }
    
    public double perimetroTriangulo(int lado1, int lado2, int lado3){
        return lado1+lado2+lado3;
    }
    
    public double superficieTriangulo(int lado1, int lado2, int lado3){
        double semi = (lado1+lado2+lado3)/2;
        return Math.sqrt(semi*(semi-lado1)*(semi-lado2)*(semi-lado3));
    }
    
    public String parImpar(int numero){
        if (numero % 2 == 0) {
            return "El numero es par";
        }
        return "El numero es impar";
    } 
    
    public String jubilacion(int edad, char sexo){
        String resp;
        if (edad<120 && edad>1) {
            if (sexo=='M' || sexo=='m') {
                if (edad>64) {
                    resp = "Puede jubilarse.";
                } else {
                    resp = "No puede jubilarse.";
                }
            } else {
                if (edad>60) {
                    resp = "Puede jubilarse.";
                } else {
                    resp = "No puede jubilarse.";
                }
            }
        } else {
            resp = "La edad no se encuentra en el rango.";
        }
        return resp;
    }
    
    public String divisible(int a, int b){
        String resp;
        if (a<101 && a>0 && b<101 && b>0) {
            if (a%b==0) {
                resp = a+" es divisible por "+b;
            } else {
                if (b%a==0) {
                    resp = b+" es divisible por "+b;
                } else {
                    resp = "Son primos entre si.";
                }
            }
        } else {
            resp = "no se enceuntra en el rango los numeros.";
        }
        return resp;
    }
    
    public String triangulo(int x, int y, int z){
        String trian;
        if (x+y>z && x+z>y && y+z>x && x-y<z && x-z<y && y-z<x) {
            if (x==y && x==z) {
                trian = "Es un triangulo EQUILATERO";
            } else {
                if (x==y || x==z || y==z) {
                    trian = "Es un triangulo ISOCELES";
                } else {
                    trian = "Es un triangulo ESCALENO";
                }
            }
        } else {
            trian = "No es un triangulo";
        }
        return trian;
    }
}
