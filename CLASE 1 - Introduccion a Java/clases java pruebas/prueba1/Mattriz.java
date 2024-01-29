public class Mattriz{
   public static void main (String[] args){
     int [][] tabla = new int[3][4];
     int i,j,total;
     total= 0;
     for (i=0;i<3;i++){
         for (j=0;j<4;j++){
         tabla[i][j]=i+j;
         if (j==3){
             System.out.println("columna 4");
             System.out.println (tabla[i][3]);
             total= total + (tabla[i][3]);
         }
        }
    }  
    System.out.println ("total");
    System.out.println (total);
}   
}
