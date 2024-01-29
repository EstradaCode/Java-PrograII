import java.util.Scanner;
public class programaArba{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Vehiculo vehiculos[]= new Vehiculo [999];
        int dimL=0;
        System.out.println("Desea agregar un Vehiculo? (si/no):");
        String fin = in.next();
        while (fin.equals("si") && dimL < 999){
            vehiculos[dimL]= leerVehiculo(in);
            dimL++;
            System.out.println();
            System.out.println("Desea agregar OTRO Vehiculo? (si/no):");
            fin=in.next();
        }
        System.out.println("lista de vehiculos: ");
        imprimirvehiculos(vehiculos);
        in.close();
    }
    private static void imprimirvehiculos(Vehiculo vec[]){
        for (int i=0;i<999; i++){
            System.out.println(vec[i].ToString());
        }
    }
    private static  Vehiculo leerVehiculo(Scanner in){
        int año; double importe;
        Vehiculo vehiculo = null;
        System.out.println("año de fabricacion:");
        año= in.nextInt();
        System.out.println("importe de gestion basico:");
        importe= in.nextDouble();
        System.out.println("informacion del propietario:");
        
        Propietario propietario = leerPropietario(in);
        System.out.println("tipo de vehiculo: (Automovil/Embarcacion)");
        String tipoVehiculo = in.next();
        if( tipoVehiculo.equals("Automovil")){
            System.out.println("patente: ");
            String patente= in.next();
            System.out.println("importe: ");
            double importeAdicional= in.nextInt();
            System.out.println("descripcion: ");
            String descripcion= in.next();
            vehiculo= new Automotor(patente,importeAdicional,descripcion,año,propietario,importe);
            
        }
        else  if (tipoVehiculo.equals("Embarcacion")) {
            String rey; String nombre; String tipoEmbarcacion;
            int eslora;double tonelaje; double valor;
            System.out.println("REY: ");
            rey= in.next();
            System.out.println("NOMBRE: ");
            nombre=in.next();
            System.out.println(" Tipo de embarcacion: (lancha, crucero, velero)");
            tipoEmbarcacion=in.next();
            System.out.println("eslora: ");
            eslora=in.nextInt();
            System.out.println("tonelaje (peso): ");
            tonelaje=in.nextDouble();
            System.out.println("valor: ");
            valor=in.nextDouble();
            vehiculo= new Embarcacion(rey,nombre,tipoEmbarcacion,eslora,tonelaje,valor,año,propietario,importe);
        }
        return vehiculo;   
    }
    private static Propietario leerPropietario(Scanner in){
        System.out.println("CIT");
        int cit= in.nextInt();
        System.out.println("NOMBRE");
        String nombre= in.next();
        System.out.println("APELLIDO");
        String apellido= in.next();
        return new Propietario(nombre,apellido,cit);
        }
    }