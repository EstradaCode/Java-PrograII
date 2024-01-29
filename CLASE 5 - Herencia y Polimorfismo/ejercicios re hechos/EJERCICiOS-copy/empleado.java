public abstract class empleado{
    private String nombre;
    private int edad;
    private double sueldo;
public empleado(String nombre, int edad, double sueldo){
    this.setNombre(nombre);
    this.setEdad(edad);
    this.setSueldo(sueldo);
}
public empleado(){
    
}
public void setNombre(String nombre){
    this.nombre=nombre;
}
public void setEdad(int edad){
    this.edad=edad;
}
public void setSueldo(double sueldo){
    this.sueldo=sueldo;
}
public String getNombre(){
    return this.nombre;
}
public int getEdad(){
    return this.edad;
}
public double getSueldo(){
    return this.sueldo;
}
public abstract double calcularSueldoACobrar();
public String toString(){
    String aux;
    aux= "nombre " + this. nombre + "sueldo "+ this.sueldo;
    return aux;
}
}
