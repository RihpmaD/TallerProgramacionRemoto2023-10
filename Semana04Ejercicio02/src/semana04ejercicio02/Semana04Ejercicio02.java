
package semana04ejercicio02;

import java.util.Scanner;

/**
 *
 * @author billy
 */
public class Semana04Ejercicio02 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double peso, montoTotal;
        char zona;
        System.out.println("\t\tSISTEMA DE PAQUETERIA\n");
        System.out.println("Zona\tUbicación\t\tCosto(S/.)");
        System.out.println("[N]\tAmerica del Norte \tS/. 11.00");
        System.out.println("[C]\tAmerica Central\t\tS/. 10.00");
        System.out.println("[S]\tAmerica del Sur\t\tS/. 12.00");
        System.out.println("[E]\tEuropa\t\t\tS/. 24.00");
        System.out.println("[A]\tAsia\t\t\tS/. 27.00");
        System.out.println("-----------------------------------------------");
        System.out.print("Ingrese el peso del paquete: ");
        peso=sc.nextDouble();
        System.out.print("Ingrese la zona de envío: ");
        zona=sc.next().toUpperCase().charAt(0);
        if(peso<=0)
            System.out.println("El valor ingresado no es correcto...");
        else{
            System.out.println("\nREPORTE DE PAGO\n");
            switch(zona){
                case 'N':
                    montoTotal=peso*11;
                    System.out.println("Zona America del Norte");
                    System.out.printf("El monto a pagar es: S/."
                            + "%.2f %n",montoTotal);
                    break;
                case 'C':
                    montoTotal=peso*10;
                    System.out.println("Zona America Central");
                    System.out.printf("El monto a pagar es: S/."
                            + "%.2f %n",montoTotal);
                    break;
                case 'S':
                    montoTotal=peso*12;
                    System.out.println("Zona America del sur");
                    System.out.printf("El monto a pagar es: S/."
                            + "%.2f %n",montoTotal);
                    break;
                case 'E':
                    montoTotal=peso*24;
                    System.out.println("Zona Europa");
                    System.out.printf("El monto a pagar es: S/."
                            + "%.2f %n",montoTotal);
                    break;
                case 'A':
                    montoTotal=peso*27;
                    System.out.println("Zona Asia");
                    System.out.printf("El monto a pagar es: S/."
                            + "%.2f %n",montoTotal);
                    break;
                default:
                    montoTotal=0;
                    System.out.println("El valor ingresado es incorrecto...");
            }
        }
    }
    
}
