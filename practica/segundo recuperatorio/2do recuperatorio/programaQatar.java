import java.util.Scanner;
public class programaQatar{
    static final int cant=3, valorEntrada= 5000;
    public static void main (String[]args){
      Compra compras[]= new Compra[cant]; int cant=0, i; Scanner in = new Scanner(System.in); double montofinal;
      String opcion = "COMPRAMULTIPLE";
      System.out.println("primer compra");
      cant=5;
      compras[0]= leerCompra(in,cant, opcion);
      cant=10;
      System.out.println("segunda compra");
      compras[1]= leerCompra(in,cant,opcion);
      opcion= "COMPRASIMPLE";
      System.out.println("tercera compra");
      compras[2]=leerCompra(in,cant,opcion);
      for (i=0; i< cant; i++){
          montofinal = compras[i].getImporte() - compras[i].promocion();
          compras[i].setImporte(montofinal);
      }
      for (i=0;i<cant; i++){
          System.out.println(compras[i].toString());
      }
      }
    public static Compra leerCompra(Scanner in, int cant, String opcion){
        System.out.println("numero de compra");
        int numCompra= in.nextInt();
        System.out.println("categoria (1..4):");
        int categoria= in.nextInt();
        while ((categoria < 1) && (categoria >4)){
            System.out.println("escriba una categoria existente: (1..4)");
            categoria= in.nextInt();
        }
        System.out.println("estadio");
        String estadio= in.next();
        in.nextLine();
        System.out.println("fecha (diamesaño): ");
        int fecha= in.nextInt();
        double importe= valorEntrada;
        if ( opcion.toUpperCase().equals("COMPRAMULTIPLE")) {
            int cantEntradas= cant;
            System.out.println("la cant de entradas serán: " + cant );
            importe = (double) importe *cantEntradas;
            return new CompraMultiple(numCompra,categoria,estadio,fecha,importe,cantEntradas);
        } else if (opcion.toUpperCase().equals("COMPRASIMPLE")){
            System.out.println("dni:" );
            int dni= in.nextInt();
            System.out.println("nombre:");
            String  nombre= in.next();
            System.out.println("apellido:");
            String apellido= in.next();
            System.out.println("numero de asiento");
            int numAsiento= in.nextInt();
            return new CompraSimple(numCompra,categoria,estadio,fecha,importe,dni,nombre,apellido,numAsiento);
            
        } else{
            return null;
        }
    }
}