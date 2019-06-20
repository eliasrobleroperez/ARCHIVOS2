import java.io.*;
public class ClaseMain{
    public static void main(String[] args) throws IOException{
        leerArchivo("prueba.txt");
        realizarComparacion("prueba.txt");
    }
                                            //Excepcion que se ejecuta cuando no se encuentra el archivo
        public static void leerArchivo(String nombreArchivo) throws FileNotFoundException, IOException {
        String texto;
        FileReader archivo = new FileReader(nombreArchivo);//Busca el archivo
        BufferedReader contenedor = new BufferedReader(archivo);//Almacenar el contenido del archivo
            while((texto = contenedor.readLine())!=null){//Leer linea por linea
                System.out.print("\n-La ecuacion es: ");
                    System.out.println(texto);//Imprimir linea
            }
            contenedor.close();
        }
        public static void realizarComparacion(String nombreArchivo) throws FileNotFoundException, IOException{

        String archivoEcuacion;
        FileReader archivoNuevo = new FileReader(nombreArchivo);
        BufferedReader contenedor2 = new BufferedReader(archivoNuevo);
        archivoEcuacion = contenedor2.readLine();

        String numeros1 = archivoEcuacion;
        char[] digitosEcuacion = numeros1.toCharArray();
        String n=" ";

        for(int i=0;i<digitosEcuacion.length;i++){
            if(Character.isDigit(digitosEcuacion[i])){
            n =n+digitosEcuacion[i];
            }
            else{
                if(digitosEcuacion[0]=='x'){
                    digitosEcuacion[i]=1;
                }
            }
        }
        System.out.println("\n-Los numeros que tiene la ecuacion correspondientes a los coeficientes y exponentes son:"+n);

        String digitos = n;
        PilaOperaciones pila = new PilaOperaciones(100);
        Lista lista = new Lista();

        char[] cadenaSeparada = digitos.toCharArray();//Convierte la cadena en arreglo de tipo char
        int[] numeros = new int[cadenaSeparada.length];//Crea un arreglo de enteros con la misma longitud

        for (int i = 1; i < cadenaSeparada.length; i++) {
             numeros[i] = Character.getNumericValue(cadenaSeparada[i]);//Convierte el char en int
            pila.push(numeros[i]);
        }
        System.out.println("\nA continuacion se muestran los numeros que contiene la lista: ");
        while(!pila.isEmpty()){
            lista.insertarAlInicio(pila.pop());
        }
        lista.visualizar();
        contenedor2.close();
}
}
