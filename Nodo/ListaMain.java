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
        int numeroComparacion=0;
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
        System.out.println("5.- Eliminar dato de la lista");
        System.out.println("6.- Insertar dato entre 2 numeros");
        System.out.println("7.- Insertar un dato al inicio");


        System.out.print("Opcion: ");
        opcion = teclado.nextInt();
        if(opcion>=1 && opcion<=7){
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
                    System.out.println("Error, posicion no existente.");
                }

            break;
            case 3:
                lista.encontrarNumeroMayorYMenor();
            break;
            case 4: 
                System.out.println("\nA continuacion se presentan los numeros ordenados de menor a mayor: ");
                lista.visualizar();
            break;
            case 5:
                int entrada;
                System.out.println("\nIngrese el numero a eliminar: ");
                System.out.print("Numero: ");
                entrada = teclado.nextInt();
                lista.eliminar(entrada);
                System.out.println("\nLa lista quedaria de la siguiente manera ordenada de menor a  mayor: ");
                lista.visualizar();

            break;
            case 6:
                int numeroFinal;
                int anterior;
                System.out.println("\nIngrese el nuevo numero que se colocara en la lista: ");
                System.out.print("Numero: ");
                numeroFinal = teclado.nextInt();
                System.out.println("Ingrese el numero que se encuentra en la posicion anterior de donde se colocara el nuevo numero en la lista: ");
                System.out.print("Numero: ");
                anterior = teclado.nextInt();
                lista.insertarLista(anterior, numeroFinal);
                System.out.println("\nLista resultante: ");
                lista.visualizar();
            break;
            case 7:
                int nuevoNumero;
                System.out.println("\nIngrese el numero que desea colocar al inicio de la lista: ");
                System.out.print("Numero: ");
                nuevoNumero = teclado.nextInt();
                lista.insertarAlInicio(nuevoNumero);
                System.out.println("Asi quedaria la lista ordenada de mayor a menor: ");
                lista.visualizar();
            break;
            /*case 8:
                for(int i=0; i<capacidad;i++){
                System.out.print("-Ingrese un numero: ");
                numero = teclado.nextInt();
                lista.insertaOrden(numero);
                }
                System.out.println("Lista Ordenada: ");
                lista.visualizar();


            break;*/
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