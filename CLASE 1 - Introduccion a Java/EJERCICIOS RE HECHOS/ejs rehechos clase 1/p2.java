import java.util.Scanner;
public class p2{
    public static void main (String[] args){
        int patente; Scanner in= new Scanner (System.in);
        patente= in.nextInt();
        while ( patente != 0) {
          if (patente % 2 == 0){
              System.out.println("tiene permitido el paso");
          }else{
              System.out.println("no tiene permitido el paso");
          }
          patente= in.nextInt();
        }
    }
}