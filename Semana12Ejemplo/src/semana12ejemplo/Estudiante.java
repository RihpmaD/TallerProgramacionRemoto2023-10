
package semana12ejemplo;

/**
 *
 * @author billy
 */
public class Estudiante {
    
    public String nombre;//Atributo de Instancia
    protected int edad;//Atributo de clase
    private double pension;
    
    public Estudiante(String nombre, int edad, double pension){
        this.nombre=nombre;
        this.edad=edad;
        this.pension=pension;
    }
    
    public double getPension(){
        return this.pension;
    }
    
    public void setPension(double pension){
        this.pension=pension;
    }
}
