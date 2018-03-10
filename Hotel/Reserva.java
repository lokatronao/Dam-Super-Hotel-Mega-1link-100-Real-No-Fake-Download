package Hotel;

/**
 * Clase encargada de hacer reservas s
 * 
 * @author Miguel Angel
 * @author Dani
 * @author Jose Ignacio
 * 
 */
public class Reserva {
	String dni,codigo, reserva,habitacion,dias;
	boolean checkin,checkout;
	/**
	 * @return the habitacion
	 */
	protected String getHabitacion() {
		return habitacion;
	}
	/**
	 * @param habitacion the habitacion to set
	 */
	protected void setHabitacion(String habitacion) {
		this.habitacion = habitacion;
	}
	/**
	 * @return the dias
	 */
	protected String getDias() {
		return dias;
	}
	/**
	 * @param dias the dias to set
	 */
	protected void setDias(String dias) {
		this.dias = dias;
	}
	/**
	 * @return the checkin
	 */
	protected boolean isCheckin() {
		return checkin;
	}
	/**
	 * @param checkin the checkin to set
	 */
	protected void setCheckin(boolean checkin) {
		this.checkin = checkin;
	}
	/**
	 * @return the checkout
	 */
	protected boolean isCheckout() {
		return checkout;
	}
	/**
	 * @param checkout the checkout to set
	 */
	protected void setCheckout(boolean checkout) {
		this.checkout = checkout;
	}
	/**
	 * @param dni
	 * @param codigo
	 * @param dias
	 * @param reserva
	 * @param habitacion
	 */
	public Reserva(String dni, String codigo, String habitacion,String dias) {
		this.dni = dni;
		this.codigo = codigo;
		this.dias = dias;
		this.reserva = numeroreserva();
		this.habitacion = habitacion;
		checkout=false;
		checkin=false;
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
	
	protected void hacerCheckin() {
		checkin = true;
	}
	
	protected void hacerCheckout() {
		checkout = true;
	}
}
