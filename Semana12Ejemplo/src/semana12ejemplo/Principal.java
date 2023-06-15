
package semana12ejemplo;

import java.util.Scanner;

/**
 *
 * @author billy
 */
public class Principal {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nombre;
        int edad;
        double pension;
        System.out.println("CONSTRUIR UN OBJETO");
        do{
            System.out.print("Ingrese un nombre: ");
            nombre=sc.nextLine();
            if(!nombre.matches("[a-z A-Z]*"))
                System.out.println("Nombre ingresado incorrecto...");
        }while(!nombre.matches("[a-z A-Z]*"));
        do{
            System.out.print("Ingrese la edad: ");
            edad=sc.nextInt();
            if(edad<=0 || edad>120)
                System.out.println("Edad ingresada incorrecta...");
        }while(edad<=0 || edad>120);
        do{
            System.out.print("Ingrese su pension: ");
            pension=sc.nextDouble();
            if (pension<=0 || pension>1000)
                System.out.println("El monto ingresado es incorrecto...");
        }while(pension<=0 || pension>1000);
        Estudiante estudiante01=new Estudiante(nombre, edad, pension);
        System.out.println("El nombre es: "+estudiante01.nombre);
        System.out.println("La edad del estudiante es: "+estudiante01.edad);
        System.out.println("La pesnion del estudiante es: "+estudiante01.getPension());
        estudiante01.nombre="Maria Garcia";
        estudiante01.edad=40;
        estudiante01.setPension(500);
        System.out.println("\nEl nombre es: "+estudiante01.nombre);
        System.out.println("La edad del estudiante es: "+estudiante01.edad);
        System.out.println("La pesnion del estudiante es: "+estudiante01.getPension());
    }
    
}
