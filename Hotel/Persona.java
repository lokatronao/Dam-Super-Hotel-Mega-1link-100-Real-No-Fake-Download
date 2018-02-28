package Hotel;

/**
 * Clase padre persona
 * 
 * @author Miguel Angel
 * @author Dani
 * @author Jose Ignacio
 * 
 */
public abstract class Persona  {
	String nombre, apellidos, dni, mail, telefono;
	
	/**
	 * @param nombre Nombre de la persona
	 * @param apellidos Apellidos de la persona
	 * @param dni DNI de la persona
	 * @param mail Correo electronico de la persona
	 * @param telefono Telefono de contacto de la persona
	 */

	public Persona(String nombre, String apellidos, String dni, String mail, String telefono) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.mail = mail;
		this.telefono = telefono;
	}

	/**
	 * 
	 */
	
	public Persona() {
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
	 * @return mail
	 */

	protected String getMail() {
		return mail;
	}
	
	/**
	 * @param mail Agrega el correo electronico
	 */

	protected void setMail(String mail) {
		this.mail = mail;
	}
	
	/**
	 * @return telefono
	 */

	protected String getTelefono() {
		return telefono;
	}
	
	/**
	 * @param telefono Agrega el telefono
	 */

	protected void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
}
