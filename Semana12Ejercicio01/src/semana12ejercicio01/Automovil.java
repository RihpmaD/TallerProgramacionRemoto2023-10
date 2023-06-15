
package semana12ejercicio01;

/**
 *
 * @author billy
 */
public class Automovil {
    private String marca;//nombre del fabricante
    private int modelo;//año de fabricacion
    private double motor;//cilindraje del motor en litros
    private int tipoCombustible;//1.gasolina, 2.bioetanol, 3.diesel, 4.biodiesel, 5.gas natural
    private char tipoAutomovil;//c.carro de ciudad, s.subcompacto, t.compacto, f.familiar, e.ejecutivo, v.SUV
    private int numPuertas;//numero de puertas
    private int cantAsientos;//cantidad de asientos
    private double velocidadMaxima;//velocidad máxima en Km/h
    private String color;//blanco, negro, rojo, naranja, amarillo, verde, azul, violeta
    private double velocidadActual;//velocidad en ese momento

    public Automovil(String marca, int modelo, double motor, int tipoCombustible, char tipoAutomovil, int numPuertas, int cantAsientos, double velocidadMaxima, String color, double velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numPuertas = numPuertas;
        this.cantAsientos = cantAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.velocidadActual = velocidadActual;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public int getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(int tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public char getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(char tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    
    public void velocidad(double velocidad){
        if(velocidad<0)
            System.out.println("Error al ingresar la velocidad...");
        else{
            if(velocidad==0){
                System.out.println("Acaba de frenar el coche...");
                this.velocidadActual=0;
            }else{
                if(velocidad<this.velocidadActual){
                    System.out.println("Usted esta desacelerando...");
                    this.velocidadActual=velocidad;
                }else{
                    if(velocidad>this.velocidadActual && velocidad<this.velocidadMaxima){
                        System.out.println("Usted esta acelerando...");
                        this.velocidadActual=velocidad;
                    }else{
                        System.out.println("Usted no puede pasar la velocidad maxima...");
                    }
                }
            }
        }
    }
    
    public double tiempoEstimado(double distancia){
        if(distancia<=0){
            System.out.println("La distancia ingresada es incorrecta...");
            return 0;
        }
        else
            return distancia/this.velocidadActual;
    }
    
    public void mostrarInformacion(){
        System.out.println("\tV. MÁXIMA\tV. ACTUAL\tMODELO");
        System.out.printf("\t%.2f, \t%.2f, \t%d %n", this.velocidadMaxima,
                this.velocidadActual, this.modelo);
    }
}
