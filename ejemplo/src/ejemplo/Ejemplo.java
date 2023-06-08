
package ejemplo;

import java.util.Scanner;

/**
 *
 * @author billy
 */
public class Ejemplo {

    public static void main(String[] args) {
        String nombre="Juan";
        System.out.println(nombre);
        nombre=nombre+" Maria";
        System.out.println(nombre);
        StringBuilder texto=new StringBuilder();
        texto.append("Juan");
        System.out.println(texto);
        texto.append(" Maria");
        System.out.println(texto);
    }

}
