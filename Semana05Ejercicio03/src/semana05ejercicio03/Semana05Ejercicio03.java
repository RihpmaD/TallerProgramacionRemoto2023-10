
package semana05ejercicio03;

import java.util.Scanner;

/**
 * Una distribuidora de motocicletas tiene una promoción de fin de año que
consiste en lo siguiente. Las motos marca Honda tienen un descuento del
5%, las marcas Yamaha del 8% y las Suzuki del 10%, las otras marcas
2%
 * @author billy
 */
public class Semana05Ejercicio03 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double descuento=0, monto, montoFinal;
        char marca;
        System.out.println("\t\tSISTEMA DE VENTAS LAS MOTITOS\n");
        System.out.println("[H] - Honda\t[Y] - Yamaha");
        System.out.println("[S] - Suzuki\t[O] - Otros");
        System.out.println("----------------------------------\n");
        System.out.print("Ingrese el precio de la moto: ");
        monto=sc.nextDouble();
        if(monto<=0){
            descuento=0;
            System.out.println("El monto ingresado es incorrecto...");
        }else{
            System.out.print("Ingrese la marca de la moto: ");
            marca=sc.next().toUpperCase().charAt(0);
            switch(marca){
                case 'H':
                    descuento=monto*0.05;
                    break;
                case 'Y':
                    descuento=monto*0.08;
                    break;
                case 'S': 
                    descuento=monto*0.1;
                    break;
                case 'O':
                    descuento=monto*0.02;
                    break;
                default:
                    System.out.println("La marca ingresada es incorrecta...");
            }
            montoFinal=monto-descuento;
            System.out.println("\tREPORTE DE PAGO\n");
            System.out.printf("El monto de la moto es: S/. %.2f %n", monto);
            System.out.printf("El descuento de la moto es: S/. %.2f %n", descuento);
            System.out.printf("El monto final de la moto es: S/. %.2f %n", montoFinal);
        }
    }
    
}
