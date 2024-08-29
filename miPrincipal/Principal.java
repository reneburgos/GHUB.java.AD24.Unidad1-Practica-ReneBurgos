package miPrincipal;
import java.util.Scanner;
import org.junit.jupiter.engine.script.ScripAccessor;
public class Principal
{
    public static void main(String[] args) 
    {  // System.out.println(new Principal().getGreeting());
        Scanner consola = new Scanner(System.in);
        int opc = 0;
        do
        {
        System.out.println(x:"========================================");
        System.out.println(x:"        TIPOS DE DATOS ABSTRACTOS       ");
        System.out.println(x:"========================================");
        System.out.println(x:" 1) Rational");
        System.out.println(x:" 2) Matriz");
        System.out.println(x:" 3) Cadena");
        System.out.println(x:" 4) Numerote");
        System.out.println(x:" 5) Conjunto");
        System.err.println();
        System.out.println(x:" 0) Salir");
        System.out.print(s:"Selecciona una opcion ");
        opc = consola.nextInt();

        switch (opc)
        {
            case 1:
                AppRational.menu();
                break;
            case 2:
            case 3:
            case 4: 
            case 5:
                AppConjunto.menu();
                break;
            case 0:
                System.out.println(x:"Hasta luego:");
                break;
            default:
                System.out.println(x:"Valor incorrecto, intentalo de nuevo");
        }


        }while(opc !=0);

       
    }
}