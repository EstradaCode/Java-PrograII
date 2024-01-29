public class CompraMultiple extends Compra{
    private boolean cantEntradas[]= new boolean[20];
     public CompraMultiple(int numCompra, int categoria,String estadio,int fecha,double importe,int cantEntradas){
         super(numCompra,categoria,estadio,fecha,importe);
         this.setCantEntradas(cantEntradas);
     }
    public void setCantEntradas(int cantEntradas){
        for (int i=0; i< 20; i++){
             if (cantEntradas !=0){
                 this.cantEntradas[i] = true;
                 cantEntradas--;
             } else{
                 this.cantEntradas[i] = false;
             }
         }
    }
    public int  getcantEntradas(){
        int cant=0;
        for (int i=0; i<20; i++){
            if (this.cantEntradas.equals(true)){
                cant++;
            }
        }
        return cant;
    }
    public double promocion(){
        double descuento=0;
        if((this.getcantEntradas() <=6) && ((super.getEstadio() == "Internacional Khalifa") || (super.getEstadio() == "Education City"))){
            descuento= super.getImporte() * 7.5 /100;
        } else if ( ( this.getcantEntradas() >= 10) && ((super.getFecha() <= 20112022) && (super.getFecha() <= 02122022))){
           descuento = super.getImporte()/ this.getcantEntradas(); // valor individual de una entrada (gratis, el descuento es de una entrada); 
        }
        return descuento;
    }
    public String toString(){
        String aux;
        aux= super.toString() + "cantidad de Entradas" + this.getcantEntradas();
        return aux;
    }
}
