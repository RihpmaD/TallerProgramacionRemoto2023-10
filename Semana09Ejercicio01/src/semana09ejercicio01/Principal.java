package semana09ejercicio01;

import java.util.Scanner;

/**
 *
 * @author billy
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valores[];
        int tam;
        do {
            System.out.print("Ingrese el tamaño del arreglo: ");
            tam = sc.nextInt();
            if (tam <= 0) {
                System.out.println("El tamaño ingresado es incorrecto...");
            }
        } while (tam <= 0);
        valores = new int[tam];//Creación con variable
        //Ingreso de datos
        System.out.println("\nINGRESO DE DATOS");
        for(int i=0;i<valores.length;i++){
            valores[i]=(int)(Math.random()*20)+1;
        }
        System.out.println("Se registraron los valores aleatorios...");
        //Mostrar resultado
        System.out.println("\nVECTOR RESULTANTE");
        for(int i=0;i<valores.length;i++){
            if(i!=tam-1)
                System.out.print(valores[i]+" | ");
            else
                System.out.println(valores[i]+"\n");
        }
    }

}
