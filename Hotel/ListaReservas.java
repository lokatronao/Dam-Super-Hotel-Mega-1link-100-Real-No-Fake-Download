package Hotel;

import java.util.ArrayList;
import java.util.Iterator;

import Validadores.ValidadorDNI;
import Validadores.ValidadorEMAIL;

/**
 * Clase encargada guardar las reservas s
 * 
 * @author Miguel Angel
 * @author Dani
 * @author Jose Ignacio
 * 
 */
public class ListaReservas {
	ArrayList<Reserva> listaReservas = new ArrayList<Reserva>();

	/**
	 * 
	 */
	public ListaReservas() {
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
	protected boolean insertarReserva(Reserva reservaInsertado, Habitacion[] habitacion) {
		boolean insertado = false;
		if(habitacion.length!=0) {
			if (listaReservas.size() > 0) {
				for(int i = 0;i<habitacion.length;i++) {
					Iterator<Reserva> Iterator = listaReservas.iterator();
					boolean valid = true;
					while (Iterator.hasNext()&&valid) {
						boolean valid2 = true;
						Reserva reserva = Iterator.next();
						String numero = habitacion[i].getNumero();
						if(numero.equals(reserva.getHabitacion())) {
							if(!reserva.isCheckin()) {
								valid2 = false;
							}else if(reserva.isCheckin()&&!reserva.isCheckout()) {
								valid2 = false;
							}
							if(valid && !valid2) {
								valid = false;
							}
						}
					}
					if(valid) {
						reservaInsertado.setHabitacion(habitacion[i].getNumero());
						listaReservas.add(reservaInsertado);
						insertado = true;
						break;
					}
				}
			}else {
				reservaInsertado.setHabitacion(habitacion[0].getNumero());
				listaReservas.add(reservaInsertado);
				insertado = true;
			}
		}
		return insertado;
			
	}
	protected boolean verReservas() {
		boolean hay = true;
		if (listaReservas.size() > 0) {
			Iterator<Reserva> Iterator = listaReservas.iterator();
			while (Iterator.hasNext()) {
				Reserva reserva = Iterator.next();
				System.out.println("Numero reserva: "+reserva.getReserva());
				System.out.println("Codigo de la reserva: "+reserva.getCodigo());
				System.out.println("Habitacion reservada: "+reserva.getHabitacion());
				if(reserva.isCheckin()) {
					System.out.println("Checkin Hecho");
				}else {
					System.out.println("Checkin pendiente");
				}
				if(reserva.isCheckout()) {
					System.out.println("Checkout Hecho");
				}else {
					System.out.println("Checkout pendiente");
				}
			}
		}else {
			hay = false;
		}
		return hay;
	}
	protected boolean comprobarReserva(String numero) {
		boolean encontrado = false;
		if (listaReservas.size() > 0) {
			Iterator<Reserva> Iterator = listaReservas.iterator();
			while (Iterator.hasNext() && !encontrado) {
				Reserva reserva = Iterator.next();
				if (numero.equals(reserva.getReserva())) {
					encontrado = true;
				}
			}
		}
		return encontrado;
	}
	
	protected boolean hacerCheckin(String numero) {
		boolean encontrado = false;
		if (listaReservas.size() > 0) {
			Iterator<Reserva> Iterator = listaReservas.iterator();
			while (Iterator.hasNext() && !encontrado) {
				Reserva reserva = Iterator.next();
				if (numero.equals(reserva.getReserva())) {
					reserva.hacerCheckin();
					encontrado = true;
				}
			}
		}
		return encontrado;
	}
	
	protected boolean hacerCheckout(String numero) {
		boolean encontrado = false;
		if (listaReservas.size() > 0) {
			Iterator<Reserva> Iterator = listaReservas.iterator();
			while (Iterator.hasNext() && !encontrado) {
				Reserva reserva = Iterator.next();
				if (numero.equals(reserva.getReserva())) {
					if(reserva.isCheckin()) {
						reserva.hacerCheckout();
						encontrado = true;
					}
				}
			}
		}
		return encontrado;
	}

	protected String eliminarReserva(String numero) {
		String encontrado = "";
		if (listaReservas.size() > 0) {
			Iterator<Reserva> Iterator = listaReservas.iterator();
			while (Iterator.hasNext() && !encontrado.equals("")) {
				Reserva reserva = Iterator.next();
				if (numero.equals(reserva.getReserva())) {
						encontrado = reserva.getDni();
						Iterator.remove();
				}
			}
		}
		return encontrado;
	}
}
