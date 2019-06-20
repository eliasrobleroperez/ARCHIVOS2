public class ColaOperaciones{
    private int cola[];
    private int frente, fin;

    public ColaOperaciones(int capacidad){
        cola = new int[capacidad];
        frente = -1;
        fin = -1;
    }
    //cola vacia

    public boolean colaVacia(){
        return frente == fin;
    }
    /*public boolean colaLlena(){
        return fin == cola.length-1;
    }*/
    public void agregar(int dato){
        if(fin < cola.length-1)
        cola[++fin] = dato;
    }
    //Eliminar de la cola
    public int eliminar(){
        if(colaVacia())
            return 0;
        return cola[++frente];
    }
    //Mostrar primer elemento
    public int mostrarFrente(){
        if(colaVacia())
            return 0;
        return cola[frente+1];
    }

}