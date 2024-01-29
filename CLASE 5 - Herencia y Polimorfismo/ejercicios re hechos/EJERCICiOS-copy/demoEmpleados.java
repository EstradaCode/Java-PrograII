import java.util.Scanner;
public class demoEmpleados{
    public static void main (String[]args){
     Scanner in= new Scanner(System.in); 
     String nombre; int edad; double sueldo; int partidos; int goles; int campeonatos;
     System.out.println("nombre:");
     nombre= in.next();
     System.out.println("edad: ");
     edad= in.nextInt();
     System.out.println("sueldo:");
     sueldo= in.nextDouble();
     System.out.println("partidos:");
     partidos = in.nextInt();
     System.out.println("goles: ");
     goles=in.nextInt();
     Jugadores jugador= new Jugadores(nombre,edad,sueldo,partidos,goles); // jugador creado; 
     System.out.println("nombre:");
     nombre= in.next();
     System.out.println("edad: ");
     edad= in.nextInt();
     System.out.println("sueldo:");
     sueldo= in.nextDouble();
      System.out.println("campeonatos: ");
     campeonatos= in.nextInt();
     Entrenadores entrenador= new Entrenadores(nombre,edad,sueldo,campeonatos); // entrenador creado;
     System.out.println(entrenador.calcularSueldoACobrar());
     System.out.println(jugador.calcularSueldoACobrar());
     System.out.println(entrenador.toString());
     System.out.println(jugador.toString());
     in.close();
    }
}