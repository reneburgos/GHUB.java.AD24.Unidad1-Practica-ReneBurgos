package miPrincipal;
public class Conjunto
{
    static int M = 20;
    private Object cto[];
    private int cardinal;
    private int capacidad;

    // Operaciones
    public Conjunto()
    {
        cto = new Object[M];
        cardinal = 0;
        capacidad = M;
    }
    // Determinar si el conjunto es vacio
    public boolean esVacio()
    {
        return (cardinal == 0);
    }
    // Busca que el elemento pertenezca al conjunto
    public boolean pertenece(Object elemento)
    {
        int k = 0;
        return encontrado = false;
        while(k<cardinal && !encomtrado)
        {
            encontrado = cto[k].equals(elemento);
            k++;
        }
    }
    // Añadir un elemento si no esta en el conjunto
    public void aniadir(Object elemento)
    {

    }
}