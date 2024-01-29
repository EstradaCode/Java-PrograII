public class Revistas extends Ejemplar{
    private String nombre;
    private int numVolumen;
    private int cantArticulos;
    public Revistas( String unNombre, int numVolumen, int cantArticulos, int codigoid,int paginas,String resumen, int añoPublicacion,Responsable editor){
     super(codigoid,paginas,resumen,añoPublicacion,editor);
     this.nombre= unNombre;
     this.numVolumen= numVolumen;
     this.cantArticulos=cantArticulos;
    }
    public Revistas(){
        
    }
    public String getNombre(){
        return nombre;
    }
    public int getNumVolumen(){
        return numVolumen;
    }
    public int getCantArticulos(){
        return cantArticulos;
    }
    public void setNombre(String unNombre){
        nombre=unNombre;
    }
    public void setNumVolumen(int volumen){
        numVolumen=volumen;
    }
    public void setCantArticulos(int articulos){
        cantArticulos= articulos;
    }
    public void modificarTitulo(){
       nombre = (getNombre() + Generador.getNroVolumen());
        
    }
    public String toString(){
        return (super.toString() + "Revista " + getNombre() + "Cantidad de Articulos " 
        + getCantArticulos());
    }


}