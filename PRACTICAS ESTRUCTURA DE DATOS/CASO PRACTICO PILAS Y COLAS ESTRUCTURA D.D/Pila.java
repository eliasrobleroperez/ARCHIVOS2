import java.util.Scanner;

public class Pila{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        PilaOperaciones pila1 = new PilaOperaciones(10);
        PilaOperaciones pila2 =  new PilaOperaciones(10);
        PilaOperaciones pila3 = new PilaOperaciones(10);
        PilaOperaciones pila4 =  new PilaOperaciones(10);
        PilaOperaciones pila5 = new PilaOperaciones(10);
        PilaOperaciones pilauxiliar = new PilaOperaciones(10);
        ColaOperaciones cola = new ColaOperaciones(10);

        int numeroi=1;
        int numeroj=1;
        int numeroEliminado=1;
        int numeroEncontrado=1;
        String mensaje = "Elemento eliminado:";

        System.out.println("\n----INGRESE LOS 10 NUMEROS QUE CONTENDRA LA ESTRUCTURA COLA----");
        System.out.println("(Si el numero en i es menor a -5, o es mayor a 5, no se guardara el valor j en ninguna pila porque solamente hay 5 pilas.");
        System.out.println("(Si el numero en i es cero se detendra el proceso).");
        System.out.println("\nIngrese un numero");
        System.out.print("(i): ");
        numeroi = teclado.nextInt();
        if(numeroi!=0){
            cola.agregar(numeroi);
            System.out.println("Ingrese un numero");
            System.out.print("(j): ");
            numeroj = teclado.nextInt();
            cola.agregar(numeroj);
            System.out.println("Ingrese un numero");
            System.out.print("(i): ");
            numeroi = teclado.nextInt();
        }
        if(numeroi!=0){
            cola.agregar(numeroi);
            System.out.println("Ingrese un numero");
            System.out.print("(j): ");
            numeroj = teclado.nextInt();
            cola.agregar(numeroj);
            System.out.println("Ingrese un numero");
            System.out.print("(i): ");
            numeroi = teclado.nextInt();
        }
        if(numeroi!=0){
        cola.agregar(numeroi);
            System.out.println("Ingrese un numero");
            System.out.print("(j): ");
            numeroj = teclado.nextInt();
            cola.agregar(numeroj);
            System.out.println("Ingrese un numero");
            System.out.print("(i): ");
            numeroi = teclado.nextInt();
        }
        if(numeroi!=0){
        cola.agregar(numeroi);
            System.out.println("Ingrese un numero");
            System.out.print("(j): ");
            numeroj = teclado.nextInt();
            cola.agregar(numeroj);
            System.out.println("Ingrese un numero");
            System.out.print("(i): ");
            numeroi = teclado.nextInt();
        }
        if(numeroi!=0){
        cola.agregar(numeroi);
            System.out.println("Ingrese un numero");
            System.out.print("(j): ");
            numeroj = teclado.nextInt();
            cola.agregar(numeroj);
        }
        if(numeroi==0){
            System.out.println("Error fin del proceso, ya que i no puede ser cero.");
        }
        while(!cola.colaVacia()){
            for(int i=0; i<5;i++){
            numeroEliminado = cola.eliminar();
            switch(numeroEliminado){
                case 1: 
                if(numeroEliminado==1)
                pila1.push(cola.eliminar());
                break;
                case 2:
                if(numeroEliminado==2)
                pila2.push(cola.eliminar());
                break;
                case 3:
                if(numeroEliminado==3)
                pila3.push(cola.eliminar());
                break;
                case 4: 
                if(numeroEliminado==4)
                pila4.push(cola.eliminar());
                break;
                case 5:
                if(numeroEliminado==5)
                pila5.push(cola.eliminar());
                break;
                default:
                if(numeroEliminado>=6){
                    pilauxiliar.push(cola.eliminar());
                }
                if(numeroEliminado<=6){
                    pilauxiliar.push(cola.eliminar());
                }
                if(numeroEliminado==-1){
                        if(pila1.isEmpty()){
                            System.out.println("\nPila 1 no se eliminara nada");
                            System.out.println("Pila vacia.");
                        }
                        else{
                            for(int x=0; x<5;x++){
                                for(int j=0; j<5-1;j++){
                                    if(i!=j){
                                        if(numeroEliminado==numeroEliminado){
                                            numeroEncontrado = pila1.pop();
                                            pilauxiliar.push(numeroEncontrado);
    
                                        }
    
                                    }
                                }
                            }
                           
                        }
                }
                if(numeroEliminado==-2){
                    if(pila2.isEmpty()){
                        System.out.println("Pila 2 no se eliminara nada");
                        System.out.println("Pila vacia.");
                    }
                    else{
                        for(int x=0; x<5;x++){
                            for(int j=0; j<5-1;j++){
                                if(i!=j){
                                    if(numeroEliminado==numeroEliminado){
                                        numeroEncontrado = pila2.pop();
                                        pilauxiliar.push(numeroEncontrado);

                                    }

                                }
                            }
                        }
                    }
                }
                if(numeroEliminado==-3){
                    if(pila3.isEmpty()){
                        System.out.println("Pila 3 no se eliminara nada");
                        System.out.println("Pila vacia.");
                    }
                    else{
                        for(int x=0; x<5;x++){
                            for(int j=0; j<5-1;j++){
                                if(i!=j){
                                    if(numeroEliminado==numeroEliminado){
                                        numeroEncontrado = pila3.pop();
                                        pilauxiliar.push(numeroEncontrado);

                                    }

                                }
                            }
                        }
                    }
                }
                if(numeroEliminado==-4){
                    if(pila4.isEmpty()){
                        System.out.println("Pila 4 no se eliminara nada");
                        System.out.println("Pila vacia.");
                    }
                    else{
                        for(int x=0; x<5;x++){
                            for(int j=0; j<5-1;j++){
                                if(i!=j){
                                    if(numeroEliminado==numeroEliminado){
                                        numeroEncontrado = pila4.pop();
                                        pilauxiliar.push(numeroEncontrado);

                                    }

                                }
                            }
                        }
                        
                    }
                }
                if(numeroEliminado==-5){
                    if(pila5.isEmpty()){
                        System.out.println("Pila 5 no se eliminara nada");
                        System.out.println("Pila vacia.");
                    }
                    else{
                        for(int x=0; x<5;x++){
                            for(int j=0; j<5-1;j++){
                                if(i!=j){
                                    if(numeroEliminado==numeroEliminado){
                                        numeroEncontrado = pila5.pop();
                                        pilauxiliar.push(numeroEncontrado);

                                    }

                                }
                            }
                        }
                    }
                }
                break;
            }
        }
        }
        if(numeroi!=0){
        System.out.println("\n-Elementos de la pila 1: ");
        if(!pila1.isEmpty()){
        while(!pila1.isEmpty()){
            System.out.println(pila1.pop());
        }}
        else{
            System.out.println("Pila sin elementos.");
        }
        System.out.println("-Elementos de la pila 2: ");
        if(!pila2.isEmpty()){
        while(!pila2.isEmpty()){
            System.out.println(pila2.pop());
        }}
        else{
            System.out.println("Pila sin elementos.");
        }
        System.out.println("-Elementos de la pila 3: ");
        if(!pila3.isEmpty()){
        while(!pila3.isEmpty()){
            System.out.println(pila3.pop());
        }}
        else{
           System.out.println("Pila sin elementos."); 
        }
        System.out.println("-Elementos de la pila 4: ");
        if(!pila4.isEmpty()){
        while(!pila4.isEmpty()){
            System.out.println(pila4.pop());}
        }
        else{
            System.out.println("Pila sin elementos"); 
        }
        System.out.println("-Elementos de la pila 5: ");
        if(!pila5.isEmpty()){
        while(!pila5.isEmpty()){
            System.out.println(pila5.pop());
        }}
        else{
            System.out.println("Pila sin elementos.");
        }
    

    }

}}
    

    









    



