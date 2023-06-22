
package semana13ejercicio01;

/**
 *
 * @author billy
 */
public class Principal {

    public static void main(String[] args) {
        Programador programador1=new Programador(50, "Java");
        System.out.println("Empleado 1\n"+programador1);
        System.out.print("clasificacion: ");
        programador1.clasificacion();
        Programador programador2=new Programador(100, "C++", "Juan Perez", "12345678", 35, true, 3200);
        System.out.println("Empleado 2\n"+programador2);
        System.out.print("clasificacion: ");
        programador2.clasificacion();
    }
    
}
