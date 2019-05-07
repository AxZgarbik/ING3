package Sistema;
import Modelo.Poligono;
import java.util.Scanner;

public class PruebaPunto2 {
    public static void main(String[] args) {
        int i;
        double sumaP,sumaA,maxP,minP,maxA,minA;
        sumaP=0;
        sumaA=0;
        maxP=0;
        minP=0;
        maxA=0;
        minA = 0;
        Scanner scanner = new Scanner(System.in);
        Poligono ArrayPoligono[] = new Poligono[10];
        for (i=0;i<ArrayPoligono.length;i++)
        {
            ArrayPoligono[i]=new Poligono();
            //Ingreso de datos
            System.out.println("ingrese X del poligono: ");
            ArrayPoligono[i].setX(scanner.nextDouble());
            System.out.println("ingrese N del poligono: ");
            ArrayPoligono[i].setN(scanner.nextDouble());
            System.out.println("ingrese Lado del poligono: ");
            ArrayPoligono[i].setLado(scanner.nextFloat());
            System.out.println("ingrese Y del poligono: ");
            ArrayPoligono[i].setY(scanner.nextDouble());
            //Suma para los promedios
            sumaP=sumaP+ArrayPoligono[i].getPerimetro(0, 0);
            sumaA=sumaA+ArrayPoligono[i].getArea(0, 0, 0, 0);
            //Comprobacion de Maximos y Minimos
            if (maxA<ArrayPoligono[i].getArea(0,0,0,0));
                maxA=ArrayPoligono[i].getArea(0,0,0,0);
                
            if (minA>ArrayPoligono[i].getArea(0,0,0,0));
                minA=ArrayPoligono[i].getArea(0,0,0,0);
                
            if (maxP<ArrayPoligono[i].getPerimetro(0,0));
                maxP=ArrayPoligono[i].getPerimetro(0,0);
                
            if (minP>ArrayPoligono[i].getPerimetro(0,0));
                minP=ArrayPoligono[i].getPerimetro(0,0);
                
            
        }
        System.out.println("El valor promedio de las Areas de los poligonos es: "+ sumaA/i);
        System.out.println("El valor promedio de los Perimetros de los poligonos es: "+ sumaP/i);
        System.out.println("El poligono con el area maxima es: " + maxA );
        System.out.println("El poligono con el area minima es: "+ minA);
        System.out.println("El poligono con el perimetro maximo es: "+maxP);
        System.out.println("El poligono con el perimetro minimo es: "+minP);
    }
    
}
