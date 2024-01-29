import java.util.Scanner;
public class p1{
    public static void main ( String[] args){
     Scanner in = new Scanner(System.in);
     double a,b,c;
     a=in.nextDouble();
     b= in.nextDouble();
     c= in.nextDouble();
     if ((a<b +c) && (b< a+c) && (c< a + b)) {
         double perimetro= a + b + c;
         System.out.println("el perimetro del triagulo es:" + perimetro);
     }else{
         System.out.println("los lados no son validos");
     }
    }
}