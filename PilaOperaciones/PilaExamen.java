import java.util.Scanner;
public class PilaExamen{
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    PilaOperaciones pila1 = new PilaOperaciones(12);
    PilaOperaciones pila2 = new PilaOperaciones(12);
    PilaOperaciones pila3 = new PilaOperaciones(12);
    ColaOperaciones cola = new ColaOperaciones(4);

    int capacidad1=0;
    int capacidad2=0;
    int capacidad3=0;
    int numero;
    int millares=0;
    int centenas=0;
    int decenas=0;
    int unidades=0;
    int division=0;
    int residuo=0;

    System.out.println("\nIngrese la cantidad de numeros que tendra su primer pila :");
    System.out.print("Capacidad: ");
    capacidad1 = teclado.nextInt();

    System.out.println("-----A continuacion ingrese los digitos de derecha a izquierda de la primer pila----");
    for(int i=0; i<capacidad1;i++){
        System.out.print(" Ingrese un numero: ");
        numero = teclado.nextInt();
        pila1.push(numero);
    }

    System.out.println("\nIngrese la cantidad de numeros que tendra su segunda pila :");
    System.out.print("Capacidad: ");
    capacidad2 = teclado.nextInt();

    System.out.println("-----A continuacion ingrese los digitos de derecha a izquierda de la segunda pila----");
    for(int i=0; i<capacidad2;i++){
        System.out.print(" Ingrese un numero: ");
        numero = teclado.nextInt();
        pila2.push(numero);
    }

    System.out.println("\nIngrese la cantidad de numeros que tendra su tercer pila :");
    System.out.print("Capacidad: ");
    capacidad3 = teclado.nextInt();

    System.out.println("-----A continuacion ingrese los digitos de derecha a izquierda de la tercer pila----");
    for(int i=0; i<capacidad3;i++){
        System.out.print(" Ingrese un numero: ");
        numero = teclado.nextInt();
        pila3.push(numero);
    }
     
    millares = pila1.pop()+pila2.pop()+pila3.pop();
    if(millares>9){
        division = millares/10;
        residuo = millares%10;
        millares = residuo;
        cola.agregar(residuo);
    }
    else{
        cola.agregar(millares);
    }
    centenas = pila1.pop()+pila2.pop()+pila3.pop()+division;
    if(centenas>9){
        division = centenas/10;
        residuo = centenas%10;
        centenas = residuo;
        cola.agregar(residuo);
    }
    else{
        cola.agregar(centenas);
    }
    decenas = pila1.pop()+pila2.pop()+pila3.pop()+division;
    if(decenas>9){
        division = decenas/10;
        residuo = decenas%10;
        decenas = residuo;
        cola.agregar(residuo);
    }
    else{
        cola.agregar(decenas);
    }
    unidades = pila1.pop()+pila2.pop()+pila3.pop()+division;
    if(unidades>9){
        division = unidades/10;
        residuo = unidades%10;
        unidades = residuo;
        cola.agregar(residuo);
    }
    else{
        cola.agregar(unidades);
    }


    System.out.print("\nMILLARES: ");
    System.out.println(cola.eliminar());
    System.out.print("CENTENAS: ");
    System.out.println(cola.eliminar());
    System.out.print("DECENAS: ");
    System.out.println(cola.eliminar());
    System.out.print("UNIDADES: ");
    System.out.println(cola.eliminar());









}
}