import java.util.Scanner;
public class MetodosEstadisticos{
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    OperacionesEstadisticas operaciones = new OperacionesEstadisticas();
    float elementos;
    int opcion;
    int respuesta;
    int respuesta2;
    
    do{
    System.out.println("\n-Ingrese la cantidad maxima de numeros");
    System.out.print("Cantidad maxima: ");
    int tamanio = teclado.nextInt();
    float numeros[] = new float[tamanio];

    System.out.println("\n-A CONTINUACION INGRESE LOS NUMEROS-");
    for(int i=0;i<numeros.length;i++){
        System.out.print("Ingrese un numero: ");
    elementos = teclado.nextFloat();
    numeros[i] = elementos;
    }

    do{
    System.out.println("\nIngrese la opcion que desea realizar: ");
    System.out.println("1.-Media");
    System.out.println("2.-Mediana");
    System.out.println("3.-Moda");
    System.out.print("Opcion: ");
    opcion = teclado.nextInt();

    switch(opcion){
        case 1: 
        ordSeleccion(numeros);
        System.out.println("\nEl arreglo ordenado de menor a mayor queda de la siguiente forma: ");
        for(int j=0;j<numeros.length;j++){
            System.out.println(numeros[j]);
        }
        operaciones.media(numeros);
        break;
        case 2: 
        ordSeleccion(numeros);
        System.out.println("\nEl arreglo ordenado de menor a mayor queda de la siguiente forma: ");
        for(int j=0;j<numeros.length;j++){
            System.out.println(numeros[j]);
        }
        operaciones.mediana(numeros,tamanio);
        break;
        case 3:
        ordSeleccion(numeros);
        System.out.println("\nEl arreglo ordenado de menor a mayor queda de la siguiente forma: ");
        for(int j=0;j<numeros.length;j++){
            System.out.println(numeros[j]);
        }
        operaciones.operacionModa(numeros,0,numeros.length-1);
        break;
        default: System.out.println("Opcion no valida.");

    }
    System.out.println("\n-Si desea realizar otra operacion mas con los numeros anteriores escriba 1, si su respuesta es no escriba otro numero: ");
    System.out.print("-RESPUESTA: ");
    respuesta = teclado.nextInt();

    }while(respuesta==1);
    System.out.println("\n-Si desea crear otro arreglo nuevo con otros numeros escriba 1");
    System.out.println("-Si desea salir del programa escriba otro numero diferente a 1");
    System.out.print("-RESPUESTA: ");
    respuesta2 = teclado.nextInt();
}while(respuesta2==1);
}

    public static void ordSeleccion (float a[]){
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
    public static void intercambiar(float []a, int i, int j){
        float aux = a[i];
        a[i] = a[j];
        a[j]= aux ;
    
    }

    public static int busquedaBinaria(float numeros[],float valorBuscado2){
        int indiceCentral;
        float valorCentral;
        int inicioA=0; 
        int finA = numeros.length-1;
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
    



    } 

