import java.util.Scanner;
public class ej5{
    public static void main (String[] args){
        String[]vec = new String [10]; Scanner in= new Scanner(System.in);
        for (int i=0; i< vec.length; i++){
            String palabra = in.nextLine();
            vec[i]= palabra;
            System.out.println(" palabra  " + vec[i]);
        }
        for ( int i=0; i<vec.length; i++){
            System.out.print(vec[i].charAt(0));
        }
    
    }
}