public class PilaOperaciones{
    private int pila[];
    private int tope;

    public PilaOperaciones(int capacidad){
        pila = new int[capacidad];
        tope = -1;
    }
    //pila vacia
    public boolean isEmpty(){
        return tope== -1;
    }
    //Agregar a la pila
    public void push(int i){
         
        if(tope+1 <pila.length){
        pila[++tope] = i;
    }
    
}
    //Eliminar de la pila
    public int pop(){
        if(isEmpty())
          return 0;
        return 
        pila[tope--];
    }
    }

