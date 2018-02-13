package Hotel;

/**
 * Clase padre persona
 * 
 * @author Miguel Angel
 * @author Dani
 */
public class Persona {
	String nombre, apellidos, dni, direccion;
	
	/**
	 * @param nombre Nombre de la persona
	 * @param apellidos Apellidos de la persona
	 * @param dni DNI de la persona
	 * @param direccion Direccion de la persona
	 */
	protected Persona(String nombre, String apellidos, String dni, String direccion) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.direccion = direccion;
	}

	/**
	 * @param nombre Nombre de la persona
	 * @param apellidos Apellidos de la persona
	 * @param dni DNI de la persona
	 */
	protected Persona(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}

	/**
	 * 
	 */
	protected Persona() {
	}

	/**
	 * @return nombre
	 */
	protected String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre Agrega el nombre
	 */
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return apellidos
	 */
	protected String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos Agrega los apellidos
	 */
	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return dni
	 */
	protected String getDni() {
		return dni;
	}

	/**
	 * @param dni Agrega el DNI
	 */
	protected void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return direccion
	 */
	protected String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion Agrega la direccion 
	 */
	protected void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
}
