public class Editor{
    private int dni;
    private String nombre;
    private String apellido;
    public Editor(int dni, String nombre, String apellido){
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
    }
    public void setDni(int dni){
        this.dni=dni;
    }
    public void setNombre( String nombre){
        this.nombre=nombre;
    }
    public void setApellido(String Apellido){
        this.apellido=apellido;
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
    public String toString(){
        String aux;
        aux= "dni " + this.getDni() + " nombre " + this.getNombre() + "Apellido " + this.getApellido();
        return aux;
    }
}