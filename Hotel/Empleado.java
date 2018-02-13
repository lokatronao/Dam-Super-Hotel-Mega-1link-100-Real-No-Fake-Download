/**
 * 
 */
package Hotel;

/**
 * Clase empleado herencia de clase Persona 
 * 
 * @author lokatronao
 *
 */
public class Empleado extends Persona {
	String puesto;

	/**
	 * @param nombre Nombre del empleado
	 * @param apellidos Apellidos del empleado
	 * @param dni DNI del empleado
	 * @param direccion Direccion del empleado
	 * @param puesto Puesto en el que esta el empleado
	 */
	protected Empleado(String nombre, String apellidos, String dni, String direccion, String puesto) {
		super(nombre, apellidos, dni, direccion);
		this.puesto = puesto;
	}

	/**
	 * @param nombre Nombre del empleado
	 * @param apellidos Apellidos del empleado
	 * @param dni DNI del empleado
	 * @param puesto Puesto en el que esta el empleado
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
