public class Jugadores extends empleado{
    private int partidos;
    private int goles;
public Jugadores(String nombre, int edad, double sueldo, int partidos, int goles){
    super(nombre,edad,sueldo);
    this.setPartidos(partidos);
    this.setGoles(goles);
}
public Jugadores(){
    
}
public void setPartidos(int partidos){
    this.partidos=partidos;
}
public void setGoles(int goles){
    this.goles=goles;
}
public int getPartidos(){
    return this.partidos;
}
public int getGoles(){
    return this.goles;
}
public double calcularSueldoACobrar(){
    double sueldoF=0;
    double promedio= goles/partidos;
    if( promedio> 0.5){
        sueldoF= super.getSueldo()*2;
    }
    return sueldoF;
}
public String toString(){
    String aux;
    aux= super.toString() + "partidos jugados" + this.partidos + "goles anotados" + this.goles;
    return aux;
}
}
