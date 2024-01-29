import java.util.Scanner;
public class Ejmain{
    public static void main (String[]args){
        Scanner in= new Scanner(System.in); int i;
        System.out.println("Nombre: ");
        String nombre= in.next();
        System.out.println("DNI: ");
        int dni= in.nextInt();
        System.out.println("EDAD: ");
        int edad= in.nextInt();
        System.out.println("Sueldo Basico: ");
        double sueldo= in.nextDouble();
        System.out.println("Es entrenador? (true/false):");
        boolean opcion = in.nextBoolean();
        if(opcion == true){
          System.out.println("Campeonatos ganados:");
          int campeonatos = in.nextInt();  
          Entrenador trainer= new Entrenador(nombre,dni,edad,sueldo,campeonatos);
          System.out.print(trainer.toString());
        } else{
           System.out.println("Es Jugador? (true/false):");
           opcion = in.nextBoolean();
           if(opcion== true){
             System.out.println("Partidos jugados:");
              int partidos= in.nextInt();
              System.out.println("goles realizados:");
              int goles = in.nextInt();  
              Jugador player= new Jugador(nombre,dni,edad,sueldo,partidos,goles);
              System.out.print(player.toString());  
           }
        }
        
}
}