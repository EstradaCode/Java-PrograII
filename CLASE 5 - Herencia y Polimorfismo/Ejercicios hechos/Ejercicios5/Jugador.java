
public class Jugador extends Empleado{
    private int partidosJugados;
    private int goles;
    public Jugador(String unNombre,int dni, int edad, double sueldo, int partidos,int goles){
     super(unNombre,dni,edad,sueldo);
     partidosJugados = partidos;
     this.goles = goles;
    }
    public Jugador(){
        
    }
    public int getPartidosJugados(){
        return partidosJugados;
    }
    public int getGoles(){
        return goles;
    }
    public void setPartidosJugados(int partidos){
        partidosJugados=partidos;
    }
    public void setGoles (int goles){
        this.goles=goles;
    }
    public double calcularSueldoACobrar(){
        double promedio = (goles/partidosJugados); double plus=0;
        if( promedio > 0.5){
            plus = (super.getSueldoBasico());
        }
        return (super.getSueldoBasico() + plus);
    }
    public String toString(){
        String aux; 
        aux = super.toString();
        return aux;
    }
}

