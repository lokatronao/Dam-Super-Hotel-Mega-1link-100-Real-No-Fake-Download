package Hotel;
/**
 * Clase habitacion
 * 
 * @author Miguel Angel
 * @author Dani
 * @author Jose Ignacio
 *
 */
public class Habitacion {
	String precio, personas;
	boolean cerrado;
	/**
	 * @param precio Precio de la habitacion
	 * @param personas Personas maximos en la habitacion
	 * @param cerrado El apartamento 
	 */
	protected Habitacion(String precio, String personas, boolean cerrado) {
		this.precio = precio;
		this.personas = personas;
		this.cerrado = cerrado;
	}
	/**
	 * Constructor que pondra automaticamente el cerrado en false
	 * 
	 * @param precio Precio de la habitacion
	 * @param personas Personas maximos en la habitacion
	 */
	protected Habitacion(String precio, String personas) {
		this.precio = precio;
		this.personas = personas;
		cerrado = false;
	}
	/**
	 * 
	 */
	protected Habitacion() {
	}
	/**
	 * @return precio
	 */
	protected String getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	protected void setPrecio(String precio) {
		this.precio = precio;
	}
	/**
	 * @return the personas
	 */
	protected String getPersonas() {
		return personas;
	}
	/**
	 * @param personas agrega las personas
	 */
	protected void setPersonas(String personas) {
		this.personas = personas;
	}
	/**
	 * @return cerrado
	 */
	protected boolean isCerrado() {
		return cerrado;
	}
	/**
	 * @param cerrado Agrega el cerrado
	 */
	protected void setCerrado(boolean cerrado) {
		this.cerrado = cerrado;
	}
	/**
	 * 
	 * Cambia el estado del apartamento de abierto a cerrado y viceversa
	 * 
	 */
	protected void cambiarEstado(){
		if(cerrado) {
			cerrado = false;
		}else {
			cerrado = true;
		}
	}
	
	
}
