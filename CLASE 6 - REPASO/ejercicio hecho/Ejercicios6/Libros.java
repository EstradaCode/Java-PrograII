public class Libros extends Ejemplar{
 private String titulo;
 private int capitulos;
 private boolean deBolsillo;
 public Libros( String unTitulo, int caps, boolean bolsillo,int codigoid,int paginas,String resumen, int añoPublicacion,Responsable editor){
     super(codigoid,paginas,resumen,añoPublicacion,editor);
     titulo=unTitulo;
     capitulos=caps;
     deBolsillo=bolsillo;
 }
 public Libros(){
     
 }
 public String getTitulo(){
     return titulo;
 }
 public int getCapitulos(){
     return capitulos;
 }
 public boolean getDeBolsillo(){
     return deBolsillo;
 }
 public void setTitulo(String unTitulo){
     titulo= unTitulo;
 }
 public void setCapitulo(int caps){
     capitulos=caps;
 }
 public void setDeBolsillo(boolean bolsillo){
     deBolsillo=bolsillo;
 }
 public void modificarTitulo(){
     if (getDeBolsillo()==true){
         setTitulo(getTitulo() + "-" + "De Bolsillo");
     }
 }
 public String toString(){
     return ( super.toString() + "titulo " +  getTitulo() + "capitulos " + getCapitulos());
 }
}
 