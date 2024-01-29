public class Gas extends Solicitud{
    private String numMedidor;
    private double metros2;
    private int cantEstufas;
    public Gas(String numMedidor, double metros2, int cantEstufas){
        this.numMedidor=numMedidor;
        this.metros2= metros2;
        this.cantEstufas= cantEstufas;
    }
    public Gas(){
        
    }
    public void setNumMedidor(String numMedidor){
        this.numMedidor=numMedidor;
        
    }
    public void setMetros2(double metros2){
        this.metros2=metros2;
    }
    public void setCantEstufas(int cantEstufas){
        this.cantEstufas=cantEstufas;
    }
    public String getNumMedidor(){
        return numMedidor;
        
    }
    public double getMetros2(){
        return metros2;
    }
    public int  getCantEstufas(){
        return cantEstufas;
    }
    public double calcularValorGasto(){
        double ing= super.getIngresosMensual(); double gasto=0; double m2= this.getMetros2();
        if ( ing > 300000){
            gasto= 250*(m2/2) + (750*this.getCantEstufas());
        } else if (( ing >=150000 ) && (ing <= 300000)){
            gasto= ((100*(m2/3)) +  (500*this.getCantEstufas()));
        } else if ( ing <150000){
            gasto= (ing*2/100)+1000;
        }
        return gasto;
    }
    public boolean AccederAlSubsidio(){
        double ing= super.getIngresosMensual(); int integrantes= super.getCantIntegrantes();
        if ( ((ing/ integrantes + this.getCantEstufas()) <= (40*ing/100)) && (TarifasNacionalesPorRegion.puedeAccederAlSubsidio(ing, super.getRegion()))){
            return true;
        } else{ return false;}
    }
    
}