
package semana08ejercicio03;

import java.util.Scanner;

/**
 *
 * @author billy
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double sum = 0;
        System.out.println("\n\t\tSISTEMA DE SERIES\n");
        do {
            System.out.print("Ingrese la cantidad de elementos: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("El valor ingresado es incorrecto...");
            }
        } while (n <= 0);
        for(int i=1;i<=n;i++){
            if(i%2==0 && i!=n){
                sum-=(1/(2.0*i-1));
                System.out.print("1/(2.0*"+i+"-1) + ");
            }
            else
                if(i%2!=0 && i!=n){
                    sum+=(1/(2.0*i-1));
                    System.out.print("1/(2.0*"+i+"-1) - ");
                }else
                    if(i%2==0 && i==n){
                        sum-=(1/(2.0*i-1));
                        System.out.print("1/(2.0*"+i+"-1) = ");
                    }else{
                        sum+=(1/(2.0*i-1));
                        System.out.print("1/(2.0*"+i+"-1) = ");
                    }
        }
        System.out.printf("%.4f %n",sum);
    }
    
}
