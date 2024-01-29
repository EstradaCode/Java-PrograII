public class Energia extends Solicitud{
    private int nis;
    private int cantElectro;
    public Energia(int nis, int cantElectro){
        this.nis=nis;
        this.cantElectro=cantElectro;
    }
    public Energia(){
        
    }
    public void setNis(int nis){
        this.nis=nis;
    }
    public void setCantElectro( int cantElectro){
        this.cantElectro=cantElectro;
    }
    public int getNis(){
        return nis;
    }
    public int getCantElectro(){
        return cantElectro;
    }
    public double calcularValorGasto(){
        double ing= super.getIngresosMensual(); double gasto=0;
        if ( ing> 300000){
            gasto= 500*(this.getCantElectro());
        } else if (( ing >= 150000) && (ing<=300000)){
            gasto= 100*(this.getCantElectro()) + ( ing*2/100);
            
        } else if( ing <150000){
            gasto= (ing* 1.5/100) + (400 * super.getCantIntegrantes());
        }
        return gasto;
    }
    public boolean AccederAlSubsidio(){
        double ing= super.getIngresosMensual(); int integrantes= super.getCantIntegrantes();
        if ( ((ing/ integrantes) <= (45*ing/100)) && (TarifasNacionalesPorRegion.puedeAccederAlSubsidio(ing, super.getRegion()))){
            return true;
        } else{ return false;}
    }
}
