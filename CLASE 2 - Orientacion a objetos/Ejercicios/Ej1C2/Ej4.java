import java.util.Scanner;
public class Ej4{
public static void CargaVector (Partido[] vecPartidos){
        int i, golesL, golesV; 
        Scanner in= new Scanner(System.in);
        for (i=0;i<3;i++){
            System.out.println("Equipo Local: ");
            String eqL= in.next();
            vecPartidos[i].setLocal(eqL);
            System.out.println("Equipo Visitante: ");
            String eqV= in.next();
            vecPartidos[i].setVisitante(eqV);
            System.out.println("Goles Local: ");
             golesL= in.nextInt();
             vecPartidos[i].setGolesLocal(golesL);
            System.out.println("Goles Visitante: ");
             golesV= in.nextInt();
             vecPartidos[i].setGolesVisitante(golesV);
        }
        in.close();
    }
public static int GanadorRiver (Partido[] vecPartidos){
    int i, contadorR=0; String r="River";
    for (i=0;i<3;i++){
        if ((vecPartidos[i].getGanador() == r)){
         contadorR++;   
        }
    }
    return contadorR;
}
public static int golesBoca (Partido[] vecPartidos){
    int i, contadorB=0; String b= "Boca";
    for (i=0;i<3;i++){
        if ((vecPartidos[i].getLocal() == b)){
         contadorB+= vecPartidos[i].getGolesLocal();   
        }
    }
    return contadorB;
}
public static double  porcentajeEmpate (Partido[] vecPartidos){
    int i, empates=0; double porcent;
    for (i=0;i<3;i++){
        if ((vecPartidos[i].hayEmpate() == true)){
         empates++;   
        }
    }
    porcent=((empates*100)/ 3);
    return porcent;
}
 
       public static void main (String[] args) {
      int i ; Partido[] vecPartidos =  new Partido[325];
      for(i=0; i<3; i++){
      vecPartidos[i] = new Partido();
     }
     CargaVector(vecPartidos);
      for (i=0;i<3;i++){
            System.out.println("Equipo Local: " + vecPartidos[i].getLocal());
            System.out.println("Equipo Visitante: " + vecPartidos[i].getVisitante());
            System.out.println("Goles Local: " + vecPartidos[i].getGolesLocal());
            System.out.println("Goles Visitante: "+ vecPartidos[i].getGolesVisitante());
              
     }
     System.out.println("Partidos Ganados por River:"+ GanadorRiver(vecPartidos));
     System.out.println("Goles hechos por Boca jugando de Local: "+ golesBoca(vecPartidos));
     System.out.println("Porcentaje de partidos finalizados por empate: " + porcentajeEmpate(vecPartidos));
}
}