
package semana09ejercicio04;

import java.util.Scanner;

/**
 *
 * @author billy
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valores[], invertido[];
        int tam;
        do {
            System.out.print("Ingrese el tamaño del arreglo: ");
            tam = sc.nextInt();
            if (tam <= 0) {
                System.out.println("El tamaño ingresado es incorrecto...");
            }
        } while (tam <= 0);
        valores = new int[tam];//Creación con variable
        invertido=new int[tam];
        //Ingreso de datos
        System.out.println("\nINGRESO DE DATOS");
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int) (Math.random() * 20) + 1;
        }
        for(int i=0;i<valores.length;i++){
            invertido[i]=valores[valores.length-1-i];
        }
        System.out.println("Se registraron los valores aleatorios...");
        //Mostrar resultado
        System.out.println("\nVECTOR ORIGINAL");
        for(int i=0;i<valores.length;i++){
            if(i!=tam-1)
                System.out.print(valores[i]+" | ");
            else
                System.out.println(valores[i]+"\n");
        }
        System.out.println("VECTOR RESULTANTE");
        for(int i=0;i<invertido.length;i++){
            if(i!=tam-1)
                System.out.print(invertido[i]+" | ");
            else
                System.out.println(invertido[i]+"\n");
        }
    }
    
}
