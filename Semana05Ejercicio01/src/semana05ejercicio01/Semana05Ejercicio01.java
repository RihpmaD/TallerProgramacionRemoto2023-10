
package semana05ejercicio01;

import java.util.Scanner;

/**
 * Ordenar 3 números de mayor a menor.
 * @author billy
 */
public class Semana05Ejercicio01 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n1, n2, n3;
        System.out.println("\t\tSISTEMA DE ORDENAMIENTO DE NÚMEROS\n");
        System.out.print("Ingresa el primer numero: ");
        n1=sc.nextDouble();
        System.out.print("Ingresa el segundo numero: ");
        n2=sc.nextDouble();
        System.out.print("Ingresa el tercer numero: ");
        n3=sc.nextDouble();
        System.out.println("\nNUMEROS ORDENADOS\n");
        if(n1>=n2 && n1>=n3){
            System.out.print(n1 + " - ");
            if(n2>=n3)
                System.out.print(n2+" - "+n3);
            else
                System.out.print(n3+" - "+n2);
        }else{
            if(n2>=n1 && n2>=n3){
                System.out.print(n2 + " - ");
                if(n1>=n3)
                    System.out.print(n1+" - "+n3);
                else
                    System.out.print(n3+" - "+n1);
            }else{
                System.out.print(n3 + " - ");
                if(n1>=n2)
                    System.out.print(n1+" - "+n2);
                else
                    System.out.print(n2+" - "+n1);
            }
        }
        System.out.println("");
    }
    
}
