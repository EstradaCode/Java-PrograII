public class Responsable{
    private int dni;
    private String nombre;
    private String apellido;
    public Responsable(int undni, String unNombre, String unApellido){
        dni= undni;
        nombre= unNombre;
        apellido= unApellido;
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
    public void setDni( int undni){
        this.dni= undni;
    }
    public void setNombre(String unNombre){
        this.nombre= unNombre;
    }
    public void setApellido(String unApellido){
        this.apellido=unApellido;
    }
    @Override
    public String toString(){ 
     return ( "Nombre: " + getNombre() + "Apellido " + getApellido() + "DNI " + getDni()); 
    }
}