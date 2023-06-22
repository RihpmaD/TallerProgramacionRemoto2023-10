
package semana13ejercicio01;

/**
 *
 * @author billy
 */
public class Programador extends Empleado{
    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;

    public Programador() {
    }

    public Programador(int lineasDeCodigoPorHora, String lenguajeDominante) {
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }

    public Programador(int lineasDeCodigoPorHora, String lenguajeDominante, 
            String nombre, String dni, int edad, boolean casado, 
            double salario) {
        super(nombre, dni, edad, casado, salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }

    @Override
    public String toString() {
        return super.toString()+"\nProgramador{" + 
                "\n\tLineas De Codigo Por Hora=" + lineasDeCodigoPorHora + 
                "\n\tLenguaje Dominante=" + lenguajeDominante + "\n\t\t\t"+'}';
    }
    
    
}
