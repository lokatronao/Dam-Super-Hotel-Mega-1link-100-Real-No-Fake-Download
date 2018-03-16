package Hotel;

import java.util.*;

/**
 * Clase encargada de guardar los empleados
 * @author lokatronao
 *
 */
public class ListaEmpleados {
	
	ArrayList<Empleado> arrayEmpleados = new ArrayList<Empleado>();
	/**
	 * Registra un empleado en caso de que su dni no este registrado aun
	 * @param introducido empleado a introducir
	 * @return insertado si se ha podido o no insertar
	 */
	protected  boolean insertarEmpleados (Empleado introducido) {
		boolean insertado = false;		
		
		if (arrayEmpleados.size() > 0) {
			
			Iterator<Empleado> iterador = arrayEmpleados.iterator();
				
			while (iterador.hasNext()) {
				
				Empleado Empleado = iterador.next();			
				
				if (!Empleado.getDni().equals(introducido.getDni())) {
					insertado = false;
				}	
				
			}
		} else {
			insertado = true;
		}
		if (insertado) {
			arrayEmpleados.add(introducido);
		}
			
		return insertado;		
	}
	/**
	 * Comprueba si la contraseña proporcionada para un dni es correcta
	 * @param contrasenia contraseña introducida
	 * @param dni dni introducido
	 * @return valida TRUE en caso de que sea valida FALSE en caso contrario
	 */
	protected boolean comprobarContrasenia (String contrasenia, String dni) {
		boolean valida = false;
		String bcontrasenia; 
		if (arrayEmpleados.size() > 0) {

			Iterator<Empleado> iterador = arrayEmpleados.iterator();

			while (iterador.hasNext()) {
				
				Empleado Empleado = iterador.next();

				if (Empleado.getDni().equals(dni)) {
					if(Empleado.getContrasenia().equals(contrasenia)) {
						valida = true;
					}
				}

			}
		}
		return valida;
	}

}
