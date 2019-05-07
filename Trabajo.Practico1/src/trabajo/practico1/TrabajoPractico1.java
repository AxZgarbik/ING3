
package trabajo.practico1;
import java.util.Scanner;
public class TrabajoPractico1 {
    
    
    public static void main(String[] args) {
//-------------------PUNTO 1 y 2 ------------------------------  
//    double area;
//    double pi;
//    int radio;
//    Scanner scanner = new Scanner (System.in);
//    pi = 6.14;
//    radio = 2;
//    System.out.println("Ingrese el valor de Radio: ");
//    String EntradaRadio = scanner.nextLine();
//    radio = Integer.parseInt(EntradaRadio);
//    area = (pi*(radio*radio));
//    System.out.println(area);
//    System.out.println("El valor del area es " + area);

// --------------------- Punto 3 ----------------------------
//    double a;
//    double b;
//    double aux;
//    a = Math.random();
//    b = Math.random();
//    System.out.println(a);
//    System.out.println(b);
//    if (a<b){
//        aux = b;
//        b=a;
//        a=aux;
//        System.out.println(a);
//        System.out.println(b);
//    }
//-----------------------Punto 4------------------------
//    int ingreso;
//    Scanner scanner=new Scanner(System.in);
//    System.out.println("Ingrese el valor del Ingreso: ");
//    String Entrada= scanner.nextLine();
//    ingreso = Integer.parseInt(Entrada);
//    if (ingreso > 0 & ingreso < 100){
//        System.out.println("El Impuesto es de 10%");
//    }
//    if (ingreso > 101 & ingreso < 10000) {
//        System.out.println("El Impuesto es de 20%");
//    }
//    if (ingreso>10000){   
//        System.out.println("El Impuesto es de 30%");    
//    }
//    
//----------------------Punto 5-------------------------
//    int dia;
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("Ingrese un dia de la semana (1 al 7): ");
//    String Entreda = scanner.nextLine();
//    dia = Integer.parseInt(Entreda);
//    switch (dia){
//        case 1:
//            System.out.println("Lunes, no es fin de semana");
//            break;
//        case 2:
//            System.out.println("Martes, no es fin de semana");
//            break;
//        case 3:
//            System.out.println("Miercoles, no es fin de semana");
//            break;
//        case 4:
//            System.out.println("Jueves, no es fin de semana");
//            break;
//        case 5:
//            System.out.println("Viernes, no es fin de semana");
//            break;
//        case 6:
//            System.out.println("Sabado, es fin de semana");
//            break;
//        case 7:
//            System.out.println("Domingo, es fin de semana");
//            break;
//    }
//---------------------Punto 7------------------------
//    double CantidadKm;
//    double CantidadKxL;
//    double PrecioL;
//    double Costo;
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("Ingrese la distancia Recorrida: ");
//    String EntradaKm = scanner.nextLine();
//    CantidadKm= Double.parseDouble(EntradaKm);
//    System.out.println("Ingrese la cantidad de Km por litro: ");
//    String EntradaKxL = scanner.nextLine();
//    CantidadKxL = Double.parseDouble(EntradaKxL);
//    System.out.println("Ingrese el Precio del litro: ");
//    String EntradaPrecio = scanner.nextLine();
//    PrecioL = Double.parseDouble(EntradaPrecio);
//    Costo = ((CantidadKm/CantidadKxL)*PrecioL);
//    System.out.println("El costo del viaje es: " + Costo);
//--------------------Punto 8--------------------------    
//    int Mes;
//    Mes =  (int) Math.ceil(Math.random()*(12-1+1)+1);
//    System.out.println(Mes);
//    switch (Mes)
//        {
//        case 1:
//             System.out.println("Febrero");
//             break;
//        case 2:
//             System.out.println("Enero");
//             break;
//        case 3:
//             System.out.println("Marzo");
//             break;
//        case 4:
//             System.out.println("Abril");
//             break;
//        case 5:
//             System.out.println("Mayo");
//             break;
//        case 6:
//             System.out.println("Junio");
//             break;
//        case 7:
//             System.out.println("julio");
//             break;
//        case 8:
//             System.out.println("Agosto");
//             break;
//        case 9:
//             System.out.println("Septiembre");
//             break;
//        case 10:
//             System.out.println("Octubre");
//             break;
//        case 11:
//             System.out.println("Noviembre");
//             break;
//        case 12:
//             System.out.println("Diciembre");
//             break;
//    }
//   
//----------------------Punto 9-------------------------
//    double matricula;
//    int aux;
//    matricula = 10000;
//    double aumento;
//    aumento=1.05;
//    int x;
//    Scanner scanner= new Scanner(System.in);
//    System.out.println("Ingrese la cantidad de años que desea calcular: ");
//    String Entrada = scanner.nextLine();
//    x = Integer.parseInt(Entrada);
//    for (aux = 1; aux<=x; aux+=1){
//        matricula = (matricula * aumento);
//    }
//    System.out.println(matricula);
//  
//----------------------Punto 10-------------------------
    int CantidadEst;
    String Nombre;
    String AuxNombre = " ";
    int aux;
    double puntaje,auxP;
    auxP = 0;
    Scanner scanner = new Scanner (System.in);
    System.out.println("Ingrese la cantidad de alumnos: ");
    String Entrada = scanner.nextLine();
    CantidadEst=Integer.parseInt(Entrada);
    for (aux = 1; aux <= CantidadEst; aux+=1)
    {
        System.out.println("Ingrese el nombre del alumno: ");
        String NomAlum = scanner.nextLine();
        Nombre=NomAlum;
        System.out.println("Ingrese el puntaje del alumnos: ");
        String PuntAlum = scanner.nextLine();
        puntaje = Double.parseDouble(PuntAlum);
        if (puntaje>auxP){
            AuxNombre=Nombre;
            auxP=puntaje;
        }   
    }
    System.out.println("El mejor puntaje es: "+auxP);
    System.out.println("El alumno con el mejor puntaje es: "+AuxNombre);
   }      
}
