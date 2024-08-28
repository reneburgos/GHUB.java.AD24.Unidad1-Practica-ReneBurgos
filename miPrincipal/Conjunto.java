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
        return encontrado;
    }
    // Añadir un elemento si no esta en el conjunto
    public void aniadir(Object elemento)
    {
        if (!pertenece(elemento))
        {
            // Verificar si hay posiciones
            if(cardinal == capacidad)
            {
                Object nuevoCto[];
                nuevoCto = new Object[capacidad+M];
                for (int k=0; k<capacidad; k++)
                {
                    nuevoCto[k] = cto[k];
                }
                capacidad += M;
                cto =nuevoCto;
            }
            cto[cardinal++]= elemento;
        }
    }
    // Quita el elemento del conjunto
    public void retirar(Object elemento)
    {
        if(pertenece(elemento))
        {
            // Localizar el elemento a retirar
            int k=0;
            while(!cto[k].equals(elemento))
            k++;
            // Desde el elemento k hasta la ultima posicion
            // mover los elementos hacia la izquierda
            for(;k<cardinal;k++)
            {
                cto[k]=cto[k+1];
            }
            cardinal--;
        }
    }
    // Devuelvele el numero de elementos
    public int cardinal()
    {
        return this.cardinal;
    }

    // Operacion de una union de dos conjuntos
    public Conjunto union(Conjunto c2)
    {
        Conjunto u = new Conjunto();

        // Primero copia el primer conjunto de la union
        for(int k=0; k<cardinal; k++)
        {
            u.cto[k]=this.cto[k];
        }
        u.cardinal=this.cardinal;

        // Añadir los elementos de c2 no incluidos
        for(int k=0; k<c2.cardinal; k++)
        {
            u.aniadir(c2.cto[k]);
        }
        return u;
    }
}