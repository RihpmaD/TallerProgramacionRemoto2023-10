
package semana09ejercicio05;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fibonacci[];
        int tam;
        do {
            System.out.print("Ingrese el termino a calcular: ");
            tam = sc.nextInt();
            if (tam <= 0) {
                System.out.println("El termino ingresado es incorrecto...");
            }
        } while (tam <= 0);
        fibonacci = new int[tam];//Creación con variable
        if(tam==1)
            fibonacci[0]=1;
        if(tam==2){
            fibonacci[0]=1;
            fibonacci[1]=1;
        }
        if(tam>2){
            fibonacci[0]=1;
            fibonacci[1]=1;
            for(int i=2;i<fibonacci.length;i++){
                fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
            }
        }
        System.out.println("\nSERIE FIBONACCI");
        for(int i=0;i<fibonacci.length;i++){
            if(i!=tam-1)
                System.out.print(fibonacci[i]+" | ");
            else
                System.out.println(fibonacci[i]+"\n");
        }
    }
    
}
