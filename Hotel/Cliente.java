/**
 * 
 */
package Hotel;

/**
 * Clase cliente herencia de clase Persona
 * 
 * @author Miguel Angel
 * @author Dani
 * 
 */
public class Cliente extends Persona {

	/**
	 * 
	 */
	protected Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre Nombre de la persona
	 * @param apellidos Apellidos de la persona
	 * @param dni DNI de la persona
	 * @param direccion Direccion de la persona
	 */
	protected Cliente(String nombre, String apellidos, String dni, String direccion) {
		super(nombre, apellidos, dni, direccion);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor Cliente
	 * 
	 * @param nombre Nombre de la persona
	 * @param apellidos Apellidos de la persona
	 * @param dni DNI de la persona
	 */
	protected Cliente(String nombre, String apellidos, String dni) {
		super(nombre, apellidos, dni);
		// TODO Auto-generated constructor stub
	}
	
	

}
