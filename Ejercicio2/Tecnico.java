/**
 * Clase Tecnico, representa un tecnico. Hereda de la clase Operador
 */

public class Tecnico extends Operador{

    /**
     * Constructor que recibe un nombre
     * @param el nombre del tecnico 
     */
    public Tecnico(String nombre){
	super(nombre);
    }

    /**
     * Constructor sin parametros
     */
    public Tecnico(){
	super();
    }

    /**
     * Metodo que devuelve el objeto en forma de cadena
     * @return s El objeto en forma de cadena
     */
    @Override
    public String toString(){

        String s = "Soy un tecnico, me llamo " + this.nombre;
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
