public class Entrenador {
    private String nombre;
    private double sueldoBasico;
    private int campeonatosGanados; 
    
    public Entrenador(String unNombre, double sueldo, int campeonatos){
        nombre = unNombre;
        sueldoBasico = sueldo;
        campeonatosGanados = campeonatos; 
    }
    
    public Entrenador(){
     
    }

    public double getsueldoBasico() {
        return sueldoBasico;
    }

    public double getcampeonatosGanados() {
        return campeonatosGanados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setsueldoBasico(double sueldo) {
        sueldoBasico = sueldo;
    }

    public void setcampeonatosGanados(int campeonatos) {
        campeonatosGanados = campeonatos;
    }

    public void setNombre(String unNombre) {
        nombre = unNombre;
    }
    
    public double calcularSueldoACobrar (){
        int plus=0;
        if ((campeonatosGanados >= 1) && ( campeonatosGanados <= 4)){
            plus = 5000;}
        if((campeonatosGanados>=5) &&(campeonatosGanados<=10)){
            plus=30000;
        }
        if((campeonatosGanados>10)){
            plus=50000;
        }
        return (sueldoBasico + plus);
    }
    public String toString(){
        String aux; 
        aux = "entrenador " + nombre + ", sueldo basico " + sueldoBasico
        + " campeonatos ganados " + campeonatosGanados;
        return aux;
    }
    
    
    
    
}
