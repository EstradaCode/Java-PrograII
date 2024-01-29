
public class Automotor extends Vehiculo{
    private String patente;
    private double importeAdicional;
    private String descripcion;
    public Automotor(String patente, double importeAdicional, String descripcion, int año, Propietario propietario, double importe){
        super(año,propietario,importe);
        this.setPatente(patente);
        this.setImporteAdicional(importeAdicional);
        this.setDescripcion(descripcion);
    }
    public Automotor(){
        
    }
    public void setPatente(String patente){
        this.patente=patente;
    }
    public void setImporteAdicional(double importeAdicional){
        this.importeAdicional= importeAdicional;    
    }
    public void setDescripcion (String descripcion){
        this.descripcion=descripcion;
    }
    public String getPatente(){
        return patente;
    }
    public double getImporteAdicional(){
        return importeAdicional;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public double calcularImpuestos(){
        double impuesto = super.getImporte() + importeAdicional;
        return impuesto;
    }
    public String toString(){
        
    }
    
}