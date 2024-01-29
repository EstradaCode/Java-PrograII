public abstract class Ejemplar{
    private int id;
    private int cantPaginas;
    private String resumen;
    private String añoPublicacion;
    private Editor editor;
    public Ejemplar(int id,int cantPaginas,String resumen,Editor editor){
        this.id= id;
        this.cantPaginas=cantPaginas;
        this.resumen=resumen;
        this.añoPublicacion= "no publicado";
        this.editor=editor;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setCantPaginas(int cantPaginas){
        this.cantPaginas=cantPaginas;
    }
    public void setResumen(String resumen){
        this.resumen=resumen;
    }
    public void setAñoPublicacion ( String añoPublicacion){
        this.añoPublicacion=añoPublicacion;
    }
    public void setEditor(Editor editor){
        this.editor=editor;
    }
    public int getId(){
        return id;
    }
    public int getCantPaginas(){
        return cantPaginas;
    }
    public String getResumen(){
        return resumen;
    }
    public String getAñoPublicacion (){
        return añoPublicacion;
    }
    public Editor getEditor(){
        return editor;
    }
    public abstract String toString();
    public void Publicacion(){
        String añoActual= "2022";
        this.setAñoPublicacion(añoActual);
    }
}