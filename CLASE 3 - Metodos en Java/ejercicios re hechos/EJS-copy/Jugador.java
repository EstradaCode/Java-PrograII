public class Jugador {
    private String nombre;
    private int DNI;
    private int edad;
    private int partidosJugados;
    private int golesAnotados;
    
    public Jugador(String unNombre, int unDNI, int unaEdad){
        nombre = unNombre;
        DNI = unDNI;
        edad = unaEdad; 
    }
    
    public Jugador(){
     
    }

    public int getDNI() {
        return DNI;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }
    public int getPartidosJugados(){
        return partidosJugados;
    }
    public int getGolesAnotados(){
        return golesAnotados;
    }
    public void setDNI(int unDNI) {
        DNI = unDNI;
    }

    public void setEdad(int unaEdad) {
        edad = unaEdad;
    }
    public void setGolesAnotados(int goles){
        golesAnotados= goles;
    }
    public void setPartidosJugados(int partidos){
        partidosJugados = partidos;
    }
    public void setNombre(String unNombre) {
        nombre = unNombre;
    }
        
    public String toString(){
        String aux; 
        aux = "Mi nombre es " + nombre + ", mi DNI es " + DNI + " y tengo " + edad + " años" + "cantidad de partidos Jugados " + partidosJugados + "goles anotados " + golesAnotados;
        return aux;
    }
    
    
    
    
}
