public class Micro{
    private static final int cant=20;
    private String patente;
    private String destino;
    private String hSalida;
    private boolean Asientos[];
    private int asientosOcupados;
public Micro(String patente, String destino, String hSalida){
    this.setPatente(patente);
    this.setDestino(destino);
    this.setHSalida(hSalida);
    this.Asientos = new boolean [cant];
    for (int i=0; i<20; i++){
        Asientos[i]= true;
    }
    this.asientosOcupados=0;
}
    public Micro(){
    
}
public void setPatente(String patente){
    this.patente= patente;
}
public void setDestino(String destino){
    this.destino=destino;
}
public void setHSalida(String hSalida){
    this.hSalida= hSalida;
}
public String getPatente(){
    return patente; }
public String getDestino(){
    return destino;
}
public String getHSalida(){
    return hSalida;
}
public int devolverAsientosOcupados(){
    return this.asientosOcupados;
}
public boolean MicroLleno(){
    boolean lleno= true; int i=0;
    while((lleno != false) &&( i<Asientos.length)){ 
        if( Asientos[i] == true){
            lleno = false;
        }
        i++;
    }
    return lleno;
}
public boolean noestaOcupado(int num){
    if  (Asientos[num]== true) {
        return true;
    } else{ 
        return false;
    }
}
public boolean validarNumAsiento(int num){
    if (( num>=0) && ( num < 20)){
     return true;   
    } else{
        return false;
    }
}
public boolean ocuparAsiento(int num){
    if(noestaOcupado(num)){
        Asientos[num]= false;
        this.asientosOcupados++;
        return true;
    } else{
        return false;
    }
    
}
public boolean liberarAsiento(int num){
    if(!noestaOcupado(num)){
        Asientos[num]= true;
        this.asientosOcupados--;
        return true;
    } else{
        return false;
    }
}
public int AsientoLibre(){
    boolean corte= true; int asiento=-1,i=0;
    while(( corte != false) &&( i<Asientos.length)){ 
        if( Asientos[i] == true){
            corte = false;
            asiento= i;
        }
        i++;
    }
    return asiento;
}
}

