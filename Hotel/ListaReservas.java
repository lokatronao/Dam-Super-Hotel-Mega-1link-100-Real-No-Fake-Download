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
	protected boolean insertarCliente(Reserva reservaInsertado) {
		boolean insertado = true;

		if (listaReservas.size() > 0) {
			if (vdni.validar(clienteInsertado.getDni()) && vemail.validar(clienteInsertado.getMail())) {
				Iterator<Cliente> Iterator = listaReservas.iterator();
				while (Iterator.hasNext() && insertado) {
					Cliente cliente = Iterator.next();
					if (cliente.getDni().equals(clienteInsertado.getDni())
							|| cliente.getMail().equals(clienteInsertado.getMail())) {
						insertado = false;
					}
				}
			} else {
				insertado = false;
			}
		} else {
			if (!vdni.validar(clienteInsertado.getDni()) || !vemail.validar(clienteInsertado.getMail())) {
				insertado = false;
			}
		}
		if (insertado) {
			listaReservas.add(clienteInsertado);
		}
		return insertado;
	}

	protected boolean comprobarReserva(String numero) {
		boolean encontrado = false;
		if (listaReservas.size() > 0) {
			Iterator<Cliente> Iterator = listaReservas.iterator();
			while (Iterator.hasNext() && !encontrado) {
				Cliente reserva = Iterator.next();
				if (numero.equals(reserva)
						|| cliente.getMail().equals(clienteInsertado.getMail())) {
					insertado = false;
				}
			}

		} else {

		}
		return encontrado;
	}
}
