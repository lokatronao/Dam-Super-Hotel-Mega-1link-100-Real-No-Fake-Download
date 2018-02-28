package Hotel;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import Validadores.*;
import java.util.Scanner;
;
public class test {

	public static void main(String[] args){
		ListaClientes clientes = new ListaClientes();
		ValidadorDNI vdni = new ValidadorDNI();
		Scanner s = new Scanner(System.in);
		String pene = s.nextLine();
		Cliente cliente = new Cliente("Manuel","Barrios","51179123y","loka@primos.com","627855824");
		Reserva r = new Reserva();
		/*System.out.println(
				" ___\n" + 
				"|   |\n" + 
				"|   +\n" + 
				"|___|\n");
		System.out.println(
				"  /|\n" +  
				" /__\n" + 
				"|   |\n" + 
				"|   +\n" + 
				"|___|\n");
	boolean error = false;
	int entrar = 5, salir = 6, pentrar = 2, psalir = 5 ;
	
	if(pentrar >= entrar && pentrar <= salir) {
		error = true;
	}
	if(psalir >= entrar && psalir <= salir) {
		error = true;
	}
	
	if(error) {
		System.out.println("hay una incompatibilidad de rangos");
	}*/
}
}
