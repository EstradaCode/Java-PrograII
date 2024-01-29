import java.util.Scanner;
public class p4{
    public static void main(String[] args){
        Scanner in= new Scanner( System.in);
        int i, factorial=1;
        for (i=1; i <= 9; i++){
            factorial= factorial * i;
        if (i % 2 !=0){
            System.out.println("factorial de"+ i + "es " + factorial);
        }
        }
        }
}
