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

}


