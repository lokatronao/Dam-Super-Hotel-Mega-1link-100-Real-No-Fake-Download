package Hotel;

import java.util.ArrayList;
import java.util.Iterator;

import Validadores.ValidadorDNI;
import Validadores.ValidadorEMAIL;
/**
 * Clase encargada guardar las habitaciones
 * 
 * @author Miguel Angel
 * @author Dani
 * @author Jose Ignacio
 * 
 */
public class ListaHabitaciones {
	ArrayList<Habitacion> listaHabitaciones = new ArrayList<Habitacion>();

	/**
	 * 
	 */
	public ListaHabitaciones() {
	}

	/**
	 * Metodo encargado de comprobar habitaciones no registradas con el mismo numero de habitacion e
	 * y en caso de no estar registrados los registra
	 * 
	 * @param Habitacion habitacion a insertar
	 *           
	 * @return insertado booleano devuelve TRUE en caso de que se haya introducido
	 *         la habitacion FALSE en caso de que no se haya introducido
	 *
	 */
	protected boolean insertarHabitacion(Habitacion Habitacion) {
		boolean insertado = false;

		if (listaHabitaciones.size() > 0) {
			if (!comprobarHabitacion(Habitacion.getNumero())) {
				listaHabitaciones.add(Habitacion);
				insertado = true;
			}
		}else {
			listaHabitaciones.add(Habitacion);
			insertado = true;
		}
		return insertado;
	}
	/**
	 * Clase encargada de mostrar las habitaciones
	 * @return hay en caso de que no haya habitaciones devolverá un false
	 */
	protected boolean verHabitaciones() {
		boolean hay = true;
		if (listaHabitaciones.size() > 0) {
			Iterator<Habitacion> Iterator = listaHabitaciones.iterator();
			while (Iterator.hasNext()) {
				Habitacion habitacion = Iterator.next();
				System.out.println("");
				System.out.println("Habitación numero: "+habitacion.getNumero());
				System.out.println("Personas Max: "+habitacion.getPersonas());
				System.out.println("Precio: "+habitacion.getPrecio());
				if(habitacion.isCerrado()) {
					System.out.println("Cerrado");
				}else{
					System.out.println("Cerrado");
				}
			}
		}else {
			hay = false;
		}
		return hay;
	}
	/**
	 * Clase encargada de encontrar una habitacion adecuada para un numero de personas
	 * @param personas numero de personas para la reserva
	 * @return encontrados array de habitaciones con las habitaciones seleccionadas
	 */
	protected Habitacion[] encontrarHabitacion(int personas) {
		int i = 0;
		Habitacion encontrados[] = new Habitacion[listaHabitaciones.size()];
		if (listaHabitaciones.size() > 0) {
			Iterator<Habitacion> Iterator = listaHabitaciones.iterator();
			while (Iterator.hasNext()) {
				Habitacion habitacion = Iterator.next();
				if(Integer.parseInt(habitacion.getPersonas())>=personas) {
					encontrados[i]=habitacion;
					i++;
				}
			}
		}
		return encontrados;
	}
	/**
	 * Clase encargada de comprobar si una habitacion existe
	 * @param numero numero de la habitacion
	 * @return encontrado TRUE en caso de que se encuentre ese numero de habitacion False en caso de que no se encuentre ese numero de habitacion
	 */
	protected boolean comprobarHabitacion(String numero) {
		boolean encontrado = false;
		if (listaHabitaciones.size() > 0) {
			Iterator<Habitacion> Iterator = listaHabitaciones.iterator();
			while (Iterator.hasNext() && !encontrado) {
				Habitacion Habitacion = Iterator.next();
				if (numero.equals(Habitacion.getNumero())) {
					encontrado = true;
				}
			}
		}
		return encontrado;
	}
	/**
	 * Calcula el precio de una reserva teniendo en cuenta el numero de la habitacion y el numero de noches
	 * @param numero numero de la habitacion
	 * @param noches noches a calcular
	 * @return precio precio total de esa estancia
	 */
	protected int comprobarprecio(String numero,int noches) {
		int precio = 0;
		if (listaHabitaciones.size() > 0) {
			Iterator<Habitacion> Iterator = listaHabitaciones.iterator();
			while (Iterator.hasNext()) {
				Habitacion Habitacion = Iterator.next();
				if (numero.equals(Habitacion.getNumero())) {
					precio = Integer.parseInt(Habitacion.getPrecio());
				}
			}
		}
		precio = precio * noches;
		return precio;
	}
}
