import java.util.Scanner; 
public class Ej1{
    public static void main(String[] args){
    Scanner in =  new Scanner(System.in);
    System.out.print("ingrese dato a: ");
    double a = in.nextDouble();
    System.out.print("ingrese dato b: ");
    double b= in.nextDouble();
    System.out.print("ingrese dato c: ");
    double c= in.nextDouble();
    if ((a<(b+c)) && (b<(a+c)) && (c < (a+b))) {
       System.out.print("Es un triangulo valido");
       System.out.print("Perimetro del triangulo");
       double perimetro = a + b + c;
       System.out.print(perimetro);
    }else{
      System.out.print("NO es un triangulo valido"); 
    }
    }
}