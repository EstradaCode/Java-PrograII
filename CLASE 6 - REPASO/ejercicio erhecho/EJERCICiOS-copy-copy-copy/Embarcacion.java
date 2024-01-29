public class Embarcacion extends Vehiculo {
    private String Rey;
    private String nombre;
    private String tipo;
    private double eslora;
    private double tonelaje;
    private double valor;
    public Embarcacion(){
        
    }
    public Embarcacion(int año,double importe,Propietario propietario, String Rey,String nombre,String tipo,double eslora,double tonelaje,double valor){
        super(año,importe,propietario);
        this.setRey(Rey);
        this.setNombre(nombre);
        this.setTipo(tipo);
        this.setEslora(eslora);
        this.setTonelaje(tonelaje);
        this.setValor(valor);
    }
    public void setRey(String Rey){
        this.Rey=Rey;
    }
    public void setNombre( String nombre){
        this.nombre=nombre;
    }
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    public void setEslora(double eslora){
        this.eslora=eslora;
    }
    public void setTonelaje(double tonelaje){
        this.tonelaje= tonelaje;
    }
    public void setValor(double valor){
        this.valor=valor;
    }
    public String getRey(){
        return Rey;
    }
    public String getNombre(){
        return nombre;
    }
    public String getTipo(){
        return tipo;
    }
    public double getEslora(){
        return eslora;
    }
    public double getTonelaje(){
        return tonelaje;
    }
    public double getValor(){
        return valor;
    }
    public double calcularCostosImpuestos(){
        double costo=0;
        if( valor <= 6000){ costo= valor * 4 /100;
        } else if((valor >6000) && (valor <= 180000)){
            costo= valor*2/100;} else if( valor > 180000){
                costo=valor*5/100;}
        costo+=costo; // impuesto semestral = impuesto*2 al año;
        return costo;        
    }
}