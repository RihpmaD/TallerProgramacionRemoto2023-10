package semana03.ejercicio02;

import java.util.Scanner;

/**
 *
 * @author billy
 */
public class Semana03Ejercicio02 {

    /**
     * Determinar si los lados de un triángulo ingresado por teclado son
     * correctos cada lado es menor a la suma de los otros dos lados.
     *
     * Si es que el triangulo no existe, deberá de indicarnos cual o cuales de
     * los lados del triangulo son incorrectos.
     */
    public static void main(String[] args) {
        double lado1, lado2, lado3;
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\tSISTEMA DE MANEJO DE TRIANGULOS\n");
        System.out.print("Ingrese el primer lado del triangulo: ");
        lado1 = sc.nextDouble();
        System.out.print("Ingrese el segundo lado del triangulo: ");
        lado2 = sc.nextDouble();
        System.out.print("Ingrese el tercer lado del triangulo: ");
        lado3 = sc.nextDouble();
        System.out.println("\n\tRESULTADO");
        if (lado1 < 0 || lado2 < 0 || lado3 < 0) {
            System.out.println("Algun valor ingresado es negativo...");
        } else {
            if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
                System.out.println("El triangulo existe...");
            } else {
                System.out.println("El triangulo no existe...");
                if (lado1 >= lado2 + lado3) {
                    System.out.println("El primer lado es incorrecto");
                }
                if (lado2 >= lado1 + lado3) {
                    System.out.println("El segundo lado es incorrecto");
                }
                if (lado3 >= lado1 + lado2) {
                    System.out.println("El tercer lado es incorrecto");
                }
            }
        }
    }

}
