
package semana07ejercicio01;

import java.util.Scanner;

/**
 *
 * @author billy
 */
public class Semana07Ejercicio01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad;
        double precio, montoDescuento, montoBruto, montoNeto;
        System.out.println("\n\t\tEL HARAPIENTO DISTINGUIDO\n");
        System.out.print("Ingrese el precio del traje: ");
        precio=sc.nextDouble();
        System.out.print("Ingrese la cantidad de trajes: ");
        cantidad=sc.nextInt();
        montoBruto=precio*cantidad;
        if(precio>2500)
            montoDescuento=0.15*montoBruto;
        else
            montoDescuento=0.08*montoBruto;
        montoNeto=montoBruto-montoDescuento;
        System.out.println("\n\t\tREPORTE DE PAGO");
        System.out.printf("Monto Total: S/ %.2f %n", montoBruto);
        System.out.printf("Monto Descuento: S/ %.2f %n", montoDescuento);
        System.out.println("--------------------------------------");
        System.out.printf("Monto Neto a Pagar: S/ %.2f %n", montoNeto);
    }
    
}
