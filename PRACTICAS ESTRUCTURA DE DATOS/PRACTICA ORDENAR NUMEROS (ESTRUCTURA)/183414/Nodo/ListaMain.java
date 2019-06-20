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
        System.out.println("\nA continuacion se presentan los numeros ordenados de menor a mayor: ");
        lista.visualizar();
        System.out.println("\nA manera de comprobacion: ");
        lista.encontrarNumeroMayorYMenor();

    }
}