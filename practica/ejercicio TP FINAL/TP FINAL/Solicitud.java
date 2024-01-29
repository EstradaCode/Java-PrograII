public abstract class Solicitud{
    private String numGestion;
    private String fecha;
    private double ingresosMensual;
    private int cantIntegrantes;
    private String region;
    private Persona solicitante;
    public Solicitud(String numGestion,String fecha,double ingresosMensual,int cantIntegrantes,String region,Persona solicitante){
        this.numGestion= numGestion;
        this.fecha=fecha;
        this.ingresosMensual=ingresosMensual;
        this.cantIntegrantes=cantIntegrantes;
        this.region=region;
        this.solicitante=solicitante;
    }
    public Solicitud(){
        
    }
    public void setNumGestion(String numGestion){
        this.numGestion= numGestion;
    }
    public void setFecha(String fecha){
        this.fecha=fecha;
    }
    public void setIngresosMensual(double ingresosMensual){
        this.ingresosMensual= ingresosMensual;
    }
    public void setcantIntegrantes(int cantIntegrantes){
        this.cantIntegrantes=cantIntegrantes;
    }
    public void setRegion(String region){
        this.region=region;
    }
    public void setSolicitante(Persona solicitante){
        this.solicitante = solicitante;
    }
    public String getNumGestion(){
        return  numGestion;
    }
    public String getFecha(){
        return fecha;
    }
    public double getIngresosMensual(){
        return  ingresosMensual;
    }
    public int getCantIntegrantes(){
        return cantIntegrantes;
    }
    public String getRegion(){
        return region;
    }
    public Persona getSolicitante(){
        return solicitante;
    }
    public abstract double calcularValorGasto();
    public abstract boolean AccederAlSubsidio();
    public String toString(){
        String aux;
        aux= "numero de gestion : " + this.getNumGestion()+ " fecha: " + this.getFecha()+ "ingresos mensuales" + this.getIngresosMensual() + " cantidad de integrantes: " + this.getCantIntegrantes() +
        " region: " +this.getRegion() + "datos de solicitante: " + this.getSolicitante().toString();
        return aux;
    }
}