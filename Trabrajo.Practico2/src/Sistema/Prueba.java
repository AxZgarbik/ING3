package Sistema;
import Modelo.Poligono;
public class Prueba {

    public static void main(String[] args) {
        Poligono p1 = new Poligono();
        Poligono p2= new Poligono();
        Poligono p3= new Poligono();
        
        System.out.println(p1.getPerimetro(0,0));
        System.out.println(p1.getArea(0, 0, 0, 0));
        
        System.out.println("Segundo Poligono");
        p2.setLado(4);
        p2.setN(6);
        System.out.println(p2.getArea(0, 0, 0, 0));
        System.out.println(p2.getPerimetro(0,0));
        
        System.out.println("Tercer Poligono");
        p3.setLado(10);
        p3.setN(4);
        p3.setX(5.6);
        p3.setY(7.8);
        System.out.println(p3.getArea(0, 0, 0, 0));
        System.out.println(p3.getPerimetro(0,0));
        
        System.out.println("La cantidad de poligonos es: "+ Poligono.getCantidad());
    }
    
}
