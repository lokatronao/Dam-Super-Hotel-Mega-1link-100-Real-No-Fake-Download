package Validadores;

/**
 * Validacion de DNI
 * 
 * @author Miguel Angel
 * @author Dani
 * @author Jose Ignacio
 *
 */
 
public class ValidadorDNI
{
     
    /**
	 * 
	 */
	public ValidadorDNI() {

	}
	/**
	 * Funcion que valida el DNI haciendo uso de otros metodos
	 * 
	 * @param dni DNI de un usuario 
	 * @return Verdadero valor booleano que sera TRUE si el DNI es correcto y FALSE en caso de que no sea correcto
	 *
	 */
	public boolean validar(String dni) {
		boolean verdadero = false;
         
        String letraMayuscula = ""; //Guardaremos la letra introducida en formato mayúscula
             
        // Aquí excluimos cadenas distintas a 9 caracteres que debe tener un dni y también si el último caracter no es una letra
        if(dni.length() != 9 || Character.isLetter(dni.charAt(8)) == false ) {
            verdadero = false;
        }else{
            // Al superar la primera restricción, la letra la pasamos a mayúscula
            letraMayuscula = (dni.substring(8)).toUpperCase();
     
            // Por último validamos que sólo tengo 8 dígitos entre los 8 primeros caracteres y que la letra introducida es igual a la de la ecuación
            // Llamamos a los métodos privados de la clase soloNumeros() y letraDNI()
            if(soloNumeros(dni) == true && letraDNI(dni).equals(letraMayuscula)) {
        		verdadero = true;
	        }
	        else {
	        		verdadero = false;
	        }
        }
         
        return verdadero;

    }

        private boolean soloNumeros(String dni) {
        		boolean error = true;
            int i, j = 0;
            String numero = ""; // Es el número que se comprueba uno a uno por si hay alguna letra entre los 8 primeros dígitos
            String miDNI = ""; // Guardamos en una cadena los números para después calcular la letra
            String[] unoNueve = {"0","1","2","3","4","5","6","7","8","9"};
 
            for(i = 0; i < dni.length() - 1; i++) {
                numero = dni.substring(i, i+1);
 
                for(j = 0; j < unoNueve.length; j++) {
                    if(numero.equals(unoNueve[j])) {
                        miDNI += unoNueve[j];
                    }
                }
            }
 
            if(miDNI.length() != 8) {
                error = false;
            }
            else {
                error = true;
            }
            return error;
        }

        private String letraDNI(String dni) {
        // El método es privado porque lo voy a usar internamente en esta clase, no se necesita fuera de ella
 
        // pasar miNumero a integer
        int miDNI = Integer.parseInt(dni.substring(0,8));
        int resto = 0;
        String miLetra = "";
        String[] asignacionLetra = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
 
        resto = miDNI % 23;
 
        miLetra = asignacionLetra[resto];
 
        return miLetra;
    }
}
