public class Embarcacion extends Vehiculo {
    private String codigoREY; 
    private String tipoEmb; 
    private String nombre; 
    private double eslora; 
    private double tonelaje; 
    private double valorDec; 
    public Embarcacion(int anioFabri, double impBasico, Propietario pro,
    String codigoREY, String tipoEmb, String nombre, double eslora, double tonelaje, 
    double valorDec){
       super(anioFabri, impBasico, pro); 
       this.setCodigo(codigoREY); 
       this.setTipoEmb(tipoEmb); 
       this.setNombre(nombre); 
       this.setEslora(eslora); 
       this.setTonelaje(tonelaje); 
       this.setValorDec(valorDec); 
    }
    public void setCodigo(String codigoREY){
        this.codigoREY = codigoREY; 
    }
    public void setTipoEmb(String tipoEmb){
        this.tipoEmb = tipoEmb; 
    }
    public void setNombre(String nombre){
        this.nombre = nombre; 
    }
    public void setEslora(double eslora){
        this.eslora = eslora; 
    }
    public void setTonelaje(double tonelaje){
        this.tonelaje = tonelaje; 
    }
    public void setValorDec(double valorDec){
        this.valorDec = valorDec; 
    }
    public String getCodigo (){
        return codigoREY; 
    }
    public String getTipoEmb (){
        return tipoEmb; 
    }public String getNombre (){
        return nombre; 
    }
    public double getEslora (){
        return eslora; 
    }
    public double getTonelaje (){
        return tonelaje; 
    }
    public double getValorDec (){
        return valorDec; 
    }
    public double calcularMontoAPagar(){
        double total = -1; 
        if (getValorDec() <= 6000) {
            total = 4.0/100.0*getValorDec(); 
        } else {
            if (getValorDec() > 6000 && getValorDec() <= 180000) {
                total = 2.0/100.0*getValorDec(); 
            } else {
                if (getValorDec() > 180000) {
                    total = 5.0/100.0*getValorDec(); 
                }
            }
        }
        return total; 
    }
    
    @Override 
    public String toString(){
        return super.toString()+"\n Tipo de Embarcacion: "+getTipoEmb()+"\n Monto total a Pagar: "+calcularMontoAPagar(); 
    }
}
