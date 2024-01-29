
public class Embarcacion extends Vehiculo{
    private String rey;
    private String nombre;
    private String tipoEmbarcacion;
    private int eslora;
    private double tonelaje;
    private double valor;
    public Embarcacion(String rey, String nombre, String tipoEmbarcacion, int eslora, double tonelaje, double valor,int año, Propietario propietario, double importe){
       super(año,propietario,importe);
       this.setRey(rey);
       this.setNombre(nombre);
       this.setTipoEmbarcacion(tipoEmbarcacion);
       this.setEslora(eslora);
       this.setTonelaje(tonelaje);
       this.setValor(valor);
    }
    public Embarcacion(){
        
    }
    public void setRey(String rey){
        this.rey=rey;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setTipoEmbarcacion( String tipo){
        this.tipoEmbarcacion=tipo;
    }
    public void setEslora(int eslora){
        this.eslora=eslora;
    }
    public void setTonelaje(double tonelaje){
        this.tonelaje=tonelaje;
    }
    public void setValor(double valor){
        this.valor=valor;
    }
    public String getRey(){
        return rey;
        }
    public String getNombre(){
        return nombre;
    }
    public String getTipoEmbarcacion(){
        return tipoEmbarcacion;
    }
    public int getEslora(){
        return eslora;
    }
    public double getTonelaje(){
        return tonelaje;
    }
    public double getValor(){
        return valor;
    }
    public double calcularImpuestos(){
       double impuesto=0;
        if(getValor()> 6000.00){
           impuesto = ((4/100)* getValor());
       }else if ((getValor()> 6000.00) & (getValor()< 180000.00)){
           impuesto=((2/100)*getValor());    
       } else if(getValor()>180000.00){
           impuesto=(5/100)*getValor();
       }
       return impuesto;
    }
    
    
    
}