
package semana06ejercicio04;

import java.util.Scanner;

/**
 *
 * @author billy
 */
public class Semana06Ejercicio04 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char turno;//D-Diurno N-Nocturno
        int horas, cantidad=1;//Personal
        double total=0, totalPlanilla=0;
        int acuHoras=0, maxHoras=0, minHoras=100;//Global
        System.out.println("\t\tREGISTRO DE PAGOS\n");
        while(cantidad<=5){
            System.out.println("\tTRABAJADOR "+cantidad);
            System.out.print("Ingrese la cantidad de horas: ");
            horas=sc.nextInt();
            System.out.print("Ingrese el turno trabajado: ");
            turno=sc.next().toUpperCase().charAt(0);
            switch(turno){
                case 'D':
                    total=horas*10;
                    break;
                case 'N':
                    total=horas*20;
            }
            cantidad++;
            acuHoras+=horas;
            totalPlanilla+=total;
            if(horas>maxHoras)
                maxHoras=horas;
            if(horas<minHoras)
                minHoras=horas;
            System.out.println("\n\tREPORTE DE PAGO");
            System.out.println("Horas trabajas: "+horas);
            if(horas<15)
                System.out.println("Estado: DESPEDIDO");
            else
                System.out.println("Estado: CONTRATADO");
            System.out.printf("Monto a pagar: S/.%.2f%n", total);
            System.out.println("----------------------------------------");
        }
        System.out.println("\n\tREPORTE FINAL DE PLANILLA");
        System.out.println("Cantidad total de horas: "+acuHoras);
        System.out.println("Hora máxima trabajada: "+maxHoras);
        System.out.println("Hora mínima trabajada: "+minHoras);
        System.out.printf("El pago total de la planilla: S/.%.2f%n", totalPlanilla);
    }
    
}
