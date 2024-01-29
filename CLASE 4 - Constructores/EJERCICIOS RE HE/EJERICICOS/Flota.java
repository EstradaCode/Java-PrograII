public class Flota{
    private static final int cant=15;
    private Micro micros[];
    private int cantMicros;
    

public Flota(){
    micros= new Micro[cant];
    this.cantMicros=0;
}
public boolean getFlotaCompleta(){
    boolean completo= true;
    for (int i=0; i<micros.length; i++){
         if ( micros[i]== null){
             completo= false;
         }
    }
    return completo;
}
public void agregarMicro(Micro micro){
    this.micros[cantMicros]= micro;
    this.cantMicros++;
}
public void eliminarMicro(String patente){
    for (int i=0; i< micros.length; i++){
        if( micros[i].getPatente() == patente){
            micros[i] = null;
            
        }
    }
}
public Micro buscarMicroP(String patente){
    Micro micro= new Micro();
    for (int i=0; i< micros.length; i++){
        if(micros[i].getPatente()==patente){
            micro= micros[i];
    }
    }
    return micro;
}
public Micro buscarMicroD(String destino){
    Micro micro= new Micro();
    for (int i=0; i< micros.length; i++){
        if(micros[i].getDestino()==destino){
            micro= micros[i];
    }
    }
    return micro;
}

}