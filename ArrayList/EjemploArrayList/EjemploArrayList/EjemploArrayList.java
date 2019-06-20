import java.util.*;

public class EjemploArrayList {
    //se crea un ArrayList para objetos tipo persona
    static ArrayList<Persona> listaPersonas = new ArrayList<Persona>(); 
    static Persona registro;
    
    public static void main(String[] args) {
           registroDatos();
    }
    
    public static void registroDatos(){
        int edad, peso,i, numero;
        
        Scanner sc=new Scanner(System.in);
        
        do {
            System.out.print("N�mero de registros: ");
            numero = sc.nextInt();
        } while (numero < 0);
        
        sc.nextLine(); 
        
        //ingreso de datos por cada persona
        for (i = 1; i <= numero; i++) {      
            System.out.println("Persona " + i);
            System.out.print("Edad: ");
            edad = sc.nextInt();          
            System.out.print("Peso: ");
            peso = sc.nextInt();
            
            sc.nextLine();                        
            
            //se asignan valores a los atributos del nuevo objeto
            registro=new Persona();
            registro.setPeso(peso);
            registro.setEdad(edad);

           //M�todo add()->A�ade el objeto como un elemento al ArrayList
            listaPersonas.add(registro);              
        }
        mostrarTodo();
        
    } 
    public static void mostrarTodo(){
        System.out.println("\t   Edades|Peso");
        for (int i = 0; i < listaPersonas.size(); i++) {//Metodo size()->Retorna el numero de elementos en el ArrayList
        //Metodo get()->Retorna un elemento especifico, a traves de una posicion (i)
            System.out.println("Registro "+(i+1)+"    "+listaPersonas.get(i).resultado());
        }
    }   
}
