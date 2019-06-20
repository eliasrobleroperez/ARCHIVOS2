import java.util.Scanner;
public class Intercambio{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int opcion;
        int elementos;
        int respuesta;
        int valorBuscado=0;
        int valorBuscado2=0;

        System.out.println("-Ingrese la cantidad maxima de numeros");
        System.out.print("Cantidad maxima: ");
        int tamanio = teclado.nextInt();
        int numeros[] = new int[tamanio];
         
        do{
        System.out.println("\n-Ingrese la opcion que desea: ");
        System.out.println("1.- Ingresar datos");
        System.out.println("METODOS DE ORDENAMIENTO:");
        System.out.println("2.- Intercambio");
        System.out.println("3.- Seleccion");
        System.out.println("4.- Insercion");
        System.out.print("Opcion: ");
        opcion = teclado.nextInt();
        switch(opcion){
            case 1:
                System.out.println("\n-A CONTINUACION INGRESE LOS NUMEROS-");
                    for(int i=0;i<numeros.length;i++){
                        System.out.print("Ingrese un numero: ");
                    elementos = teclado.nextInt();
                    numeros[i] = elementos;
                    }
            break;
            case 2: 
                ordIntercambio(numeros);
            for(int j=0;j<numeros.length;j++){
                System.out.println(numeros[j]);
            }
            break;
            case 3: 
                ordSeleccion(numeros);
                for(int j=0;j<numeros.length;j++){
                    System.out.println(numeros[j]);
                }
            break;
            case 4:
            ordInsercion(numeros);
            for(int j=0;j<numeros.length;j++){
                System.out.println(numeros[j]);
            }
            break;
            default: System.out.println("Error, opcion no valida.");
        }
        System.out.println("\nSi desea realizar alguna operacion mas de las anteriores seleccione 1, si su respuesta es no seleccione otro numero");
        respuesta = teclado.nextInt();
    }while(respuesta==1);


        int posicionNumero;

        System.out.println("\nA continuacion ingrese la opcion para el metodo de busqueda: ");
        System.out.println("1.-Busqueda Secuencial");
        System.out.println("2.-Busqueda Binaria");
        System.out.print("Opcion: ");
        opcion = teclado.nextInt();
        switch(opcion){
            case 1: 
            System.out.println("Ingrese el numero que desea buscar: ");
            System.out.print("Numero: ");
            valorBuscado = teclado.nextInt();
            busquedaSecuencial(tamanio,valorBuscado, numeros);
            break;
            case 2: 
            System.out.println("Ingrese el numero que desea buscar: ");
            System.out.print("Numero: ");
            valorBuscado2 = teclado.nextInt();
            posicionNumero = busquedaBinaria(valorBuscado2, numeros);
            if(posicionNumero==-1){
                System.out.println("El numero no existe");
            }
            else{
                System.out.println("Se encontro en la posicion: "+posicionNumero);
            }
            break;
            default: System.out.println("Opcion no valida.");

        }
        
    }

public static void busquedaSecuencial(int tamanio,int valorBuscado,int numeros[]){
    int i=0;
    int max = tamanio;
while(i<max && valorBuscado!= numeros[i]){
    i++;
}
    if(i!=max)
        System.out.println("Se encontro en la posicion: "+i++);
    
    else
        System.out.println("No se encontro el numero");
    
}
public static int busquedaBinaria(int valorBuscado2,int numeros[]){
    int indiceCentral,valorCentral;
    int inicioA=0, finA = numeros.length-1;
    while(inicioA<=finA){
        indiceCentral = (inicioA + finA)/2;
        valorCentral = numeros[indiceCentral];
    if(valorBuscado2 == valorCentral){
        return indiceCentral; 
    }
    else if(valorBuscado2<valorCentral){
        finA = indiceCentral-1;
     }
        else{
        inicioA = indiceCentral+1;
        }
}
return -1;
}
public static void intercambiar(int []a, int i, int j){
    int aux = a[i];
    a[i] = a[j];
    a[j]= aux ;

}

public static void ordIntercambio(int a[]){
    int i, j;
    for (i = 0 ; i < a.length-1; i++)
    // sitúa mínimo de a[i+1]...a[n-1] en a[i]
    for (j = i+1 ; j < a.length; j++)
    if (a[i] > a[j])
    {
    intercambiar(a, i, j);
    }

}
public static void ordSeleccion (int a[]){
    int indiceMenor, i, j, n;
    n = a.length;
    for (i = 0; i < n-1; i++){
    // comienzo de la exploración en índice i
    indiceMenor = i;
    // j explora la sublista a[i+1]..a[n-1]
    for (j = i+1; j < n; j++)
        if (a[j] < a[indiceMenor])
            indiceMenor = j;

    // sitúa el elemento mas pequeño en a[i]
    if (i != indiceMenor)
        intercambiar(a, i, indiceMenor);
}
}
public static void ordInsercion (int [] a){
    int i, j;
    int aux;
    for (i = 1; i < a.length; i++){
    /* indice j es para explorar la sublista a[i-1]..a[0] buscando la
    posicion correcta del elemento destino*/
    j = i;
    aux = a[i];
    // se localiza el punto de inserción explorando hacia abajo
    while (j > 0 && aux < a[j-1]){
    // desplazar elementos hacia arriba para hacer espacio
    a[j] = a[j-1];
    j--;
    }
    a[j] = aux;
    }
}
}