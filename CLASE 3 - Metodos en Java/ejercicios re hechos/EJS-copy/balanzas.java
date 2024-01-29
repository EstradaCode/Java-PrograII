public class balanzas{
    private double monto;
    private int items;    
public void iniciarCompra(){ 
    monto = 0;
    items = 0;
}
public void registrarProducto(double pesoEnKg,double precioPorKg){
    monto+= pesoEnKg*precioPorKg;
    items++;
}
public double devolverMontoAPagar(){
    return monto;    
}
public String devolverResumenDeCompra(){
    String aux;
    aux= "Total a Pagar: " + monto + "/n" + "por la compra de " + items + "productos";
    return aux;
}
}