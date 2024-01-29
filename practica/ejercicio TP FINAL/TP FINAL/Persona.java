public class Persona {
    private String nombre;
    private String apellido;
    private int cuit;   
    public Persona (String nombre, String apellido, int cuit){
        this.nombre = nombre;
        this.cuit = cuit;
        this.apellido = apellido; 
    }
    
    public Persona(){
     
    }

    public int getCuit() {
        return cuit;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public void setApellido(String Apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String toString(){
        String aux;
        aux= " nombre: " + this.getNombre() + "apellido: " + this.getApellido() + "cuit: " + this.getCuit();
        return aux;
    }
    
    
    
}
