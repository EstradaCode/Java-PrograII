import java.util.Scanner;
public class demotriangulo{
   public static void main (String[]args){
       Triangulos triangulo= new Triangulos(7.5,8.0,9.0,"amarillo","rojo");
       Triangulos triangulo2= new Triangulos();
       System.out.println("area: " + triangulo.CalcularArea());
       System.out.println("perimetro: " + triangulo.CalcularPerimetro());
       System.out.println(triangulo.toString());
       System.out.println(triangulo2.toString());
    }
}