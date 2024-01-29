import java.util.Scanner;
public class demoJugadores{
    public static void main (String[]args){
        Jugador[]Jugadores = new Jugador[3];
        Scanner in = new Scanner (System.in);
        for (int i=0; i<Jugadores.length; i++){
            Jugador player= new Jugador();
            System.out.println(" nombre:");
            player.setNombre(in.next());
            System.out.println("dni:");
            player.setDNI(in.nextInt());
            System.out.println("edad");
            player.setEdad(in.nextInt());
            System.out.println("Goles Anotados");
            player.setGolesAnotados(in.nextInt());
            System.out.println("Partidos Jugados");
            player.setPartidosJugados(in.nextInt());
            Jugadores[i] = player;
        }
        for (int i=0; i<Jugadores.length; i++){
            System.out.println(Jugadores[i].toString());
        }
        System.out.println("jugadores con mas de 100 partidos jugados: " + mayoresde100partidos(Jugadores));
    }
    public static int mayoresde100partidos(Jugador[]Jugadores){
        int cont = 0; int i;
        for (i=0; i<Jugadores.length; i++){
            if (Jugadores[i].getPartidosJugados() > 100) {
                cont++;
            }
        }
        return cont;
    }
}
