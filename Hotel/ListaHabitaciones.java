package Hotel;

import java.util.ArrayList;
import java.util.Iterator;

import Validadores.ValidadorDNI;
import Validadores.ValidadorEMAIL;
/**
 * Clase encargada guardar las reservas 
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
	 * Metodo encargado de comprobar clientes no registrados con el mismo DNI e
	 * EMAIL y en caso de no estar registrados los registra
	 * 
	 * @param clienteInsertado
	 *            Cliente que se pretende guardar
	 * @return insertado booleano devuelve TRUE en caso de que se haya introducido
	 *         el cliente FALSE en caso de que no se haya introducido
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
