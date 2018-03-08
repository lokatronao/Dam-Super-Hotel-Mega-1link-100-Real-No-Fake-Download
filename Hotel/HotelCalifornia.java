package Hotel;

import	java.util.*;
import Validadores.*;
public class HotelCalifornia {
	
	public static void main(String[] args) {
		String[] menuInicio = {"Bienvenido","LogginEmpleado","LogginReserva","Hacer una reserva","Salir", "Marque la opcion que desea realizar"};
		String[] menuAdmin = {"Bienvenido Administrador","Ver reservas","Cancelar reservas","Registrar nuevo apartamento","Cambiar estado de apartamento","Salir","Marque la opcion que desea realizar"};
		Empleado admin = new Empleado("Lokatronao","Resco","51179123y","lokatronao@gmail.com","627855824","Manager","1234");
		ListaEmpleados empleados = new ListaEmpleados();
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
					switch(opcion2) {
					case 1:
						
						break;
					}
					
				}while(opcion2 != 5);
				break;
			case 3:
				String nombre = " ";
				String apellidos = " ";
				dni = " ";
				String mail = " ";
				String telefono = " ";
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
				}while(!vdni.validar(dni)||dni.equals(" "));
				do {
					menu.tituloCentrado("Introduzca su email para la reserva");
					mail = teclado.nextLine();
				}while(!vmail.validar(mail)||mail.equals(" "));
				do {
					menu.tituloCentrado("Introduzca su telefono para la reserva");
					telefono = teclado.nextLine();
				}while(telefono.equals(" "));
				break;
			}
		}while(opcion!=4);
		teclado.close();	
	}
}
