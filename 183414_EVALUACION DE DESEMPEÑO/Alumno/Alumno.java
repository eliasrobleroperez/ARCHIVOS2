public class Alumno{
    private String nombre;
    private int matricula;

    public Alumno(){
       
    }
    public String resultado(){
        return (matricula+" | "+nombre);
    }
    public String getNombre(){
	return nombre;
    }
    public void setNombre(String nombre){
	this.nombre = nombre;
    }
    public int getMatricula(){
	return matricula;
    }
    public void setMatricula(int matricula){
	this.matricula = matricula;
    }	
    
}