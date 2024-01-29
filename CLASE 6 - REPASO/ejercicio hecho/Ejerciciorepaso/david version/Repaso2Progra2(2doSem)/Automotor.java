
public class Automotor extends Vehiculo {
    private String patente; 
    private double adicional; 
    private String descripcion; 

    public Automotor(int anioFabri, double impBasico, Propietario pro,
    String patente, double adicional, String descripcion) {
        super(anioFabri,impBasico, pro); 
        this.setPatente(patente); 
        this.setAdicional(adicional); 
        this.setDescripcion(descripcion); 
    }
    
    public void setPatente(String patente){
        this.patente = patente; 
    }
    public void setAdicional(double adicional){
        this.adicional = adicional; 
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion; 
    }
    public String getPatente(){
        return patente; 
    }
    public double getAdicional(){
        return adicional; 
    }
    public String getDescripcion(){
        return descripcion; 
    }
    public double calcularMontoAPagar(){
        return getImporte() + getAdicional(); 
    }
    
    @Override 
    public String toString(){
        return super.toString()+"\n Patente: "+getPatente()+"\n Monto a Pagar: "+calcularMontoAPagar(); 
    }
}
