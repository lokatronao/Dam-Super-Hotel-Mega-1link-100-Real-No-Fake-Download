package Validadores;

/**
 * Clase ValidadorEMAIL encargada de verificar que los EMAIL sigan una
 * estructura
 * 
 * @author Migel Angel
 * @author Dani
 * @author Jose Ignacio
 *
 */
public class ValidadorEMAIL {

	/**
	 * 
	 */
	public ValidadorEMAIL() {

	}
	/**
	 * Comprueba que el EMAIL proporcionado sea correcto
	 * @param email Se espera que el email sea de tipo texto@nombredominio.dominio
	 * @return correcto booleano TRUE en caso de que el email este bien FALSE en caso de que el email sea incorrecto
	 */
	public boolean validar(String email) {
		boolean correcto = true;
		//Parte el email en dos partes separadas por la @
		String[] partes = email.split("@");
		if(partes.length != 2) {
			correcto = false;
		}
		String[] dominio = partes[1].split("\\.");
		if(dominio.length != 2) {
			correcto = false;
		}
		return correcto;
	}

}
