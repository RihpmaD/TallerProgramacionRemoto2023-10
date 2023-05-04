
package semana06ejercicio03;

import java.util.Scanner;

/**
 *
 * @author billy
 */
public class Semana06Ejercicio03 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numero=1, suma=0;
        System.out.println("\t\tSUMA DE PARES\n");
        while(numero>0){
            System.out.print("Ingrese un numero: ");
            numero=sc.nextInt();
            if(numero%2==0 && numero>0)
                suma+=numero;
        }
        System.out.println("\n\tRESULTADO");
        System.out.println("La suma de los pares es: "+suma);
    }
    
}
