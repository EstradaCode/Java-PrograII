import java.util.Scanner; 
public class Principal {
    private static final int cant = 2; 
    public static void main (String[] args){
        Vehiculo[] v = new Vehiculo[cant]; 
        Scanner in = new Scanner (System.in); 
        String tipoVehi; 
        for (int i = 0; i < cant; i++){
            System.out.println("¿Que tipo de vehiculo desea ingresar automotor/embarcacion?"); 
            tipoVehi = in.nextLine(); 
            if (tipoVehi.equals("automotor")) {
                v[i] = leerAutomotor(in); 
            }
            else {
                if (tipoVehi.equals("embarcacion")) {
                    v[i] = leerEmbarcacion(in); 
                }
            }
        }
        in.close(); 
        InformarMontoAPagar(v); 
    }
    private static Automotor leerAutomotor(Scanner in){
        Automotor a = null; 
        int anioFabri; double impBasico; Propietario pro; 
        String patente; double adicional; String descripcion; 
        
        pro = leerPropietario(in);
        System.out.println("Ingrese Automotor"); 
        System.out.print("Año de Fabricacion: "); anioFabri = in.nextInt(); 
        System.out.print("Importe Basico: "); impBasico = in.nextDouble(); 
        System.out.print("Patente: "); patente = in.nextLine(); in.nextLine(); 
        System.out.print("Adicional: "); adicional = in.nextDouble(); 
        System.out.print("Descripcion: "); descripcion = in.nextLine(); in.nextLine();
        a = new Automotor (anioFabri,impBasico,pro,patente,adicional,descripcion);
        return a; 
    }
    private static Embarcacion leerEmbarcacion(Scanner in){
        int anioFabri; double impBasico; Propietario pro; 
        String codigoREY; String tipoEmb; String nombre; double eslora; 
        double tonelaje; double valorDec;
        Embarcacion e = null; 
        
        pro = leerPropietario(in);
        System.out.println("Ingrese Embarcaion"); 
        System.out.print("Año de Fabricacion: "); anioFabri = in.nextInt(); 
        System.out.print("Importe Basico: "); impBasico = in.nextDouble();
        System.out.print("Codigo (REY): "); codigoREY = in.nextLine(); in.nextLine(); 
        System.out.print("Tipo de Embarcacion: "); tipoEmb = in.nextLine();
        System.out.print("Nombre: "); nombre = in.nextLine();
        System.out.print("Eslora: "); eslora = in.nextDouble();
        System.out.print("Tonelaje: "); tonelaje = in.nextDouble();
        System.out.print("Valor declarado: "); valorDec = in.nextDouble();
        e = new Embarcacion(anioFabri,impBasico,pro,codigoREY,tipoEmb,nombre,eslora,tonelaje,valorDec);
        return e; 
    }
    private static Propietario leerPropietario(Scanner in){
        String nombre; String apellido; int CIT; 
        Propietario p = null; 
        
        System.out.println("Ingrese Propietario");
        System.out.print("Nombre: "); nombre = in.nextLine(); 
        System.out.print("Apellido: "); apellido = in.nextLine(); 
        System.out.print("CIT: "); CIT = in.nextInt(); 
        p = new Propietario(nombre,apellido,CIT); 
        return p; 
    }
    private static void InformarMontoAPagar(Vehiculo[] v){
        System.out.println("Los montos a pagar por Vehiculo"); 
        for (int i = 0; i < cant; i++){
            System.out.println(v[i].toString()); 
        }
    }
}
