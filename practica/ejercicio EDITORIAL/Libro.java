public class Libro extends Ejemplar{
    private String titulo;
    private int cantCapitulos;
    private boolean deBolsillo;
    public Libro(int id,int cantPaginas,String resumen,Editor editor,String titulo, int cantCapitulos, boolean deBolsillo){
        super(id,cantPaginas,resumen,editor);
        this.titulo= titulo;
        this.cantCapitulos=cantCapitulos;
        this.deBolsillo= deBolsillo;
    }
    public void setTitulo( String titulo){
        this.titulo=titulo;
    }
    public void setCantCapitulos(int cantCapitulos){
        this.cantCapitulos=cantCapitulos;
    }
    public void setDeBolsillo(boolean deBolsillo){
        this.deBolsillo=deBolsillo;
    }
    public String getTitulo (){
        return titulo;
    }
    public int getCantCapitulos(){
        return cantCapitulos;
    }
    public boolean getDeBolsillo(){
        return deBolsillo;
    }
    public String toString(){
        String aux;
        aux= "codigo identificatorio" + this.getId() + "Titulo" + this.getTitulo() 
        + "datos del editor: " + this.getEditor().toString();
        return aux;
    }
    public void Publicacion(){
        super.Publicacion();
        if (getDeBolsillo()){
            this.titulo += "- De Bolsillo";
        }
    }
}