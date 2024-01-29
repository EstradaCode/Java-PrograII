import java.util.Scanner;
public class maintrianqulo{
    public static void main(String[] args){
       double a,b,c; String relleno, cLinea; Scanner in= new Scanner(System.in);
       Triangulo traingle = new Triangulo();
       System.out.println("lado 1");
       a = in.nextInt();
       traingle.setladoA(a);
       System.out.println("lado 2");
       b = in.nextInt();
       traingle.setladoB(b);
       System.out.println("lado 3");
       c = in.nextInt();
       traingle.setladoC(c);
       System.out.println("color de relleno");
       relleno = in.next();
       traingle.setcolorRelleno(relleno);
       System.out.println("color de linea");
       cLinea = in.next();
       traingle.setcolorLinea(cLinea);
       System.out.println(traingle.toString());
       System.out.println("Area: " + traingle.calcularArea());
       System.out.println("Perimetro: " + traingle.calcularPerimetro());
    }
}