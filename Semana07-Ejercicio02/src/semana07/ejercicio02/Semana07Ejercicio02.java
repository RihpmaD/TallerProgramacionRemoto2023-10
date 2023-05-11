package semana07.ejercicio02;

import java.util.Scanner;

/**
 *
 * @author billy
 */
public class Semana07Ejercicio02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad;
        double montoTarjeta = 0, montoBruto = 0, montoNeto = 0;
        double montoSimple = 0, montoDoble = 0, montoTriple = 0;
        char opc, tarjeta;
        do {
            System.out.println("\n\t\tEL NAUFRAGO SATISFECHO");
            System.out.println("[R] - Registrar venta");
            System.out.println("[V] - Mostrar reporte de venta");
            System.out.println("[S] - Salir");
            System.out.println("---------------------------");
            System.out.print("Ingrese una opcion: ");
            opc = sc.next().toUpperCase().charAt(0);
            switch (opc) {
                case 'R':
                    do {
                        System.out.println("\n\tLISTA DEL HAMBURGUESAS");
                        System.out.println("[S] - Hamburguesas Simples - S/. 20.00");
                        System.out.println("[D] - Hamburguesas Dobles - S/. 25.00");
                        System.out.println("[T] - Hamburguesas Triples - S/. 28.00");
                        System.out.println("[E] - Finalizar Pedido");
                        System.out.println("-----------------------------------");
                        System.out.print("Ingrese una opcion: ");
                        opc = sc.next().toUpperCase().charAt(0);
                        switch (opc) {
                            case 'S':
                                do {
                                    System.out.println("HAMBURGUESAS SIMPLES");
                                    System.out.print("Ingrese la cantidad: ");
                                    cantidad = sc.nextInt();
                                    if (cantidad <= 0) {
                                        System.out.println("cantidad ingresada incorrecta...");
                                    }
                                } while (cantidad <= 0);
                                montoSimple += (cantidad * 20);
                                break;
                            case 'D':
                                do {
                                    System.out.println("HAMBURGUESAS DOBLES");
                                    System.out.print("Ingrese la cantidad: ");
                                    cantidad = sc.nextInt();
                                    if (cantidad <= 0) {
                                        System.out.println("cantidad ingresada incorrecta...");
                                    }
                                } while (cantidad <= 0);
                                montoDoble += (cantidad * 25);
                                break;
                            case 'T':
                                do {
                                    System.out.println("HAMBURGUESAS TRIPLES");
                                    System.out.print("Ingrese la cantidad: ");
                                    cantidad = sc.nextInt();
                                    if (cantidad <= 0) {
                                        System.out.println("cantidad ingresada incorrecta...");
                                    }
                                } while (cantidad <= 0);
                                montoTriple += (cantidad * 28);
                                break;
                            case 'E':
                                System.out.println("Pedido procesado de manera exitosa...");
                                break;
                            default:
                                System.out.println("Opcion ingresada incorrecta...");
                        }
                    } while (opc != 'E');
                    montoBruto = montoSimple + montoDoble + montoTriple;
                    do {
                        System.out.println("PAGO CON TARJETA");
                        System.out.print("Desea pagar con tarjeta[S-N]: ");
                        tarjeta = sc.next().toUpperCase().charAt(0);
                        if (tarjeta == 'S') {
                            montoTarjeta = 0.05 * montoBruto;
                        }
                    } while (tarjeta != 'S' && tarjeta != 'N');
                    montoNeto = montoBruto + montoTarjeta;
                    break;
                case 'V':
                    System.out.println("\n\tREPORTE DE PAGO");
                    System.out.printf("Monto Total a pagar: S/. %.2f %n", montoBruto);
                    System.out.printf("Monto Hamburguesa Simple: S/. %.2f %n", montoSimple);
                    System.out.printf("Monto Hamburguesa Doble: S/. %.2f %n", montoDoble);
                    System.out.printf("Monto Hamburguesa Triple: S/. %.2f %n", montoTriple);
                    System.out.printf("Monto por pago de Tarjeta: S/. %.2f %n", montoTarjeta);
                    System.out.printf("Monto Neto a pagar: S/. %.2f %n", montoNeto);
                    break;
                case 'S':
                    System.out.println("Gracia por utilizar el sistema...");
                    break;
                default:
                    System.out.println("Opcion ingresada incorrecta...");
            }
        } while (opc != 'S');

    }

}
