import java.util.Scanner;
public class mainmicro{
    public static void main(String[]args){
        Scanner in= new Scanner(System.in); int n;
        Micros micro = new Micros("ABC123", "Mar del Plata", "5:00 am");
        System.out.println("Escriba el Asiento deseado: "); 
        n = in.nextInt();
    while ((n!=-1) && (micro.Microlleno()== false)){
     if((micro.validarAsiento(n)==true) && (micro.asientoDisponible(n)==true)){
            if(micro.reservarAsiento(n)==true){
                System.out.println("El asiento" + n + "Se reservó satisfactoriamente.");
            } 
     }else{
            if(micro.asientoDisponible(n)==false){
             System.out.println("Error! El asiento está ocupado");   
            }else if (micro.validarAsiento(n)==false){
             System.out.println("Error! numero de asiento incorrecto," +
             "Escriba un numero de 0 a 19");
            }
        }
     System.out.println("Escriba el Asiento deseado: "); 
     n = in.nextInt();   
    }
        System.out.println("Fin de la operacion" + "micro lleno");
}
}