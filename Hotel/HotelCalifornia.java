package Hotel;

import	java.util.*;
import Validadores.*;
/**
 * Clase principal del proyecto
 * 
 * @param args
 */
public class HotelCalifornia {
	/**
	 * Clase principal del proyecto
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Menus
		String[] menuInicio = {"Bienvenido","LogginEmpleado","Hacer una reserva","Salir", "Marque la opcion que desea realizar"};
		String[] menuAdmin = {"Bienvenido Administrador","Ver habitaciones","Cancelar reservas","Registrar nuevo apartamento","Ver reservas","Check in","Check out","Salir","Marque la opcion que desea realizar"};
		Empleado admin = new Empleado("Lokatronao","Resco","51179123y","lokatronao@gmail.com","627855824","Manager","1234");
		//Listas
		ListaEmpleados empleados = new ListaEmpleados();
		ListaHabitaciones habitaciones = new ListaHabitaciones();
		ListaClientes clientes = new ListaClientes();
		ListaReservas reservas = new ListaReservas();
		//debug
		empleados.insertarEmpleados(admin);
		ValidadorDNI vdni = new ValidadorDNI();
		ValidadorEMAIL vmail = new ValidadorEMAIL();
		Menus menu = new Menus(50);
		int opcion=0,opcion2=0;
		
		Scanner teclado = new Scanner(System.in);
		do {
			menu.opciones(menuInicio,true, false, true);
			opcion = teclado.nextInt();
			teclado.nextLine();
			String dni = " ", contrasenia = " ";
			
			switch(opcion) {
			case 1:
				do {
					do {
						menu.tituloCentrado("Introduce tu DNI");
						dni = teclado.nextLine();
					}while(!vdni.validar(dni)||dni.equals(" "));
					do {
						menu.tituloCentrado("Introduce tu contrasenia");
						contrasenia = teclado.nextLine();
					}while(contrasenia.equals(" "));
				}while(!empleados.comprobarContrasenia(contrasenia, dni));
				do {
					menu.opciones(menuAdmin,true, false, true);
					opcion2 = teclado.nextInt();
					teclado.nextLine();
					switch(opcion2) {
					case 1:
						if(!habitaciones.verHabitaciones()) {
							menu.tituloCentrado("No hay habitaciones");
						}
						break;
					case 2:
						String numeroreserva = " ";
						do {
							menu.tituloCentrado("Introduce el numero de la reserva");
							numeroreserva = teclado.nextLine();
						}while(numeroreserva.equals(" "));
						if(!reservas.eliminarReserva(numeroreserva).equals("")){
							menu.tituloCentrado("Se ha eliminado la reserva");
						}else {
							menu.tituloCentrado("No se ha podido eliminar la reserva");
						}
						break;
					case 3:
						String numeroHabitacion=" ", numeroPersonas="0",precioNoche="0";
						do {
							menu.tituloCentrado("Introduce el numero de la habitacion");
							numeroHabitacion = teclado.nextLine();
							if(habitaciones.comprobarHabitacion(numeroHabitacion)) {
								menu.tituloCentrado("Ese numero de habitacion ya existe");
							}
						}while(habitaciones.comprobarHabitacion(numeroHabitacion)|| numeroHabitacion.equals(" "));
						do {
							menu.tituloCentrado("Introduce el numero de personas maximo");
							numeroPersonas = teclado.nextLine();
						}while(Integer.parseInt(numeroPersonas) <= 0  || Integer.parseInt(numeroPersonas) > 10);
						do {
							menu.tituloCentrado("Introduce el precio por noche de la reserva");
							precioNoche = teclado.nextLine();
						}while(Integer.parseInt(precioNoche) < 1);
						Habitacion habitacion = new Habitacion(precioNoche,numeroPersonas,false,numeroHabitacion);
						habitaciones.insertarHabitacion(habitacion);
						break;
					case 4:
						if(!reservas.verReservas()) {
							menu.tituloCentrado("no hay reservas");
						}
						break;
					case 5:
						numeroreserva = " ";
						do {
							menu.tituloCentrado("Introduce el numero de la reserva");
							numeroreserva = teclado.nextLine();
						}while(numeroreserva.equals(" "));
						if(reservas.hacerCheckin(numeroreserva)){
							menu.tituloCentrado("Se ha hecho el check in");
						}else {
							menu.tituloCentrado("No se ha podido hacer el check in");
						}
						break;
					case 6:
						numeroreserva = " ";
						do {
							menu.tituloCentrado("Introduce el numero de la reserva");
							numeroreserva = teclado.nextLine();
						}while(numeroreserva.equals(" "));
						if(reservas.hacerCheckout(numeroreserva)){
							menu.tituloCentrado("Se ha hecho el check out");
						}else {
							menu.tituloCentrado("No se ha podido hacer el check out");
						}
						break;
					}
				}while(opcion2 != 7);
				break;
			case 2:
				String nombre = " ";
				String apellidos = " ";
				dni = " ";
				String mail = " ";
				String telefono = " ";
				String personas = " ";
				String dias = " ";
				String codigo = " ";
				do {
					menu.tituloCentrado("Introduzca su nombre para la reserva");
					nombre = teclado.nextLine();
				}while(nombre.equals(" "));
				do {
					menu.tituloCentrado("Introduzca sus apellidos para la reserva");
					apellidos = teclado.nextLine();
				}while(apellidos.equals(" "));
				do {
					menu.tituloCentrado("Introduzca su dni para la reserva");
					dni = teclado.nextLine();
				}while(dni.equals(" ")||!vdni.validar(dni));
				do {
					menu.tituloCentrado("Introduzca su email para la reserva");
					mail = teclado.nextLine();
				}while(mail.equals(" ")||!vmail.validar(mail));
				do {
					menu.tituloCentrado("Introduzca su telefono para la reserva");
					telefono = teclado.nextLine();
				}while(telefono.equals(" "));
				if(!clientes.clienteDNI(dni)) {
					Cliente clienteInsertado = new Cliente(nombre,apellidos,dni,mail,telefono);
					clientes.insertarCliente(clienteInsertado);
					do {
						menu.tituloCentrado("Introduzca el numero de personas para la reserva");
						personas = teclado.nextLine();
					}while(personas.equals(" "));
					do {
						menu.tituloCentrado("Cuantos d�as quieres estar?");
						dias = teclado.nextLine();
					}while(dias.equals(" "));
					do {
						menu.tituloCentrado("Pon un codigo a tu reserva");
						codigo = teclado.nextLine();
					}while(dias.equals(" "));
					Reserva reserva = new Reserva(dni,codigo,dias,personas);
					Habitacion encontrados2[] = habitaciones.encontrarHabitacion(Integer.parseInt(personas));
					if(reservas.insertarReserva(reserva, encontrados2)) {
						menu.tituloCentrado("Datos de tu reserva");
						menu.contenidoIzquierda("Reserva: "+reserva.getReserva());
						menu.contenidoIzquierda("Habitacion: "+reserva.getHabitacion());
						menu.contenidoIzquierda("precio total: "+habitaciones.comprobarprecio(reserva.getHabitacion(), Integer.parseInt(dias)));
						menu.contenidoIzquierda("Codigo: "+reserva.getCodigo());
					}else {
						menu.tituloCentrado("No hay habitaciones disponibles");
					}
				}else {
					menu.tituloCentrado("Ya tienes una reserva en activo");
				}
				break;
			}
		}while(opcion!=3);
		teclado.close();	
	}

}