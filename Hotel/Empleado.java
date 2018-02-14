/**
 * 
 */
package Hotel;

/**
 * Clase empleado herencia de clase Persona 
 * 
 * @author Miguel Angel
 * @author Dani
 * @author Jose Ignacio
 *
 */
public class Empleado extends Persona {
	String puesto;

	/**
	 * @param nombre Nombre del empleado
	 * @param apellidos Apellidos del empleado
	 * @param dni DNI del empleado
	 * @param mail Correo electronico del empleado
	 * @param telefono Telefono de contacto del empleado
	 * @param puesto Puesto en el que esta el empleado
	 * 
	 */

	public Empleado(String nombre, String apellidos, String dni, String mail, String telefono, String puesto) {
		super(nombre, apellidos, dni, mail, telefono);
		this.puesto = puesto;
	}

	/**
	 * 
	 */
	
	protected Empleado() {
	}

	/**
	 * @return puesto
	 */
	
	protected String getPuesto() {
		return puesto;
	}

	/**
	 * @param puesto Agrega el puesto
	 */
	
	protected void setPuesto(String puesto) {
		this.puesto = puesto;
	}	
	
}
