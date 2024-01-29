import java.util.Scanner;
public class programaEditorial{
    public static void main (String[]args){
      Ejemplar Ejemplares[]= new Ejemplar[1000]; Scanner in = new Scanner(System.in);
      boolean opcion; 
      for ( int i=0; i<2; i++){
         int codigoid, paginas; String resumen; int añoPublicacion;
         System.out.println("codigo:");
         codigoid=in.nextInt();
         System.out.println("paginas:");
         paginas= in.nextInt();
         System.out.println("resumen:");
         resumen=in.next();
         añoPublicacion= 0; 
         System.out.println("Datos de Editor: ");
         in.nextLine();
         System.out.println("nombre:");
         String nombre= in.next();
         System.out.println("apellido:");
         String apellido= in.next();
         System.out.println("dni:");
         int dni= in.nextInt();
         Responsable editor= new Responsable(dni,nombre,apellido);
         System.out.println("libro?:(true/false) ");
         opcion = in.nextBoolean();
         if ( opcion == true){
            String titulo; int capitulos; boolean deBolsillo;
            System.out.println("titulo:");
            titulo= in.next();
            System.out.println("capitulos:");
            capitulos= in.nextInt();
            System.out.println("es de bolsillo?:");
            deBolsillo= in.nextBoolean();
            Libros libro=new Libros(titulo,capitulos,deBolsillo,codigoid,paginas,resumen,añoPublicacion,editor);
            libro.modificarTitulo();
            Ejemplares[i]= libro;
         } else if(opcion == false){
             int volumen, articulos; String nombreR;
            System.out.println("nombre de la revista:");
             nombreR= in.next();
             System.out.println("volumen:");
             volumen=in.nextInt();
             System.out.println("cantidad de articulos:");
            articulos=in.nextInt();
            Revistas revista= new Revistas(nombreR,volumen,articulos,codigoid,paginas,resumen,añoPublicacion,editor);
            revista.modificarTitulo();
             Ejemplares[i]= revista;
         }
       }   
       Imprimir(Ejemplares);
       System.out.println("publicar libros?(true/false)");
       opcion= in.nextBoolean();
       if(opcion==true){
           System.out.println("año presente: ");
           int añoactual = in.nextInt(); 
           Publicacion(Ejemplares, añoactual);
       }
       Imprimir(Ejemplares);
    }
     private static void Imprimir (Ejemplar[]  Ejemplares){
        for (int i=0;i<2; i++){
            System.out.println(Ejemplares[i].toString());
        }
        // falta imprimir y publicar 
    }
    private static void Publicacion(Ejemplar[] Ejemplares, int año){
        for (int i=0; i<2; i++){
            Ejemplares[i].setAñoPublicacion(año);
        }
    }
}