public class Lista{
    private Nodo primero;

    public Lista(){
        primero = null;
    }
    public Lista insertarAlInicio(int entrada){
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.enlace = primero;
        primero = nuevo;
        return this;
    }
    public void visualizar(){
        Nodo n;
        n = primero;
        while(n!= null){
            System.out.println(n.dato + " ");
            n = n.enlace;
        }
    }
    public void encontrarNumeroMayorYMenor(){
       Nodo numero;
       numero = primero;
       int mayor = 0;
       int menor = 500;

       while(numero!=null){
           if(numero.dato > mayor){
               mayor = numero.dato;
           }
           if(numero.dato < menor){
               menor = numero.dato;
           }
           numero = numero.enlace;
       }
       System.out.println("El numero menor es: "+menor);
       System.out.println("El numero mayor es: "+mayor);
    }
    public Nodo buscarDato(int destino){
        Nodo indice;
        int bandera=0;
        for(indice = primero; indice!=null; indice = indice.enlace){
            if(destino == indice.dato){
                return indice;
            }
            else{
                bandera=2;
            }
    }
    if(bandera==2){
        System.out.println("Numero no existe.");
    }
        return null;
            
    }
    public Nodo buscarPosicion(int posicion){
    Nodo indice;
    int i;
    int elemento;
    if (posicion < 0 )
        return null;
    indice = primero;
    for (i = 1 ;(i < posicion) && (indice != null); i++)
        indice = indice.enlace;
        elemento = indice.dato;
        System.out.println("Numero: "+elemento);
    
    return indice;
}
}