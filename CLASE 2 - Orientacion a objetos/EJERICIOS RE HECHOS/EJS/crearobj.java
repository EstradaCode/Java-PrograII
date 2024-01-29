import java.util.Scanner;
public class crearobj{
    public static void main (String[]args){
        Persona people= new Persona(); Scanner in= new Scanner (System.in);
        System.out.println( "nombre: ");
        String unNombre= in.next();
        in.nextLine();
        System.out.println("DNI: ");
        int unDNI= in.nextInt(); 
        System.out.println("EDAD: ");
        int unaEdad= in.nextInt();
        people.setNombre(unNombre);
        people.setDNI(unDNI);
        people.setEdad(unaEdad);
        System.out.println(people.toString());
    }
}