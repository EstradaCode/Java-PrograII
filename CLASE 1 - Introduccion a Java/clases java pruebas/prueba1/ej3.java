import java.util.Scanner;
public class ej3{
 public static void main(String[]args){
    int factorial=1,num, i;
    Scanner in= new Scanner(System.in);
    System.out.println(" Escriba el numero para mostrar su factorial");
    num = in.nextInt();
    for (i=1;i<=num; i++) {
        factorial = (factorial * i);
    }
    System.out.println("factorial de "+ num + "!=  " + factorial); 
    in.close();
}
}           
