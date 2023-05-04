
package semana06ejercicio01;

import java.util.Scanner;

/**
 *
 * @author billy
 */
public class Semana06Ejercicio01 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numero, suma=0, cantidad=1;
        System.out.println("\t\tSISTEMA DE INGRESO DE NUMEROS\n");
        while(cantidad<=5){
            System.out.print("Ingrese numero "+cantidad+": ");
            numero=sc.nextInt();
            suma+=numero;
            cantidad++;
        }
        System.out.println("\n\tRESULTADOS");
        System.out.println("La suma de los numeros es: "+suma);
    }
    
}
