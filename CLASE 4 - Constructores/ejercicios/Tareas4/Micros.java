public class Micros{
    private String patente;
    private String destino;
    private String horaSalida;
    private boolean[]asientos;
    private int totalAsientos;
    public Micros( String unaPatente, String suDestino, String salida){
        int i;
        patente= unaPatente;
        destino=suDestino;
        horaSalida=salida;
        asientos = new boolean [20];
        totalAsientos=0;
        for (i=0;i< 20;i++){
            asientos[i] = false;
        }
    }
    public String getPatente(){
       return patente; 
    }
    public String getDestino(){
        return destino;
    }
    public String getHoraSalida(){
        return horaSalida;
    }
    public void setPatente(String unaPatente){
        patente=unaPatente;
    }
    public void setDestino(String suDestino){
        destino=suDestino;
    }
    public void setHoraSalida(String salida){
        horaSalida= salida;
    }
    public boolean Microlleno (){
        int i; boolean lleno = true;
        for (i=0; i<20;i++){
            if (asientos[i] == false){
                lleno = false;
            }
        }
        return lleno;
    }
    public boolean validarAsiento (int numAsiento){
        int dimf=20;boolean exito;
        if (numAsiento<=19){
            exito= true;
        } else{
            exito= false;
        }
        return exito;
    }
    public boolean reservarAsiento(int numAsiento){
        boolean exito;
        if((totalAsientos < 20) && (validarAsiento(numAsiento)==true)){
            asientos[numAsiento]= true;
            totalAsientos++;
            exito = true;
        }else{
            exito= false;
        }
        return exito;
    }
    public boolean asientoDisponible (int numAsiento){
        boolean exito;
        if (asientos[numAsiento]== false){
            exito = true;
        } else{
            exito= false;
        }
        return exito;
    }
    public boolean asientoLiberado ( int numAsiento){
        boolean exito;
        if (asientoDisponible(numAsiento)== false){
            asientos[numAsiento]= false;
            totalAsientos--;
            exito= true;
        } else{
            exito= false;
        }
        return exito;
    }
    public int asientoLibre(){
        int i=0, disponible=0; boolean corte= false;
        while ((i<20) && (corte = false)){
            if (asientoDisponible(i) ==true){
                disponible = i;
                corte = true;
            }
        }
        return disponible;
    }
}