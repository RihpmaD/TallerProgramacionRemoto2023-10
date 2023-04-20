
package semana04ejercicio03;

import java.util.Scanner;

/**
 *
 * @author billy
 */
public class Semana04Ejercicio03 {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char modelo=' ', color=' ';
        double precio=0.0, montoEdad=0.0, montoPermiso=0.0, total=0.0;
        int edad, permiso;
        System.out.println("\t\tSISTEMA DE VENTAS DE SEGUROS\n");
        System.out.println("MODELO\tCOLOR\t\tPRECIO");
        System.out.println("--------------------------------------");
        System.out.println("   \t[B]BLANCO\t\tS/ 240.41");
        System.out.println("[A]\t[M]METALIZADO\t\tS/ 330.00");
        System.out.println("   \t[O]OTROS\t\tS/ 270.50");
        System.out.println("--------------------------------------");
        System.out.println("   \t[B]BLANCO\t\tS/ 300.00");
        System.out.println("[B]\t[M]METALIZADO\t\tS/ 360.50");
        System.out.println("   \t[O]OTROS\t\tS/ 230.00");
        System.out.println("--------------------------------------\n");
        System.out.print("Ingrese la edad del conductor: ");
        edad=sc.nextInt();
        System.out.print("Ingrese el tiempo del permiso: ");
        permiso=sc.nextInt();
        if(edad>0 && permiso>0){
            System.out.print("Ingrese el modelo del vehiculo: ");
            modelo=sc.next().toUpperCase().charAt(0);
            System.out.print("Ingrese el color del vehiculo: ");
            color=sc.next().toUpperCase().charAt(0);
            switch(modelo){
                case 'A':
                    switch(color){
                        case 'B':
                            precio=240.41;
                            if(edad<26)
                                montoEdad=precio*1.25;
                            else{
                                if(edad<30)
                                    montoEdad=precio*1.10;
                                else{
                                    if(edad<65)
                                        montoEdad=precio;
                                    else
                                        montoEdad=precio*1.10;
                                }
                            }
                            if(permiso<2){
                                montoPermiso=montoEdad*1.25;
                                total=montoPermiso;
                            }
                            else
                                total=montoEdad;
                            break;
                        case 'M':
                            precio=330;
                            if(edad<26)
                                montoEdad=precio*1.25;
                            else{
                                if(edad<30)
                                    montoEdad=precio*1.10;
                                else{
                                    if(edad<65)
                                        montoEdad=precio;
                                    else
                                        montoEdad=precio*1.10;
                                }
                            }
                            if(permiso<2){
                                montoPermiso=montoEdad*1.25;
                                total=montoPermiso;
                            }
                            else
                                total=montoEdad;
                            break;
                        case 'O':
                            precio=270.50;
                            if(edad<26)
                                montoEdad=precio*1.25;
                            else{
                                if(edad<30)
                                    montoEdad=precio*1.10;
                                else{
                                    if(edad<65)
                                        montoEdad=precio;
                                    else
                                        montoEdad=precio*1.10;
                                }
                            }
                            if(permiso<2){
                                montoPermiso=montoEdad*1.25;
                                total=montoPermiso;
                            }
                            else
                                total=montoEdad;
                            break;
                        default:
                            System.out.println("El valor ingresado es incorrecto...");
                            total=0;    
                    }
                    break;
                case 'B':
                    switch(color){
                        case 'B':
                            precio=300;
                            if(edad<26)
                                montoEdad=precio*1.25;
                            else{
                                if(edad<30)
                                    montoEdad=precio*1.10;
                                else{
                                    if(edad<65)
                                        montoEdad=precio;
                                    else
                                        montoEdad=precio*1.10;
                                }
                            }
                            if(permiso<2){
                                montoPermiso=montoEdad*1.25;
                                total=montoPermiso;
                            }
                            else
                                total=montoEdad;
                            break;
                        case 'M':
                            precio=360.50;
                            if(edad<26)
                                montoEdad=precio*1.25;
                            else{
                                if(edad<30)
                                    montoEdad=precio*1.10;
                                else{
                                    if(edad<65)
                                        montoEdad=precio;
                                    else
                                        montoEdad=precio*1.10;
                                }
                            }
                            if(permiso<2){
                                montoPermiso=montoEdad*1.25;
                                total=montoPermiso;
                            }
                            else
                                total=montoEdad;
                            break;
                        case 'O':
                            precio=330;
                            if(edad<26)
                                montoEdad=precio*1.25;
                            else{
                                if(edad<30)
                                    montoEdad=precio*1.10;
                                else{
                                    if(edad<65)
                                        montoEdad=precio;
                                    else
                                        montoEdad=precio*1.10;
                                }
                            }
                            if(permiso<2){
                                montoPermiso=montoEdad*1.25;
                                total=montoPermiso;
                            }
                            else
                                total=montoEdad;
                            break;
                        default:
                            System.out.println("El valor ingresado es incorrecto...");
                            total=0;    
                    }
                    break;
                default:
                    System.out.println("El valor ingresado es incorrecto...");
                    total=0;
            }
        }else
            System.out.println("Datos ingresados incorrectos...");
        System.out.println("\nREPORTE DE PAGO\n");
        System.out.println("Edad del conductor: "+edad);
        System.out.println("Tiempo del permiso de conducir: "+permiso);
        System.out.println("Modelo del vehiculo:"+modelo);
        System.out.println("Color del vehiculo: "+color);
        System.out.printf("Precio del seguro: S/. %.2f %n",precio);
        System.out.printf("Incremento por la edad: S/. %.2f%n",montoEdad);
        System.out.printf("Incremento por el permiso: S/. %.2f %n",montoPermiso);
        System.out.printf("Monto total a pagar: S/. %.2f %n %n",total);
    }
    
}
