package miPrincipal;
public class AppConjunto 
{
    package miPrincipal;
import java.util.Scanner;
public class AppConjunto
{
    public static void menu()
    {
        System.out.println("===========================");
        System.out.println("   OPERACIONES CON PUNTO   ");
        System.out.println("===========================");

        Punto p1 = new Punto(x:2, y:1);
        Punto p2 = new Punto(x:2, y:3);
        Punto p3 = new Punto(x:4, y:1);

        System.out.println("Valor de x en punto1: "+p1.getX());
        System.out.println("Valor de y en punto1: "+p1.gety());

        System.out.println("Valor de x en punto2: "+p2.getX());
        System.out.println("Valor de y en punto2: "+p2.getY());

        System.out.println("Valor de x en punto3: "+p3.getX());
        System.out.println("Valor de y en punto: "+p3.getY());
    }
}
}
