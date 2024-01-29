public abstract class Empleado{
    private String nombre;
    private int dni;
    private int edad;
    private double sueldoBasico;
    public Empleado(String nombre, int dni, int edad, double sueldoB){
        this.setNombre(nombre);
        this.setDni(dni);
        this.setEdad(edad);
        this.setSueldoBasico(sueldoB);
    }
    public Empleado(){
        
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getDni(){
        return this.dni;
    }
    public int getEdad(){
        return this.edad;
    }
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setDni(int dni){
        this.dni=dni;
    }
    public void setEdad (int edad){
        this.edad=edad;
    }
    public void setSueldoBasico(double sueldoB){
        this.sueldoBasico=sueldoB;
    }
    @Override
    public String toString(){
        String aux; 
        aux = "nombre" + getNombre() + "Sueldo a Cobrar: " + calcularSueldoACobrar(); ;
        return aux;
    }
    abstract double calcularSueldoACobrar();
 
}