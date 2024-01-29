import java.util.Scanner;
public class mainentrenador{
    public static void main(String[]args){
     double sueldo;
     Entrenador trainer= new Entrenador(); Scanner in = new Scanner(System.in);
     System.out.println("nombre entrenador: ");
     String nombre = in.next();
     in.nextLine();
     trainer.setNombre(nombre);
     System.out.println("Cantidad de campeonatos ganados");
     int campeonatos = in.nextInt();
     trainer.setcampeonatosGanados(campeonatos);
     System.out.println("sueldo basico:");
     sueldo = in.nextDouble();
     trainer.setsueldoBasico(sueldo);
     System.out.println(trainer.toString());
     System.out.println("Sueldo a Cobrar: " + trainer.calcularSueldoACobrar());
     in.close();
     
}
}