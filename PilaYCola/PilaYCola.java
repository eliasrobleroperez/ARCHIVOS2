import java.util.Scanner;

import javax.swing.plaf.synth.SynthToggleButtonUI;
public class PilaYCola{
    public static void main(String [] args){
        PilaOperaciones pila = new PilaOperaciones(10);
        PilaOperaciones pila2 = new PilaOperaciones(10);
        ColaOperaciones cola = new ColaOperaciones(10);
        Scanner teclado = new Scanner(System.in);
        int capacidad;
        int numero=0;

        System.out.print("\n-Ingrese el numero total de elementos que tendra la pila: ");
        capacidad=teclado.nextInt();
        for(int i=0;i<capacidad;i++){
            System.out.print("("+(i+1)+")"+" Ingrese un numero: ");
            numero = teclado.nextInt();
           // pila.push(numero);
           cola.agregar(numero);

        }
        while(!cola.colaVacia()){
            numero=cola.eliminar();
        if(numero%2==0){
            pila.push(numero);
            //System.out.println(numero);    
            }
            else{
                pila2.push(numero);
              //  System.out.print("ww"+pila.pop());
            }
           
            }

            System.out.println("IMPARES:");
        while(!pila2.isEmpty()){
            System.out.println(pila2.pop());
        }
        System.out.println("\nPARES:");

        while(!pila.isEmpty()){
            System.out.println(pila.pop());
        }
        
    }
        
        
}

