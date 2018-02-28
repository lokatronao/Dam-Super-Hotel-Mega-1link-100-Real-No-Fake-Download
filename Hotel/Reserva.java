package Hotel;

import java.util.Date;
/**
 * Clase encargada de hacer reservas
 * 
 * @author Miguel Angel
 * @author Dani
 * @author Jose Ignacio
 * 
 */
public class Reserva {
	String dni,codigo, reserva;
	Date checkin, checkout;
	/**
	 * @param dni
	 * @param codigo
	 * @param reserva
	 * @param checkin
	 * @param checkout
	 */
	public Reserva(String dni, String codigo, String reserva, Date checkin, Date checkout) {
		this.dni = dni;
		this.codigo = codigo;
		this.reserva = reserva;
		this.checkin = checkin;
		this.checkout = checkout;
	}
	/**
	 * 
	 */
	public Reserva() {
	}
	/**
	 * @return the dni
	 */
	protected String getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	protected void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * @return the codigo
	 */
	protected String getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	protected void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the reserva
	 */
	protected String getReserva() {
		return reserva;
	}
	/**
	 * @param reserva the reserva to set
	 */
	protected void setReserva(String reserva) {
		this.reserva = reserva;
	}
	/**
	 * @return the checkin
	 */
	protected Date getCheckin() {
		return checkin;
	}
	/**
	 * @param checkin the checkin to set
	 */
	protected void setCheckin(Date checkin) {
		this.checkin = checkin;
	}
	/**
	 * @return the checkout
	 */
	protected Date getCheckout() {
		return checkout;
	}
	/**
	 * @param checkout the checkout to set
	 */
	protected void setCheckout(Date checkout) {
		this.checkout = checkout;
	}
	/**
	 * @deprecated
	 */
	protected void test(){
		System.out.println(numeroreserva());
	}
	/**
	 * Metodo que genera un codigo generado aleatoriamente de tipo r-xxxxxxxxx
	 * 
	 * @return numeroreserva es un codigo generado aleatoriamente
	 */
	private String numeroreserva() {
		String numeroreserva="r-";
		for(int i = 0;i<10;i++) {
			numeroreserva += Integer.valueOf((int) (Math.random() * 9) + 1);
		}
		
		return numeroreserva;
	}
	
}
