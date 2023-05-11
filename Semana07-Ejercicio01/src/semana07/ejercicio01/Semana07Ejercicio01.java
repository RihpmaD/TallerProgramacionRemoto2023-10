/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana07.ejercicio01;

import java.util.Scanner;

/**
 *
 * @author billy
 */
public class Semana07Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad;
        double precio, montoDescuento=0, montoBruto=0, montoNeto=0;
        char opc;
        do {
            System.out.println("\n\t\tEL HARAPIENTO DISTINGUIDO\n");
            System.out.println("[R] - Registrar venta");
            System.out.println("[V] - Mostrar reporte de venta");
            System.out.println("[S] - Salir");
            System.out.println("-------------------------");
            System.out.print("Ingrese una opcion: ");
            opc = sc.next().toUpperCase().charAt(0);
            switch (opc) {
                case 'R':
                    System.out.println("\nREGISTRO DE VENTA");
                    do {
                        System.out.print("Ingrese el precio del traje: ");
                        precio = sc.nextDouble();
                        if (precio <= 0) {
                            System.out.println("El precio ingresado es incorrecto...");
                        }
                    } while (precio <= 0);
                    do {
                        System.out.print("Ingrese la cantidad de trajes: ");
                        cantidad = sc.nextInt();
                        if (cantidad <= 0) {
                            System.out.println("La cantidad ingresada es incorrecta...");
                        }
                    } while (cantidad <= 0);
                    montoBruto = precio * cantidad;
                    if (precio > 2500) {
                        montoDescuento = 0.15 * montoBruto;
                    } else {
                        montoDescuento = 0.08 * montoBruto;
                    }
                    montoNeto = montoBruto - montoDescuento;
                    System.out.println("\nVenta exitosa...");
                    break;
                case 'V':
                    System.out.println("\n\t\tREPORTE DE PAGO");
                    System.out.printf("Monto Total: S/ %.2f %n", montoBruto);
                    System.out.printf("Monto Descuento: S/ %.2f %n", montoDescuento);
                    System.out.println("--------------------------------------");
                    System.out.printf("Monto Neto a Pagar: S/ %.2f %n", montoNeto);
                    break;
                case 'S':
                    System.out.println("Gracias por utilizar el sistema...");
                    break;
                default:
                    System.out.println("Opcion ingresada incorrecta...");
            }
        } while (opc != 'S');

    }

}
