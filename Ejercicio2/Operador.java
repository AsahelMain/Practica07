/**
 * Clase Operador, representa a un operador, hereda de la clase Empleado
 * @author Asahel Main
 * @version 1.0
 */
public class Operador extends Empleado{

    /**
     * Constructor que recibe un nombre
     * @param El nombre del operador
     */
    public Operador(String nombre){
	super(nombre);
    }

    /**
     * Constructor sin parametros
     */
    public Operador(){
	super();
    }


    /**
     * Metodo que devuelve el objeto en forma de cadena
     * @return s El objeto en forma de cadena 
     */
    @Override
    public String toString(){
	String s = "Soy un operador, me llamo " + this.nombre;
	return s;
    }
}
