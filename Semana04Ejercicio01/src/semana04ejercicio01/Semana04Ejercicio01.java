
package semana04ejercicio01;

import java.util.Scanner;

/**
 *
 * @author billy
 */
public class Semana04Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dia;
        System.out.println("\t\tSISTEMA DE ASIGNACIÓN DE DÍAS\n");
        System.out.print("Ingrese un numero: ");
        dia=sc.nextInt();
        switch(dia){
            case 1:
                System.out.println("El dia es: LUNES");
                break;
            case 2:
                System.out.println("El dia es: MARTES");
                break;
            case 3:
                System.out.println("El dia es: MIERCOLES");
                break;
            case 4:
                System.out.println("El dia es: JUEVES");
                break;
            case 5:
                System.out.println("El dia es: VIERNES");
                break;
            case 6:
                System.out.println("El dia es: SABADO");
                break;
            case 7:
                System.out.println("El dia es: DOMINGO");
                break;
            default:
                System.out.println("El valor ingresado es incorrecto...");
        }
    }
    
}
