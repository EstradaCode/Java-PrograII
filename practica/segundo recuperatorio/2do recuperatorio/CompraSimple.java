public class CompraSimple extends Compra {
    private int dni;
    private String nombre;
    private String apellido;
    private int numAsiento;
    public CompraSimple( int numCompra, int categoria,String estadio,int fecha,double importe, int dni, String nombre, String apellido, int numAsiento){
        super(numCompra,categoria,estadio,fecha,importe);
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.numAsiento=numAsiento;
    }
    public void setDni (int dni){
        this.dni=dni;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellido(String Apellido){
        this.apellido=apellido;
    }
    public void setNumAsiento(int numAsiento){
        this.numAsiento=numAsiento;
    }
    public int getDni(){
        return dni;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getNumAsiento(){
        return numAsiento;
    }
    public double promocion(){
        double descuento=0;
        if(super.getEstadio().equals("Lusail") & (super.getCategoria()== 4)){
            descuento= super.getImporte() * 10 /100;
        }
        return descuento;
    }
    public String toString(){
        String aux;
        aux= super.toString() + "dni: " + this.getDni() + "apellido" + this.getApellido() + "num de asiento" + this.getNumAsiento();
        return aux;
    }
}