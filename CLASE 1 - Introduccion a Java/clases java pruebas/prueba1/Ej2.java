import java.util.Scanner;
public class Ej2{
    public static void main(String[] args){
        int patente, cantValidos=0, cantTotales=0; 
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese patente");
        patente = in.nextInt();
        while (patente != 0) {
            cantTotales++;
            if (patente % 2 == 0){
              System.out.println("patente par: VALIDA");
              cantValidos++;
         
            } else{
              System.out.println("patente impar: NO VALIDA");
            }
            System.out.println("Ingrese patente");
            patente = in.nextInt();
        }
        double porcentaje = ((cantValidos*100)/ cantTotales);
        System.out.println("porcentaje: "+ porcentaje);
        
        
        
        
        
    }
    
    
    
}
