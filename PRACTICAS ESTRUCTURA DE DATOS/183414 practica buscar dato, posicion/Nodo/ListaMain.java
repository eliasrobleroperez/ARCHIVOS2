import java.util.*;
import java.util.Scanner;
public class ListaMain{
    public static void main(String[] args){
        PilaOperaciones pila1 = new PilaOperaciones(50);
        PilaOperaciones pila2 = new PilaOperaciones(50);
        Scanner teclado =  new Scanner(System.in);

        int capacidad = 0;
        int numero  = 0;
        int aux = 0;
        int numeroComparacion = 0;
        int destino=0;
        int repetir;
        int posicion;
        int opcion;

        Lista lista;
        lista  = new Lista();   

        System.out.print("-Ingrese la cantidad de nodos que tendra su lista: ");
        capacidad =  teclado.nextInt();
        System.out.println("\nA continuacion ingrese los numeros: ");
        for(int i=0; i<capacidad;i++){
            System.out.print("-Ingrese un numero: ");
            numero = teclado.nextInt();
            pila1.push(numero);
        }
        for(int i=0;i<capacidad;i++){
            aux = i;
            int menor = 5000000;
            while(aux<capacidad){
                numeroComparacion = pila1.pop();
                if(numeroComparacion<menor){
                    menor = numeroComparacion;
                }
                pila2.push(numeroComparacion);
                aux++;
            }
        
            pila1.push(menor);

            while(!pila2.isEmpty()){
            numeroComparacion = pila2.pop();
            if(numeroComparacion!=menor){
                pila1.push(numeroComparacion);
            }
            }
        }
        while(!pila1.isEmpty()){
            lista.insertarAlInicio(pila1.pop());
        }

        
        do{
        System.out.println("\nSeleccione la opcion que desea realizar: ");
        System.out.println("1.- Buscar dato en especifico");
        System.out.println("2.- Buscar una posicion");
        System.out.println("3.- Obtener maximo y minimo");
        System.out.println("4.- Visualizar elementos de la lista");
        System.out.print("Opcion: ");
        opcion = teclado.nextInt();
        if(opcion>=1 && opcion<=5){
        switch(opcion){
            case 1:

                System.out.print("\nIngrese el numero a buscar en la lista: ");
                destino = teclado.nextInt();
                System.out.println(lista.buscarDato(destino));
            break;
            case 2: 
                try{
                System.out.print("\nIngrese la posicion a buscar: ");
                posicion =  teclado.nextInt();
                System.out.println(lista.buscarPosicion(posicion));
                }
                catch(NullPointerException exception){
                    System.out.println("Error, posicion no valida.");
                }

            break;
            case 3:
                lista.encontrarNumeroMayorYMenor();
            break;
            case 4: 
                System.out.println("\nA continuacion se presentan los numeros ordenados de menor a mayor: ");
                lista.visualizar();
            break;
            default:
        }
    }
    else{
        System.out.println("Error, opcion no valida.");
    }
    System.out.println("\nSi desea realizar otra operacion escriba 1, sino seleccione otro numero:");
    System.out.print("Opcion: ");
    repetir = teclado.nextInt();
}while(repetir==1);


    }
}