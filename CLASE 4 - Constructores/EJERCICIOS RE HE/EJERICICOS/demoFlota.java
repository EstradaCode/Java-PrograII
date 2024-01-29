import java.util.Scanner;
public class demoFlota{
    public static void main (String[]args){
        Flota flechabus = new Flota(); Scanner in= new Scanner(System.in);
        Micro micro= new Micro();
        while (( micro.getPatente() != "ZZZ000") && (flechabus.getFlotaCompleta())){
            System.out.println("patente");
            micro.setPatente(in.next());
            if(micro.getPatente()!="ZZZ000"){
            System.out.println("destino:");
            micro.setDestino(in.next());
            System.out.println("hora de salida");
            micro.setHSalida(in.next());
            in.nextLine();
            flechabus.agregarMicro(micro);
        }
    }
    System.out.println("buscar patente para borrar:");
    String patente= in.next();
    if (flechabus.buscarMicroP(patente) != null){
        flechabus.eliminarMicro(patente);
        System.out.println("micro eliminado");
    }
    System.out.println("Buscar micro con este destino:");
    String destino= in.next();
    if(flechabus.buscarMicroD(destino)!= null){
        System.out.println("patente:" + flechabus.buscarMicroD(destino).getPatente() + "hora de salida:" + flechabus.buscarMicroD(destino).getHSalida()); 
    }else{ System.out.println( "no existe micro con dicho destino");}
    in.close();
}
}