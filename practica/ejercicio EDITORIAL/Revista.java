public class Revista extends Ejemplar {
    private String nombre;
    private int volumen;
    private int articulos;
    public Revista(int id,int cantPaginas,String resumen,Editor editor,String nombre, int articulos){
        super(id,cantPaginas,resumen,editor);
        this.nombre=nombre;
        this.volumen= -1;
        this.articulos=articulos;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setVolumen (int volumen){
        this.volumen=volumen;
    }
    public void setArticulos(int articulos){
        this.articulos=articulos;
    }
    public String getNombre(){
        return nombre;
    }
    public int getVolumen(){
        return volumen;

    }
    public int getArticulos(){
        return articulos;
    }
    public String toString(){
        String aux;
        aux= "nombre revista: " + this.getNombre() + "volumen: " + this.getVolumen();
        return aux;
    }
    public void Publicacion(){
        super.Publicacion();
        this.setVolumen(Generador.getNroVolumen());
    }
}