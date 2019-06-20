public class OperacionesEstadisticas{

    MetodosEstadisticos busqueda = new MetodosEstadisticos();
    
    public void media(float numeros[]){
        float contador = 0;
        float media =0;

        for(int i=0;i<numeros.length;i++){
            contador+=numeros[i];

        }
        media = contador/numeros.length;
        System.out.println("\nLa media es: "+media);

    }
    public void mediana(float numeros[], int tamanio){
        
        float  mediana;
        if(tamanio % 2 == 0){
            float sumaMedios = numeros[tamanio/2] + numeros[tamanio/2 - 1]; 
            mediana = (float)sumaMedios / 2; 
        } else {
            mediana = numeros[tamanio/2];
        }
    
        System.out.println("\nLa mediana es : "+mediana);
      }
    
    public void operacionModa(float numeros[], int primerNumero,int ultimoNumero){
        int i;
        float repeticiones=0;
        float repeticionesMax=0;
        float moda=0;
        float valorTotal=0;
        float valor =0;

        for(i=0;i<numeros.length/2;i++){
            busqueda.busquedaBinaria(numeros,primerNumero);
            moda = numeros[primerNumero];
            repeticionesMax = moda(numeros,numeros[primerNumero],primerNumero,ultimoNumero);

            for(i=primerNumero+1;i<=ultimoNumero;i++){
                repeticiones = moda(numeros,numeros[i],i,ultimoNumero);
                if(repeticiones>repeticionesMax){
                    repeticionesMax = repeticiones;
                    moda = numeros[i];
                    valor = numeros[i];
                    valorTotal = repeticionesMax;
                }
            }


        }
        if(repeticionesMax ==1){
            System.out.println("\nNo hay moda");
        }
        else{
            System.out.println("\nLa moda es: "+moda);
        }

    }
    public float moda(float numeros[],float numeroEspecifico, int primerNumero,int ultimoNumero){
        int i;
        float contador;
        
        if(primerNumero>ultimoNumero) return 0;
        contador=0;
        for(i=primerNumero;i<=ultimoNumero;i++)
            if(numeros[i]==numeroEspecifico)
                contador++;
        return contador;
    }

}
    

    
