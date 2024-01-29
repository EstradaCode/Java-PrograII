public abstract class Vehiculo {
   private int año;
   private double importe;
   private Propietario propietario;
   
   public Vehiculo (int año, double importe, Propietario propietario){
       this.setPropietario(propietario); 
       this.setImporte(importe); 
       this.setAño(año); 
   }
   
    public void setPropietario(Propietario propietario){
        this.propietario=propietario;
    }
    public void setAño(int año){
        this.año=año;
    }
    public void setImporte(double importe){
        this.importe=importe;
    }
    public int getAño(){
        return año;
    }
    public double getImporte(){
        return importe;
    }
    public Propietario getPropietario(){
        return propietario;
    }  
    public abstract double calcularMontoAPagar(); 
    
    @Override 
    public String toString(){
        return propietario.toString()+" \n Año de Fabricacion: "+getAño(); 
    }
}
