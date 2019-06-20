import java.util.*;
public class ListaMain{
    public static void main(String[] args){
        Random r;
        int d,k;
        Lista lista;
        r= new Random();
        lista  = new Lista();   /*Se crea la lista vacia */
        k = Math.abs(r.nextInt() % 11);     /* Numero de nodos a generar */
        for(; k>0; k--){    /*Agregar a la lista*/
            d = (r.nextInt() % 50);     /*Datos de los nodos*/
            lista.insertarAlInicio(d);
        }

        System.out.println("\nElementos de la lista:");
        lista.visualizar();
        System.out.println("\nA continuacion se muestra el numero mayor y menor de la lista de numeros aleatorios: ");
        lista.encontrarNumeroMayorYMenor();

        
    }
}