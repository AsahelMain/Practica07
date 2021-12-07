/**
 * Clase Oficial, representa un oficial. Hereda de la clase Operador
 * @author Asahel Main
 * @version 1.0
 */

public class Oficial extends Operador{

    /**
     * Constructor que recibe un nombre
     * @param El nombre del oficial
     */
    public Oficial(String nombre){
	super(nombre);
    }

    /**
     * Constructor sin parametros
     */
    public Oficial(){
	super();
    }

    /**
     * Metodo que devuelve el objeto en forma de cadena
     * @return s El objeto en forma de cadena
     */
    @Override
    public String toString(){
	String s = "Soy un oficial, me llamo " + this.nombre;
	return s;
    }

    /**
     * Metodo que devuelve el String "estoy trabajando"
     * @return r El string "estoy trabajando"
     */
    public String trabaja(){
	String r = "Estoy trabajando";
	return r;
    }
    
}
