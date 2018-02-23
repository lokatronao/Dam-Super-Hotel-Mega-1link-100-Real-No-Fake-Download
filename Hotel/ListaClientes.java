/**
 * 
 */
package Hotel;

import java.util.ArrayList;
import java.util.Iterator;
import Validadores.*;

/**
 * Clase ListaClientes almacena a los clientes y tiene una clase de metodos para
 * su manipulación
 * 
 * @author Miguel Angel
 * @author Dani
 * @author Jose Ignacio
 *
 */
public class ListaClientes {
	ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

	/**
	 * 
	 */
	public ListaClientes() {
	}
	/**
	 * Metodo encargado de comprobar clientes no registrados con el mismo DNI e EMAIL 
	 * y en caso de no estar registrados los registra  
	 * 
	 * @param clienteInsertado Cliente que se pretende guardar
	 * @return insertado booleano devuelve TRUE en caso de que se haya introducido el cliente FALSE en caso de que no se haya introducido
	 *
	 */
	protected boolean insertarCliente(Cliente clienteInsertado) {
		boolean insertado=true;
		ValidadorDNI vdni = new ValidadorDNI();
		ValidadorEMAIL vemail = new ValidadorEMAIL();
		
		if(listaClientes.size()>0) {
			if(vdni.validar(clienteInsertado.getDni()) && vemail.validar(clienteInsertado.getMail())){
				Iterator<Cliente> Iterator = listaClientes.iterator();
				while(Iterator.hasNext() && insertado) {
					Cliente cliente = Iterator.next();
					if(cliente.getDni().equals(clienteInsertado.getDni()) || cliente.getMail().equals(clienteInsertado.getMail())) {
						insertado = false;
					}
				}
			}else {
				insertado = false;
			}
		}else {
			if(!vdni.validar(clienteInsertado.getDni()) || !vemail.validar(clienteInsertado.getMail())){
				insertado = false;
			}
		}
		if(insertado) {
			listaClientes.add(clienteInsertado);
		}
		return insertado;
	}
	/**
	 * DEBUG
	 * @deprecated
	 */
	protected void mostrarClientes() {
		Iterator<Cliente> Iterator = listaClientes.iterator();
		while(Iterator.hasNext()) {
			Cliente cliente = Iterator.next();
			System.out.println(cliente.getNombre());
		}
	}
	

}
