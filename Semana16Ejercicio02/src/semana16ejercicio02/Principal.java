
package semana16ejercicio02;

import java.util.Scanner;

/**
 *
 * @author billy
 */
public class Principal {

    public static void main(String[] args) {
        StringBuffer texto=new StringBuffer();
        Scanner sc=new Scanner(System.in);
        int cantidad=0;
        String letra;
        System.out.print("Ingrese un texto: ");
        texto.append(sc.nextLine());
        System.out.print("Ingrese una letra: ");
        letra=sc.next();
        for(int i=0;i<texto.length();i++)
            if(texto.substring(i, i+1).equals(letra))
                cantidad++;
        System.out.println("La cantidad de letra "+letra+" es: "+cantidad);
    }

}
