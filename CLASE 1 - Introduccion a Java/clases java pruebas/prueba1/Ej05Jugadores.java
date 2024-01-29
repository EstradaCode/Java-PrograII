import java.util.Scanner;
public class Ej05Jugadores
{
    /**
     * Método main
     * 
     */
    public static void main(String[] args)
    {   double[] alturasJ;
        int i, cantJ = 0;
        double total=0,promedio = 0;
        Scanner in= new Scanner(System.in);
        alturasJ= new double [15];
         for (i=0; i<=14;i++){
                System.out.println("Ingrese altura del jugador(cms): ");
                alturasJ[i] = in.nextDouble();   
                total = total+ alturasJ[i];
            }
        promedio=(total/15);
        System.out.println("Estatura Promedio de los Jugadores: " + promedio);
        //parte b
         for (i=0; i<=14;i++){
           if (alturasJ[i] > promedio){
              cantJ++; 
           }
         }
        System.out.println("jugadores con altura mayor al promedio: " + cantJ);
    }
}
