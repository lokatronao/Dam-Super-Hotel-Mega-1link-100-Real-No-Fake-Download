package Hotel;

/**
 * Clase Menus encragada de la creacion de los menus dinamicos
 * 
 * @author Miguel Angel
 * @author Dani
 * @author Jose Ignacio
 *
 */
public class Menus {
	int longitud;

	/**
	 * Menus es una clase que permite crear menus personalizados
	 * 
	 * @param longitud Caracteres maximos que tiene el menu
	 */
	public Menus(int longitud) {
		this.longitud = longitud;
	}
	/**
	 * Crea un titulo centrado
	 * 
	 * @param titulo Texto que se espera como titulo
	 */
	protected void tituloCentrado(String titulo) {
		int longitud = this.longitud;
		String barras = "::";
		for (int i = 0; i < longitud; i++) {
			barras += ":";
		}
		String texto = ":";
		longitud -= titulo.length();
		if (titulo.length() > this.longitud) {
			System.out.println("Error el texto introducido es mas grande que el espacio texto");
		} else {
			int mitad = longitud / 2;
			for (int i = 0; i < mitad; i++) {
				texto += " ";
			}
			texto += titulo;
			for (int i = 0; i < mitad; i++) {
				texto += " ";
			}
			if ((titulo.length() % 2) != 0) {
				texto += " ";
			}
			if ((this.longitud % 2) != 0) {
				texto += " ";
			}
			texto += ":";
			System.out.println(barras);
			System.out.println(texto);
			System.out.println(barras);
		}
	}
	/**
	 * Crea un titulo con alineacion a la izquierda
	 * 
	 * @param titulo Texto que se espera como titulo
	 */
	
	protected void tituloIzquierda(String titulo) {
		int longitud = this.longitud;
		String barras = "::";
		for (int i = 0; i < longitud; i++) {
			barras += ":";
		}
		String texto = ": ";
		longitud -= titulo.length();
		longitud --;
		if (titulo.length() > this.longitud) {
			System.out.println("Error el texto introducido es mas grande que el espacio texto");
		} else {
			texto += titulo;
			for (int i = 0; i < longitud; i++) {
				texto += " ";
			}
			texto += ":";
			System.out.println(barras);
			System.out.println(texto);
			System.out.println(barras);
		}
	}
	/**
	 * Crea un contenido Centrado
	 * 
	 * @param contenido Texto que se espera como contenido
	 */
	protected void contenidoCentrado(String contenido) {
		String texto = ":";
		int longitud = this.longitud;
		longitud -= contenido.length();
		if (contenido.length() > this.longitud) {
			System.out.println("Error el texto introducido es mas grande que el espacio texto");
		} else {
			int mitad = longitud / 2;
			for (int i = 0; i < mitad; i++) {
				texto += " ";
			}
			texto += contenido;
			for (int i = 0; i < mitad; i++) {
				texto += " ";
			}
			if ((contenido.length() % 2) != 0) {
				texto += " ";
			}
			if ((this.longitud % 2) != 0) {
				texto += " ";
			}
			texto += ":";
			System.out.println(texto);
		}
	}
	/**
	 * Crea un contenido con alineacion izquierda
	 * 
	 * @param contenido Texto que se espera como contenido
	 */
	protected void contenidoIzquierda(String contenido) {
		int longitud = this.longitud;
		String texto = ": ";
		longitud -= contenido.length();
		longitud --;
		if (contenido.length() > this.longitud) {
			System.out.println("Error el texto introducido es mas grande que el espacio texto");
		} else {
			texto += contenido;
			for (int i = 0; i < longitud; i++) {
				texto += " ";
			}
			texto += ":";
			System.out.println(texto);
		}
	}
	/**
	 * Crea una barra 
	 */
	protected void barra() {
		int longitud = this.longitud;
		String barras = "::";
		for (int i = 0; i < longitud; i++) {
			barras += ":";
		}
		System.out.println(barras);
	}
	/**
	 * Metodo que generara un menu a partir de un array
	 * El metodo requiere al menos el titulo, una opcion y una pregunta al final
	 * 
	 * @param contenido Array en el que se esperan los textos del menu array (titulo,opcion1,opcion2,...,preguntafinal)
	 * @param atitulo Booleano TRUE el titulo saldrá centrado FALSE con alineacion izquierda
	 * @param acontenido Booleano TRUE el contenido saldrá centrado FALSE con alineacion izquierda
	 * @param apregunta Booleano TRUE el preguntafinal saldrá centrado FALSE con alineacion izquierda
	 */
	protected void opciones(String[] contenido,boolean atitulo, boolean acontenido,boolean apregunta) {
		for(int i = 0; i < contenido.length; i++) {
			if(i==0) {
				if(atitulo) {
					tituloCentrado(contenido[i]);
				}else {
					tituloIzquierda(contenido[i]);
				}
			}
			if((i+2)>contenido.length) {
				barra();
				if(apregunta) {
					contenidoCentrado(contenido[i]);
				}else {
					contenidoIzquierda(contenido[i]);
				}
				barra();
			}else if(i>0 && i<contenido.length) {
				if(acontenido) {
					contenidoCentrado(i+". "+contenido[i]);
				}else {
					contenidoIzquierda(i+". "+contenido[i]);
				}
			}
		}
	}
}
