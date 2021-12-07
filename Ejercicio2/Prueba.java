/**
 * Clase Prueba, en donde se crean objetos de la clase Empleado,
 * Operador, Directivo, Oficial y Tecnico
 * @author Asahel Main
 */

public class Prueba{
    /**
     * Metodo principal
     * @param args Los argumentos
     */
    public static void main(String[] args){
	Empleado empleado1 = new Empleado("Jorge");
	
	Operador operador1 = new Operador("Sergio");

	Directivo directivo1 = new Directivo();

	Oficial oficial1 = new Oficial("Jose");

	Tecnico tecnico1 = new Tecnico("Sandra");

	System.out.println(empleado1);
	System.out.println(operador1);
	System.out.println(directivo1);
	System.out.println(oficial1);
	System.out.println(tecnico1);
   
    }
}
