
package semana11ejercicio01;

import java.util.Scanner;

/**
 *
 * @author billy
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int filas;
        double mas50=0, menos50=0;
        double consumos[][];
        String nombres[];
        System.out.println("\n\t\tSISTEMA DE VENTAS\n\tDEFINIR DIMENSION\n");
        do{
            System.out.print("Ingresa la cantidad de consumidores: ");
            filas=sc.nextInt();
            if(filas<=0)
                System.out.println("Cantidad ingresada incorrecta...");
        }while(filas<=0);
        sc.nextLine();
        consumos=new double[filas][3];
        nombres=new String[filas];
        System.out.println("\n\tINGRESO DE DATOS\n");
        for(int i=0;i<consumos.length;i++){
            do{
                System.out.print("Ingrese el nombre ["+(i+1)+"]: ");
                nombres[i]=sc.nextLine();
                if(!nombres[i].matches("[a-z A-Z]*"))
                    System.out.println("Nombre ingresado incorrecto...");
            }while(!nombres[i].matches("[a-z A-Z]*"));
            consumos[i][0]=Math.random()*100+1;
            if(consumos[i][0]>50){
                consumos[i][1]=0.20*consumos[i][0];
                mas50+=(consumos[i][0]-consumos[i][1]);
            }
            else{
                consumos[i][1]=0;
                menos50+=(consumos[i][0]-consumos[i][1]);
            }
            consumos[i][2]=consumos[i][0]-consumos[i][1];
        }
        System.out.println("\n\tREPORTE DE CONSUMOS\n");
        System.out.println("NOMBRES\t\t\tCONSUMO\t\tDESCUENTO\tTOTAL");
        System.out.println("----------------------------------------------------");
        for(int i=0;i<consumos.length;i++){
            System.out.printf("%s \t\t", nombres[i]);
            System.out.printf("S/. %.2f \t", consumos[i][0]);
            System.out.printf("S/. %.2f \t", consumos[i][1]);
            System.out.printf("S/. %.2f %n", consumos[i][2]);
        }
        System.out.println("----------------------------------------------------");
        System.out.printf("El Monto total de los que "
                + "consumieron mas de S/.50.00 es: S/.%.2f %n",mas50);
        System.out.printf("El monto total de los que "
                + "consumieron menos de S/.50.00 es: S/.%.2f",menos50);
    }
}
