/**
 * 
 */
package Hotel;

/**
 * @author lokatronao
 *
 */
public class Empleado extends Persona {
	String puesto;

	/**
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param direccion
	 * @param puesto
	 */
	protected Empleado(String nombre, String apellidos, String dni, String direccion, String puesto) {
		super(nombre, apellidos, dni, direccion);
		this.puesto = puesto;
	}

	/**
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param puesto
	 */
	protected Empleado(String nombre, String apellidos, String dni, String puesto) {
		super(nombre, apellidos, dni);
		this.puesto = puesto;
	}

	/**
	 * 
	 */
	protected Empleado() {
	}

	/**
	 * @return the puesto
	 */
	protected String getPuesto() {
		return puesto;
	}

	/**
	 * @param puesto the puesto to set
	 */
	protected void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	
}
