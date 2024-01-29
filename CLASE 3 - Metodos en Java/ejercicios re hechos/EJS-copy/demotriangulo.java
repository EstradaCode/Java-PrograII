import java.util.Scanner;
public class demotriangulo{
   public static void main (String[]args){
       Triangulos triangulo= new Triangulos(); Scanner in= new Scanner(System.in);
       triangulo.setLado1(in.nextDouble());
       triangulo.setLado2(in.nextDouble());
       triangulo.setLado3(in.nextDouble());
       triangulo.setColor(in.next());
       in.nextLine();
       triangulo.setColorLinea(in.next());
       in.nextLine();
       System.out.println("area: " + triangulo.CalcularArea());
       System.out.println("perimetro: " + triangulo.CalcularPerimetro());
   }
}