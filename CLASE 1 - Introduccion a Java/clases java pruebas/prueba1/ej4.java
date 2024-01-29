public class ej4{
    public static void main (String[] args){
        int i,j, factorial;
        for (i=1;i<=9;i++){
            factorial=1;
            for (j=1; j<=i;j++) {
              factorial = factorial * j;
            }
            System.out.println( "El factorial del numero " + i + " es " 
            + factorial);
        }
    }        
}
