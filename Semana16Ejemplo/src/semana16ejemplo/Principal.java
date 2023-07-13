
package semana16ejemplo;

import java.util.Scanner;

/**
 *
 * @author billy
 */
public class Principal {

    public static void main(String[] args) {
        StringBuilder nombre =new StringBuilder();
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese un nombre: ");
        nombre.append(sc.nextLine());
        System.out.println("El nombre ingresado es: "+nombre);
        nombre.append("Maria Garcia");
        System.out.println("El nuevo nombre es: "+nombre.toString());
    }
    
}
