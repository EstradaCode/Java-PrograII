import java.util.Scanner;
public class p5{
    public static void main ( String[] args){
        double[]jugadores= new double[15]; Scanner in= new Scanner(System.in);
        double altura, total=0, promedio; int cont=0;
        for (int i = 0; i<14; i++) {
        System.out.println("diga la altura del jugador " + (i+1));
        altura = in.nextDouble();
        jugadores[i] = altura;
        total+= jugadores[i];
    }
    promedio= total/15;
    for (int i = 0; i<14; i++) {
        System.out.println(" altura del jugador " + (i+1) + " es " + jugadores[i]);
        if (jugadores[i] > promedio){
            cont++;
        }
    }
    System.out.println("promedio es " + promedio);
    System.out.println("cantidad de jugadores por encima del promedio" + cont);
}
}