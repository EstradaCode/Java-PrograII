public class Entrenador {
    private String nombre;
    private double sueldo;
    private int campeonatosGanados; 
    
    public Entrenador(String unNombre, double unSueldo, int campeonatosG){
        this.nombre = unNombre;
        this.sueldo= unSueldo;
        this.campeonatosGanados = campeonatosG; 
    }
    
    public Entrenador(){
     
    }

    public double getSueldo() {
        return sueldo;
    }

    public int getcampeonatosGanados() {
        return campeonatosGanados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setSueldo(double unSueldo) {
        sueldo = unSueldo;
    }

    public void setCampeonatosGanados(int campeonatosG) {
        campeonatosGanados = campeonatosG;
    }

    public void setNombre(String unNombre) {
        nombre = unNombre;
    }
    public double CalcularSueldoACobrar(){
        double sueldoF;
        if( campeonatosGanados == 0){
            sueldoF = sueldo;
        }else if ( campeonatosGanados <= 4){
            sueldoF= sueldo + 5000;
        } else if(( campeonatosGanados >= 5) && ( campeonatosGanados < 10)){
            sueldoF= sueldo + 30000;
        } else {
            sueldoF= sueldo + 50000;
        }
        return sueldoF;
    }
    public String toString(){
        String aux;
        aux= "nombre: " + nombre + "-"+ "sueldo basico" + sueldo + "campeonatos Ganados" + campeonatosGanados;
        return aux;
    }
}
