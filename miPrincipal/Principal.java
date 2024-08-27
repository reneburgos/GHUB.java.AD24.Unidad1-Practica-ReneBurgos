package miPrincipal;
public class Principal
{
    public static void main(String[] args) 
    {   // PROBAR CLASE RATIONAL
       Rational r1 = new Rational(a:5,b:3);
       Rational r2 = new Rational(a:4,b:3);
       Rational r3 = new Rational();
       r3 = r1.add(r1,r2);

       System.out.println("Resultado de la suma: "+r3);

       Rational r4 = new Rational();
       r4 = r1.mult(r1, r2);
       System.out.println("Resultado de la multiplicacion es: "+r4);

       rational r5 = new Rational(a:7, b:3);
       System.out.println("Resultado de la comparacion de "+r3+" y "+r5+" es: ");
    }
}