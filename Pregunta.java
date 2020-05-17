
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author davidgoma
 */

public class Pregunta {
    /**
     * 
     * @param texto => Recibe la pregunta a mostrar
     * @return => Devuelve el número int/double
     */
    public static int pideEntero (String texto) {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        String lectura;
        int resultado = 0;
        boolean isInt = false;
        // Creo el tutor isInt. Si no salta ningún error, el tutor es true por lo que saldrá del bucle
        /**
         * Esta fué la consulta que te hice por mensaje. Antes utilizaba la recursividad.
         */
        do {
            try {
                System.out.print(texto + "\n>");
                lectura = br.readLine();
                resultado = Integer.parseInt(lectura);
                isInt = true;   //Ponemos el tutor a true indicando que todo ha salido bien
            } catch (Exception e)  {
                System.out.println("¡¡¡ Ha habido un error en la lectura de teclado. Por favor, vuelve a intentarlo !!!");
            }
        } while (!isInt);
        
        return resultado;
    }
    /**
     * Pide al usuario que introduzca un número entero
     * @param texto
     * Texto que se mostrará al usuario pidiendo un número
     * @param valorMin
     * El valor mínimo que debe introducir
     * @param valorMax
     * El valor máximo que debe introducir
     * @return 
     * Devuelve el valor introducido
     */
    public static int pideEntero (String texto, int valorMin, int valorMax) {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        String lectura;
        int resultado = 0;
        boolean isInt = false;
        // Creo el tutor isInt. Si no salta ningún error, el tutor es true por lo que saldrá del bucle

        do {
            try {
                System.out.print(texto + "\n>");
                lectura = br.readLine();
                resultado = Integer.parseInt(lectura);
                isInt = true;   //Ponemos el tutor a true indicando que todo ha salido bien
                if (resultado < valorMin | resultado > valorMax) {
                    System.out.println("El valor debe ser entre " + valorMin + " y " + valorMax);
                    isInt = false;
                }
            } catch (Exception e)  {
                System.out.println("¡¡¡ Ha habido un error en la lectura de teclado. Por favor, vuelve a intentarlo !!!");
            }
        } while (!isInt);
        
        return resultado;
    }
    /**
     * 
     * @param texto => Recibe la pregunta a mostrar
     * @return => Devuelve el número int/double
     */
    public static double pideDouble (String texto) {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        String lectura;
        double resultado = 0;
        boolean isDouble = false;
        do {
            try {
                System.out.print(texto + "\n>");
                lectura = br.readLine();
                resultado = Double.parseDouble(lectura);
                isDouble = true;    //Ponemos el tutor a true indicando que todo ha salido bien
            } catch (Exception e)  {
                System.out.println("¡¡¡ Ha habido un error en la lectura de teclado. Por favor, vuelve a intentarlo !!!");
            }
            
        } while (!isDouble);
        return resultado;
    } 
    /**
     * Pide un número decimal dentro de un rango al usuario 
     * @param texto
     * Pregunta qe se hará al ususario
     * @param valorMin
     * Valor mínimo introducido
     * @param valorMax
     * Valor máximo introducido
     * @return 
     */
    public static double pideDouble (String texto, double valorMin, double valorMax) {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        String lectura;
        double resultado = 0;
        boolean isDouble = false;
        boolean correcto = true;
        do {
            correcto = true;
            try {
                System.out.print(texto + "\n>");
                lectura = br.readLine();
                resultado = Double.parseDouble(lectura);
                isDouble = true;    //Ponemos el tutor a true indicando que todo ha salido bien
            } catch (Exception e)  {
                System.out.println("¡¡¡ Ha habido un error en la lectura de teclado. Por favor, vuelve a intentarlo !!!");
            }
            if (resultado < valorMin | resultado > valorMax) {
                System.out.println("Ha introducido un valor no esperado. Debe ser entre " +
                        valorMin + " y " + valorMax);
                correcto = false;
            }
            
        } while (!isDouble | correcto == false);
        return resultado;
    } 
    /**
     * Pide al usuario un texto
     * @param texto
     * Pregunta que se le hará al usuario
     * @return 
     * Devuelve un String introducido por el usuario
     */
    public static String pideStringLleno (String texto) {
        
        //Cambio a codificación ISO-8859-1 para que acepte los acentos
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in, StandardCharsets.ISO_8859_1)));
        
        String lectura = "";
        do {
            try {
                System.out.print(texto + "\n>");
                lectura = br.readLine();
            } catch (IOException e)  {
                System.out.println("¡¡¡ Ha habido un error en la lectura de teclado. Por favor, vuelve a intentarlo !!!");
            }
            if (lectura.isEmpty()) {
                System.out.println("Es obligatorio introducir un texto!!");
            }
        } while (lectura.isEmpty());
        return lectura;
    } 
    
}
