public class Entrenador extends Empleado  {
    private int campeonatosGanados; 
    
    public Entrenador(String unNombre,int dni, int edad, double sueldo, int campeonatos){
        super(unNombre,dni,edad,sueldo);
        this.campeonatosGanados = campeonatos; 
    }
    
    public Entrenador(){
     
    }
    
    public double getcampeonatosGanados() {
        return campeonatosGanados;
    }
    
    public void setcampeonatosGanados(int campeonatos) {
        campeonatosGanados = campeonatos;
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
        return (super.getSueldoBasico() + plus);
    }
    public String toString(){
        String aux; 
        aux = super.toString();
        return aux;
    }
    
    
    
    
}
