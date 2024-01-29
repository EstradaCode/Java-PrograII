import java.util.Scanner;
public class ProgramaEditorial{
    public static void main (String[] args){
        Ejemplar ejemplares [] = new Ejemplar[3]; Scanner in = new Scanner (System.in); int i;
        for ( i=0; i< ejemplares.length; i++){
            ejemplares[i] = LeerEjemplar(in);
        }
        for ( i=0; i<ejemplares.length; i++){
            System.out.println("¿Quiere publicar el ejemplar nro" + (i+1) + "? (true/false)");
            boolean opcionp= in.nextBoolean();
            if (opcionp){
                ejemplares[i].Publicacion();
            }
        }
        for ( i= 0; i< ejemplares.length; i++){
            System.out.println("listado de ejemplares: ");
            System.out.println(ejemplares[i].toString());
        }
        System.out.println("fin del programa.");
        in.close();
    }
    public static Ejemplar LeerEjemplar( Scanner in){
        System.out.println("id ");
        int id= in.nextInt();
        System.out.println("cantidad de paginas ");
        int cantPaginas= in.nextInt();
        System.out.println("resumen: ");
        String resumen= in.next();
        in.nextLine();
        System.out.println("datos del editor: ");
        Editor editor= leerEditor(in);
        System.out.println("ESCRIBA EL TIPO DE EJEMPLAR (REVISTA/LIBRO) ");
        String opcion= in.next();
        in.nextLine();
        if (opcion.toUpperCase().equals("REVISTA")){
        System.out.println(" nombre de revista");
        String nombreR= in.next();
        in.nextLine();
        System.out.println("numero de articulos: ");
        int articulos= in.nextInt();
         return new Revista (id,cantPaginas,resumen,editor,nombreR, articulos);
    } else if (opcion.toUpperCase().equals("LIBRO")){
        System.out.println("titulo del libro: ");
        String titulo= in.next();
        System.out.println("cantidad de capitulos: ");
        int cantCapitulos= in.nextInt();
        System.out.println("es una edicion de bolsillo? (true/false): ");
        boolean deBolsillo= in.nextBoolean();
        return new Libro (id,cantPaginas,resumen,editor,titulo,cantCapitulos,deBolsillo);
    } else{
        System.out.println ( "eleccion invalida");
        return null;
    }
    }
    public static Editor leerEditor( Scanner in){
        System.out.println("dni ");
        int dni= in.nextInt();
        System.out.println(" nombre editor ");
        String nombre= in.next();
        in.nextLine();
        System.out.println("Apellido");
        String apellido= in.next();
        in.nextLine();
        return new Editor(dni,nombre,apellido);
    }
}