import java.util.Scanner;
public class ej6{
    public static void main (String[]args){
        Scanner in= new Scanner(System.in); 
        int[][] matriz = new int[10][10];
        int[] vector= new int [10];
        int i,j, dePar=0, suma=0, totalcol;
         for (i=0;i<=9; i++){
             totalcol=0;
             for (j=0;j<=9; j++){
                 matriz[i][j]= dePar;
                 dePar= dePar + 2;
                 totalcol= totalcol + matriz[i][j];
                System.out.println ( "fila " + i + " columna " + j + ": " + matriz[i][j] );
                if ((i==2 || i== 9) || (j==0 || j== 3)){
                  suma= suma + matriz[i][j];  
                }
                System.out.println("suma es igual a " + suma);
          
            }
            vector[i]= totalcol;
         }
         for (i=0;i<=9; i++){
            System.out.println(" vector en posicion" + i +": " + vector[i]);
            }
         int buscar= in.nextInt();
         boolean exito = false;
         for (i=0;i<=9; i++){
             for (j=0;j<=9; j++){
               if( matriz[i][j] == buscar){
                    exito = true;
                   System.out.println("se encuentra en la fila " + i + " columna" + j);
               }
                }
            }
         if (exito == false){
          System.out.println("No se encontró el elemento");
         }
         in.close();
    }
    
}    