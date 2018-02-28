/**
 * 
 */

/* A empleado le falta una contraseña para loggear
Metela en el objeto y crea un objeto que almacene empleados */

package Hotel;

import java.util.ArrayList;

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
	String contrasenia;	

	/**
	 * @param nombre Nombre del empleado
	 * @param apellidos Apellidos del empleado
	 * @param dni DNI del empleado
	 * @param mail Correo electronico del empleado
	 * @param telefono Telefono de contacto del empleado
	 * @param puesto Puesto en el que esta el empleado
	 * 
	 */

	public Empleado(String nombre, String apellidos, String dni, String mail, String telefono, String puesto, String contrasenia) {
		super(nombre, apellidos, dni, mail, telefono);
		this.puesto = puesto;
		this.contrasenia = contrasenia;
	}

	/**
	 * 
	 */
	
	public Empleado() {
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
	
	/**
	 * @return contraseña
	 */
	protected String getContrasenia(String contrasenia) {
		return contrasenia;
	}
	
	/**
	 * @param contraseña Agrega la contraseña
	 */
	
	protected void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}	
	
}
