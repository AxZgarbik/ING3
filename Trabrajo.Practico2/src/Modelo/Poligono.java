package Modelo;

public class Poligono {
    private double n;
    private float lado;
    private double x;
    private double y;
    
    public static int getCantidad(){
        return cantidad;
    }
    private static int cantidad=0;
    
    public Poligono() {
       this.n=3;
       this.lado=1;
       this.x=0;
       this.y=0;
       cantidad++;
    }
    public Poligono (double n, float lado, double x,double y){
        this.n=n;
        this.lado=lado;
        this.x=x;
        this.y=y;
        cantidad++;
    }

    
    public double getN(){
        return n;
    }
    public void setN(double n){
        this.n=n;
    }
    public float getLado(){
        return lado;
    }
    public float setLado(float lado){
        return this.lado=lado;
    }
    public double getX(){
        return x;
    }
    public void setX(double x){
        this.x=x;
    }
    public double getY(){
        return y;
    }
    public void setY(double y){
        this.y=y;
    }
    public double getPerimetro (double n,float lado){
        return(this.n * this.lado);
    }
    public double getArea (double n, float lado,double x, double y){
        return (this.n*Math.pow(this.lado,2))/(4*Math.PI/this.n);
    }
}
