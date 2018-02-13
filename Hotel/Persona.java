package Hotel;

public class Persona {
	String nombre, apellidos, dni, direccion;
	
	/**
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param direccion
	 */
	protected Persona(String nombre, String apellidos, String dni, String direccion) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.direccion = direccion;
	}

	/**
	 * @param nombre
	 * @param apellidos
	 * @param dni
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
	 * @return the nombre
	 */
	protected String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	protected String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the dni
	 */
	protected String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	protected void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the direccion
	 */
	protected String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	protected void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
}
