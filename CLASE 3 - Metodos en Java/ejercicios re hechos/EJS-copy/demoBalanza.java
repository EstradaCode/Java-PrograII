import java.util.Scanner;
public class demoBalanza{
    public static void main (String[]args){
    balanzas verduleria= new balanzas(); Scanner in = new Scanner(System.in); double pesokg, preciokg;
    verduleria.iniciarCompra();
    System.out.println( "peso en kg y precio por kg ");
    pesokg= in.nextDouble();
    preciokg= in.nextDouble();
    verduleria.registrarProducto (pesokg,preciokg);
     System.out.println( "registrado");
        while ( pesokg!=0){
         System.out.println( "peso en kg y precio por kg ");
        pesokg= in.nextDouble();
        if( pesokg!=0){
        preciokg= in.nextDouble();
        verduleria.registrarProducto (pesokg,preciokg);
         System.out.println( "registrado");
    }
}
   System.out.println(verduleria.devolverResumenDeCompra());}
}