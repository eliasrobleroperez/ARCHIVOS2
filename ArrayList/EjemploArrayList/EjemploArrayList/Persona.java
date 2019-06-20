public class Persona {
    private int edad;
    private int peso;
    
    
    public Persona(){
       
    }
    public String resultado(){
        return (edad+" | "+peso);
    }
    public int getEdad(){
	return edad;
    }
    public void setEdad(int edad){
	this.edad = edad;
    }
    public int getPeso(){
	return peso;
    }
    public void setPeso(int peso){
	this.peso = peso;
    }	
}
