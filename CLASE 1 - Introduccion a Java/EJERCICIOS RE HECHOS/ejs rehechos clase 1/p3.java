import java.util.Scanner;
public class p3{
    public static void main(String[] args){
        Scanner in= new Scanner( System.in);
        int i, factorial;
        System.out.println(" coloca un numero para saber su factorial");
        int num = in.nextInt();
        while ( num != 0 ) {
        factorial = 1;
        for (i=1; i <= num; i++){
            factorial= factorial * i;
        }
         System.out.println(factorial);
         System.out.println(" coloca OTRO numero para saber su factorial");
         num = in.nextInt();
        }
}
}