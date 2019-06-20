public class ColaMain{
    public static void main(String [] args){
        ColaOperaciones cola = new ColaOperaciones(5);
        System.out.println("Cola vacia?: "+cola.colaVacia());
        cola.agregar(12);
        cola.agregar(3);
        cola.agregar(8);
        System.out.println("Cola vacia?: "+cola.colaVacia());
        System.out.println("Elemento eliminado: "+cola.eliminar());
        System.out.println("Elemento eliminado: "+cola.eliminar());
        System.out.println("Cola vacia?: "+cola.colaVacia());
        System.out.println("Primer elemento: "+cola.mostrarFrente());

    }
    
}