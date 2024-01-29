import java.util.Scanner; 
public class Principal {
    public static void main (String[] args){
        Balanza b = new Balanza(); 
        double cant = 0; double precio = 0; 
        Scanner in = new Scanner (System.in); 
        b.iniciarCompra(); 
        System.out.print("Ingrese el peso del producto en kg: "); 
        cant = in.nextDouble(); b.setCantidad(cant); 
        while (cant != 0) {
            System.out.print("Ingrese el precio por kg: "); 
            precio = in.nextDouble(); b.setPrecio(precio);
            b.registrarProducto(); 
            System.out.println("Monto de la compra actual "+b.devolvermontoaPagar()+"$"); 
            b.iniciarCompra(); 
            System.out.print("Ingrese el peso del producto en kg: "); 
            cant = in.nextDouble(); b.setCantidad(cant);          
        } 
        System.out.println("Resumen de la Compra"); 
        System.out.println(b.toString());
    }
}
