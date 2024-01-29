public class Entrenadores extends empleado{
    private int campeonatos;
public Entrenadores(String nombre, int edad, double sueldo, int campeonatos){
    super(nombre,edad,sueldo);
    this.setCampeonatos(campeonatos);
}
public Entrenadores(){
    
}
public void setCampeonatos(int campeonatos){
    this.campeonatos=campeonatos;
}
public int getCampeonatos(){
    return this.campeonatos;
}
public double calcularSueldoACobrar(){
        double sueldoF;
        if( campeonatos == 0){
            sueldoF = super.getSueldo();
        }else if ( campeonatos<= 4){
            sueldoF= super.getSueldo() + 5000;
        } else if(( campeonatos >= 5) && ( campeonatos< 10)){
            sueldoF= super.getSueldo() + 30000;
        } else {
            sueldoF= super.getSueldo() + 50000;
        }
        return sueldoF;
    }
    public String toString(){
    String aux;
    aux= super.toString() + "campeonatos ganados: " + this.campeonatos;
    return aux;
}
}