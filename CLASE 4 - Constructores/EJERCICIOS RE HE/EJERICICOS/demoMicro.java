import java.util.Scanner;
public class demoMicro{
    public static void main (String[] args){
        Scanner in= new Scanner(System.in);
        Micro micro= new Micro("ABC123", "Mar del Plata", "5:00am"); //creo objeto con estos atributos;
        System.out.println("Escriba un numero de asiento");
        int num = in.nextInt();
        while((num!= -1) && (!micro.MicroLleno())){
            if(micro.validarNumAsiento(num)){
                if (micro.ocuparAsiento(num)){
                    System.out.println("asiento se reservó apropiadamente");
                }else{
                    System.out.println("asiento ya estaba ocupado. puede ocupar el asiento" +
                    micro.AsientoLibre());
                }
            } else{ System.out.println("numero invalido");}
            System.out.println("escriba Otro numero de asiento");
            num = in.nextInt();
        }
        if(micro.MicroLleno() == true){
            System.out.println("el micro se llenó");
        } else{
            System.out.println("numero de asiento -1 ");
        }        
        in.close();
        System.out.println("Asientos ocupados" + micro.devolverAsientosOcupados());
    }
}
