package Hotel;

import java.util.*;


public class ListaEmpleados {
	
	ArrayList<Empleado> arrayEmpleados = new ArrayList<Empleado>();
	
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
	
	protected boolean comprobarContrasenia (String contrasenia, String dni) {
		boolean valida = false;
		String bcontrasenia; 
		if (arrayEmpleados.size() > 0) {

			Iterator<Empleado> iterador = arrayEmpleados.iterator();

			while (iterador.hasNext()) {

				Empleado Empleado = iterador.next();

				if (!Empleado.getDni().equals(dni)) {
					if(Empleado.getContrasenia().equals(contrasenia)) {
						valida = true;
					}
				}

			}
		}
		return valida;
	}

}
