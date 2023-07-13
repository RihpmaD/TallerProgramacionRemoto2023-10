
package semana16ejercicio01;

import java.util.Scanner;

/**
 *
 * @author billy
 */
public class Principal {

    public static void main(String[] args) {
        StringBuilder texto=new StringBuilder();
        Scanner sc=new Scanner(System.in);
        int vocales=0;
        System.out.print("Ingrese un texto: ");
        texto.append(sc.nextLine());
        for(int i=0;i<texto.length();i++){
            if(texto.substring(i, i+1).toUpperCase().equals("A")
                    || texto.substring(i, i+1).toUpperCase().equals("E")
                    || texto.substring(i, i+1).toUpperCase().equals("I")
                    || texto.substring(i, i+1).toUpperCase().equals("O")
                    || texto.substring(i, i+1).toUpperCase().equals("U")){
                vocales++;
            }
        }
        System.out.println("La cantidad de vocales es: "+vocales);
        System.out.println("Texto invertido: "+texto.reverse());
    }
    
}
