import java.util.Scanner;
public class demoEntrenador{
    public static void main (String[]args){
     Entrenador trainer= new Entrenador(); Scanner in= new Scanner(System.in);
     trainer.setNombre(in.next());
     trainer.setSueldo(in.nextDouble());
     trainer.setCampeonatosGanados(in.nextInt());
     System.out.println("sueldo a cobrar" + trainer.CalcularSueldoACobrar());
     System.out.println(trainer.toString());
    }
} 