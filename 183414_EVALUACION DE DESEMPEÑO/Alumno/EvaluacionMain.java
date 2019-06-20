 import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class EvaluacionMain{
    static ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>(); 
    static Alumno datosAlumnos;

    public static void main(String[] args) throws IOException{
        Scanner teclado = new Scanner(System.in);
        int tamanio = listaAlumnos.size();
        int respuesta;
        System.out.println("Ingrese la cantidad de matriculas que tiene el archivo de texto: ");
        System.out.print("Cantidad: ");
        int cantidadM = teclado.nextInt();
        do{
        System.out.println("\nSeleccione la opcion que desea realizar: ");
        System.out.println("1.-Ver elementos originales del archivo de texto y ver esos elementos ordenados");
        System.out.println("2.- Buscar matricula");
        System.out.print("Opcion: ");
        int opcion = teclado.nextInt();
        leerArchivo(cantidadM,"matriculas.txt");
        switch(opcion){
            case 1: 
            ordIntercambio(listaAlumnos);
            break;
            case 2: 
            System.out.println("\n-Ingrese la matricula que desea buscar");
            System.out.print("-Matricula a buscar: ");
            int buscar = teclado.nextInt();
            busquedaSecuencial(tamanio,buscar,listaAlumnos);
            break;
            default: System.out.println("Opcion no valida");
        }
        System.out.println("\nSi desea realizar una operacion mas seleccione 1, sino seleccione un numero diferente a 1: ");
        System.out.print("Respuesta: ");
        respuesta = teclado.nextInt();
    }while(respuesta==1);
    }
    

public static void leerArchivo(int cantidadM,String nombreArchivo) throws FileNotFoundException, IOException {
    String texto;
    FileReader archivo = new FileReader(nombreArchivo);//Busca el archivo
    BufferedReader contenedor = new BufferedReader(archivo);//Almacenar el contenido del archivo

        while((texto = contenedor.readLine())!=null){//Leer linea por linea
            crearAlumnos(cantidadM,texto);
        }
        contenedor.close();
    }
    public static void crearAlumnos(int cantidadM,String texto){
        int tamanioMax=cantidadM;
        String informacion= texto;
        String[] partes = informacion.split(" ");

        String parte1= partes[0];
        String parte2= partes[1];
    
        int matricula = Integer.parseInt(parte1);
        String nombre = parte2;

        datosAlumnos = new Alumno();
        datosAlumnos.setNombre(nombre);
        datosAlumnos.setMatricula(matricula);

        listaAlumnos.add(datosAlumnos); 

        if(listaAlumnos.size()==cantidadM){
        System.out.println("\nELEMENTOS EN EL ORDEN ORIGINAL DEL ARCHIVO DE TEXTO: ");
        mostrarTodo();
        ordIntercambio(listaAlumnos);
        System.out.println("\nELEMENTOS ORDENADOS DE MENOR A MAYOR POR MATRICULAS: ");
        System.out.println("");
        mostrarTodo();
        }
        else{    
        }

    }
    public static void mostrarTodo(){
        System.out.println("\t   Matricula | Nombre");
        for (int i = 0; i < listaAlumnos.size(); i++) {//Metodo size()->Retorna el numero de elementos en el ArrayList
        //Metodo get()->Retorna un elemento especifico, a traves de una posicion (i)
            System.out.println("Registro "+(i+1)+"    "+listaAlumnos.get(i).resultado());
        }
    }
    public static void intercambiar(ArrayList<Alumno> listaAlumnos, int i, int j){
        Alumno aux = listaAlumnos.get(i);
        listaAlumnos.set(i,listaAlumnos.get(j));
        listaAlumnos.set(j,aux);

    }
    
    public static void ordIntercambio(ArrayList<Alumno> listaAlumnos){
        int i, j;
        for (i = 0 ; i < listaAlumnos.size(); i++)
        // sitúa mínimo de a[i+1]...a[n-1] en a[i]
        for (j = i+1 ; j < listaAlumnos.size(); j++)
        if (listaAlumnos.get(i).getMatricula() > listaAlumnos.get(j).getMatricula())
        {
        intercambiar(listaAlumnos, i, j);
        }
        
    }
    public static void busquedaSecuencial(int tamanio,int valorBuscado,ArrayList<Alumno> listaAlumnos){
        int i=0;
        int max = listaAlumnos.size();
    while(i<max && valorBuscado!= listaAlumnos.get(i).getMatricula()){
        i++;
    }
        if(i!=max){
            System.out.println("\nSe encontro en la posicion: "+(i+1));
            System.out.println("Pertenece al alumno: "+listaAlumnos.get(i).getNombre());
        }
        else
            System.out.println("\nLa matricula no existe");
        
    }
    
    
}