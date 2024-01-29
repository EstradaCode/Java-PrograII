
public abstract class Compra {
    private int numCompra;
    private int categoria;
    private String estadio;
    private int fecha;
    private double importe;
    public Compra(int numCompra, int categoria,String estadio,int fecha,double importe){
        this.numCompra=numCompra;
        this.categoria=categoria;
        this.estadio=estadio;
        this.fecha=fecha;
        this.importe=importe;
    }
    public void setNumCompra (int numCompra){
        this.numCompra=numCompra;
        
    }
    public void setCategoria(int categoria){
        this.categoria=categoria;
        
    }
    public void setFecha( int fecha){
        this.fecha=fecha;
        
    }
    public void setImporte(double importe){
        this.importe=importe;
        
    }
    public void setEstadio(String estadio){
        this.estadio= estadio;
    }
    public int getnumCompra(){
        return numCompra;
    }
    public int getCategoria(){
        return categoria;
    }
    public int getFecha(){
        return fecha;
    }
    public double getImporte(){
        return importe;
    }
    public String getEstadio(){
        return estadio;
    }
    public abstract double promocion();
    public String toString(){
        String aux;
        aux= " numero de compra " + this.getnumCompra() + "categoria" + this.getCategoria() + "fecha:" + this.getFecha() + "Estadio: " + this.getEstadio() + "importe a pagar:"+  this.getImporte();
        return aux;
    }
}