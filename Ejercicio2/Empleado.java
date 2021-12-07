/**
 * Clase Empleado, representa a un empleado
 * @author Asahel Main
 * @version 1.0
 */
public class Empleado{

    //Nombre del empleado
    protected String nombre;

    /**
     * Constructor que recibe un nombre como parametro
     * @param El nombre del empleado
     */
    public Empleado(String nombre){
	this.nombre = nombre;
    }

    /**
     * Constructor sin parametros
     * se le asigna una valor en específico al nombre
     */
    public Empleado(){
	this.nombre = "Estela";
    }

    /**
     * Metodo que cambia el nombre del empleado
     * @param nombre El nuevo nombre del empleado
     */
    public void setNombre(String nombre){
	this.nombre = nombre;
    }

    /**
     * Metodo que devuelve el nombre del empleado
     * @return nombre
     */
    public String getNombre(){
	return this.nombre;
    }

    /**
     * Metodo que devuelve el objeto en forma de una cadena
     * String s El objeto en forma de cadena
     */
    public String toString(){
	String s;
	s = "Soy un empleado, me llamo  " + this.nombre;
	return s;
    }

    /**
     * Metodo que recibe un objeto
     * devuelve true si el objeto que se recibe 
     * tiene el mismo valor en el atributo nombre
     * que el objeto que llama al metodo
     * @param p El objeto con el que se compara
     * @return r true o false     
     */
    public boolean equals(Object p){
	Empleado q = (Empleado)p;
	boolean r;
	r = this.nombre.equals(q.nombre);
	return r;
    }
}
