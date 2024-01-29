public class Triangulo{
     private double ladoA;
     private double ladoB;
     private double ladoC;
     private String colorRelleno = "blanco";
     private String colorLinea = "Negro";
     
     public Triangulo (double unlado, double otrolado,double ultlado,
     String relleno, String cLinea){
        ladoA = unlado;
        ladoB =otrolado;
        ladoC = ultlado;
        colorRelleno = relleno;
        colorLinea = cLinea;
     }
     public Triangulo (){
         
     }
     public double getladoA(){
         return ladoA;
     }
     public double getladoB(){
         return ladoB;
     }
     public double getladoC(){
         return ladoC;
     }
     public String getcolorRelleno(){
         return colorRelleno;
     }
     public String getcolorLinea(){
         return colorLinea;
     }
     
     public void setladoA(double unlado){
         ladoA = unlado;
     }
     public void setladoB(double otrolado){
         ladoB = otrolado;
     }
     public void setladoC( double ultlado){
         ladoC = ultlado;
     }
     public void setcolorRelleno(String relleno){
         colorRelleno = relleno;   
     }
     public void setcolorLinea(String cLinea){
         colorLinea = cLinea;   
     }
     public double calcularArea (){
         double s = ((ladoA + ladoB +ladoC)/2);
         double a = Math.sqrt(s*(s-ladoA)*(s-ladoB)*(s-ladoC));
         return a;
     }
     public double calcularPerimetro(){
         double p = (ladoA + ladoB + ladoC);
         return p;
     }
     public String toString(){
        return ("lados " + ladoA + ", " + ladoB + ", " + ladoC + " - " + " color de Relleno " + 
        colorRelleno + "color de Linea" + colorLinea);
     }
}