/**
 * Clase Directivo, representa a  un directivo. Hereda de la clase Empleado
 * @author Asahel Main
 * @version 1.0
 */

public class Directivo extends Empleado{

    /**
     * Constructor que recibe un nombre
     * @param El nombre del directivo
     */
    public Directivo(String nombre){
	super(nombre);
    }

    /**
     * Constructor sin parametros
     */
    public Directivo(){
	super();
    }

    /**
     * Constructor que devuelve el objeto en forma de cadena
     * @return s El objeto en forma de cadena
     */
    @Override
    public String toString(){
	String s = "Soy un directivo, me llamo " + this.nombre;
	return s;
    }



}
