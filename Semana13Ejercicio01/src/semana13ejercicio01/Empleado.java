
package semana13ejercicio01;

/**
 *
 * @author billy
 */
public class Empleado {
    private String nombre;//Apellidos y nombres
    private String dni;
    private int edad;//De 18-45 años
    private boolean casado;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, String dni, int edad, 
            boolean casado, double salario) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }
    
    public void clasificacion(){
        if(this.edad<=21)
            System.out.println("Principiante...");
        else
            if(this.edad<=35)
                System.out.println("Intermedio...");
            else
                System.out.println("Senior...");
    }
    
    public void incrementarSalario(int porcentaje){
        this.salario*=(porcentaje/100.00);
        System.out.println("Incremento efectuado...");
    }

    @Override
    public String toString() {
        return "Empleado{" + "\n\tnombre=" + nombre + 
                "\n\tdni=" + dni + 
                "\n\tedad=" + edad + 
                "\n\tcasado=" + casado + 
                "\n\tsalario=" + salario +"\n\t\t"+ '}';
    }
    
    
}
