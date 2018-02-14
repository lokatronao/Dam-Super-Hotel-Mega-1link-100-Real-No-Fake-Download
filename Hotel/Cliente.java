/**
 * 
 */
package Hotel;

/**
 * Clase cliente herencia de clase Persona
 * 
 * @author Miguel Angel
 * @author Dani
 * @author Jose Ignacio
 * 
 */
public class Cliente extends Persona {

	/**
	 * 
	 */
	public Cliente() {
		super();
	}

	/**
	 * @param nombre Nombre del cliente
	 * @param apellidos Apellidos del cliente
	 * @param dni DNI del cliente
	 * @param mail Correo electronico del cliente
	 * @param telefono Telefono de contacto del cliente
	 */

	public Cliente(String nombre, String apellidos, String dni, String mail, String telefono) {
		super(nombre, apellidos, dni, mail, telefono);
	}	
	
}
