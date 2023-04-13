
package semana03.ejercicio01;

import java.util.Scanner;

/**
 *
 * @author billy
 */
public class Semana03Ejercicio01 {

    /**
    Determinar si los lados de un triángulo ingresado por teclado
    son correctos cada lado es menor a la suma de los otros
    dos lados.
     */
    public static void main(String[] args) {
        double lado1, lado2, lado3;
        Scanner sc=new Scanner(System.in);
        System.out.println("\t\tSISTEMA DE MANEJO DE TRIANGULOS\n");
        System.out.print("Ingrese el primer lado del triangulo: ");
        lado1=sc.nextDouble();
        System.out.print("Ingrese el segundo lado del triangulo: ");
        lado2=sc.nextDouble();
        System.out.print("Ingrese el tercer lado del triangulo: ");
        lado3=sc.nextDouble();
        System.out.println("\n\tRESULTADO");
        if(lado1<lado2+lado3 && lado2<lado1+lado3 && lado3<lado1+lado2)
            System.out.println("El triangulo existe...");
        else
            System.out.println("El triangulo no existe...");
    }
    
}
