
package semana11matrices;

import java.util.Scanner;

/**
 *
 * @author billy
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int filas, columnas;
        int matriz[][];
        System.out.println("\n\t\tSISTEMA DE MATRICES\n\tDEFINIR DIMENSION\n");
        do{
            System.out.print("Ingresa la cantidad de filas: ");
            filas=sc.nextInt();
            if(filas<=0)
                System.out.println("Cantidad ingresada incorrecta...");
        }while(filas<=0);
        do{
            System.out.print("Ingresa la cantidad de columnas: ");
            columnas=sc.nextInt();
            if(columnas<=0)
                System.out.println("Cantidad ingresada incorrecta...");
        }while(columnas<=0);
        matriz=new int[filas][columnas];
        System.out.println("\n\tINGRESO DE VALORES\n");
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                System.out.print("Ingrese valor ["+i+"]["+j+"]: ");
                matriz[i][j]=sc.nextInt();
            }
        }
        System.out.println("\n\tMOSTRAR MATRIZ\n");
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                if(j==matriz[0].length-1)
                    System.out.print(matriz[i][j]+"\n");
                else
                    System.out.print(matriz[i][j]+"\t");
            }
        }
        System.out.println("\n\tDIAGONAL PRINCIPAL\n");
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                if(i==j)
                    System.out.print(matriz[i][j]+" | ");
            }
        }
        System.out.println("");
    }
    
}
