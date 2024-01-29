import java.util.Scanner;
public class ej4{
    public static void main (String[] args){
        Partido[] partidos = new Partido[3]; //null
        Partido p = new Partido(); Scanner in = new Scanner (System.in);
        for (int i=0; i< partidos.length; i++){
            System.out.println("Equipo local ");
            p.setLocal(in.nextLine()); 
            System.out.println("Equipo Visitante");
            p.setVisitante(in.nextLine());
            System.out.println("Goles Local");
            p.setGolesLocal(in.nextInt()); 
            System.out.println("goles visitante ");
            p.setGolesVisitante(in.nextInt());
            in.nextLine();
            partidos[i] = p;
        }
        in.close();
        System.out.println("partidos ganados por River" + partidosRiver(partidos));
        System.out.println("goles jugado por Boca de local" + golesBocaLocal(partidos));
        System.out.println("Porcentaje de partidos empatados" + partidosEmpate(partidos));
        
    }
    static int partidosRiver(Partido[]partidos){
        int cont=0;
        for (int i=0; i< 3; i++){
            if ((partidos[i].getGanador() == "River")){
                cont++;
            }
        }
        return cont;
    }
    static int golesBocaLocal(Partido[]partidos){
        int c=0;
        for(int i=0; i<3; i++){
            if (partidos[i].getLocal()== "Boca"){
                c++;
            }
        }
        return c;
    }
    static Double partidosEmpate(Partido[]partidos){
        double porcentaje; int totalE=0;
        for (int i=0; i<3; i++){
            if (partidos[i].hayEmpate() == true){
                totalE++;
            }
        }
        porcentaje = (totalE / partidos.length)*100;
        return porcentaje;
    }
}