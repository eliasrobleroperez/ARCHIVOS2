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
       System.out.println("El numero mayor es: "+mayor);
       System.out.println("El numero menor es: "+menor);
    }
}