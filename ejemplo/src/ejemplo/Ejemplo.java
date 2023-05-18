/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo;

import java.util.Scanner;

/**
 *
 * @author billy
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número N: ");
        int n = sc.nextInt();
        double sum = 0;
        int signo = 1;
        for (int i = 1; i <= 30; i++) {
            double termino = 1.0 / ((2 * i) - 1);
            sum += signo * termino;
            signo = -signo;
            //System.out.println(termino+" -- "+signo);
            //System.out.println("------");
            //System.out.println(sum);
        }
        //sum *= n;
        System.out.println("La suma de los primeros 30 términos de la serie multiplicado por N es: " + sum);
    }

}
