public abstract class Ejemplar{
    private int codigoId;
    private int paginas;
    private String resumen;
    private int añoPublicacion;
    private Responsable editor;
    public Ejemplar(int codigoid, int paginas, String resumen, int añoPublicacion, Responsable editor){
        this.codigoId= codigoid;
        this.paginas= paginas;
        this.resumen= resumen;
        this.añoPublicacion= añoPublicacion;
        this.editor = editor;
    }
    public Ejemplar(){
        
    }
    public int getcodigoId(){
        return codigoId;
    }
    public int getPaginas(){
        return paginas;
    }
    public String getResumen(){
        return resumen;
    }
    public int getAñoPublicacion (){
        return añoPublicacion;
    }
    public Responsable getResponsable(){
        return editor;
    }
    public void setcodigoId(int codigoid){
        this.codigoId=codigoid;
    }
    public void setPaginas(int paginas){
        this.paginas=paginas;
    }
    public void setResumen(String resumen){
        this.resumen=resumen;
    }
    public void setAñoPublicacion(int añopublicacion){
        this.añoPublicacion=añopublicacion;
    }
    public void setResponsable(Responsable editor){
        this.editor=editor;
    }
    abstract void modificarTitulo();
    @Override
    public String toString(){ 
     return ( "id: " + getcodigoId() + "Paginas: " + getPaginas() + "resumen: " 
     + getResumen() + "año de publicacion: " + getAñoPublicacion() + " Responsable: "
     + editor.toString()); 
    }
}
