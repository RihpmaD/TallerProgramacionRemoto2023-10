
package semana03.ejercicio04;

import java.util.Scanner;

/**
 *
 * @author billy
 */
public class Semana03Ejercicio04 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char zona;
        double consumo, monto=0;
        System.out.println("\t\tSISTEMA DE LUZ DEL SUR\n");
        System.out.println("Zona Comercial - [C]");
        System.out.println("Zona Residencial - [R]");
        System.out.println("-----------------------\n");
        System.out.print("Ingrese la zona: ");
        zona=sc.next().charAt(0);
        System.out.print("Ingrese el consumo en Kw: ");
        consumo=sc.nextDouble();
        if(zona=='C' || zona=='c'){
            if(consumo<=100){
                monto=0.75*consumo+50;
            }else{
                monto=0.90*(consumo-100)+125;
            }
        }else{
            if(zona=='R' || zona=='r'){
                if(consumo<=100){
                    monto=0.30*consumo+25;
                }else{
                    monto=0.70*(consumo-100)+55;
                }
            }else
                System.out.println("La zona ingresada es incorrecta...");
        }
        System.out.println("\nRESULTADO");
        System.out.printf("El monto total a pagar es: S/.%.2f %n", monto);
    }
    
}
