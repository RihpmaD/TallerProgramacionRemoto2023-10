package semana13ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author billy
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, dni;
        int edad = 20;
        boolean casado=true;
        double salario;
        Empleado listaEmpleado[] = new Empleado[2];
        System.out.println("\t\tMANEJO DE EMPLEADOS");
        for (int i = 0; i <= listaEmpleado.length; i++) {
            System.out.println("\n\tEMPLEADO " + (i + 1));
            do {
                System.out.print("Ingrese el nombre completo: ");
                nombre = sc.nextLine();
                if (!nombre.matches("[a-z A-Z]*")) {
                    System.out.println("El nombre contiene caracteres no validos...");
                }
            } while (!nombre.matches("[a-z A-Z]*"));
            do {
                System.out.print("Ingrese el numero de dni: ");
                dni = sc.nextLine();
                if (!dni.matches("[0-9]{8}")) {
                    System.out.println("El DNI contiene caracteres no validos...");
                }
            } while (!dni.matches("[0-9]{8}"));
            try {
                do {
                    System.out.print("Ingrese la edad: ");
                    edad = sc.nextInt();
                    if (edad < 18 || edad > 45) {
                        System.out.println("Edad ingresada fuera de intervalo 18-45...");
                    }
                } while (edad < 18 || edad > 45);
            } catch (InputMismatchException e) {
                System.out.println("La edad ingresada no es un numero...");
                edad = 20;
            } finally{
                System.out.println("Edad registrada...");
            }
            sc.nextLine();
            try {
                do {
                    System.out.print("Esta casado (true-false): ");
                    casado = sc.nextBoolean();
                    if (casado != true && casado != false) {
                        System.out.println("El estado civil es incorrecto...");
                    }
                } while (casado != true && casado != false);
            } catch (InputMismatchException e) {
                System.out.println("El valor ingresado al estado civil es incorrecto...");
            }
            sc.nextLine();
            salario = Math.random() * 1300 + 100;
            try{
                listaEmpleado[i] = new Empleado(nombre, dni, edad, casado, salario);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("No puedes agregar más registros...");
            }
            
        }
    }

}
