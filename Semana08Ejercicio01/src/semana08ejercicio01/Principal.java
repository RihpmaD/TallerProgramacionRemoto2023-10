package semana08ejercicio01;

import java.util.Scanner;

/**
 *
 * @author billy
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double sum = 0;
        System.out.println("\n\t\tSISTEMA DE SERIES\n");
        do {
            System.out.print("Ingrese la cantidad de elementos: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("El valor ingresado es incorrecto...");
            }
        } while (n <= 0);
        //crear un break que salga de bucle cuando la suma sea superior 
        //al valor de n elevado al cuadrado.
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i, i);
            if (i != n) {
                if (sum > n * n) {
                    System.out.print(Math.pow(i, i) + " = ");
                    break;
                }
                System.out.print(Math.pow(i, i) + " + ");
            } else {
                System.out.print(Math.pow(i, i) + " = ");
            }

        }
        System.out.println(sum + "\n");
    }

}
