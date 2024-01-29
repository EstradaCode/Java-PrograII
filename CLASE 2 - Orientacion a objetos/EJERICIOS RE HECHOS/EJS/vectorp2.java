import java.util.Scanner;
public class vectorp2{
    public static void main (String[]args){
        Persona[]people= new Persona[3]; Scanner in= new Scanner (System.in);
        String unNombre; int unDNI,unaEdad;
        for (int i=0; i<people.length; i++){
        Persona p= new Persona();
        System.out.println( "nombre: ");    
        p.setNombre(in.nextLine());
        System.out.println("DNI: ");
        p.setDNI(in.nextInt()); 
        System.out.println("EDAD: ");
        p.setEdad(in.nextInt());
        in.nextLine();
        people[i]= p;
        
    }
    for (int i=0; i<3; i++){
    System.out.println(people[i].toString());
    }
    System.out.println("cantidad de personas mayores a 65  son " + mayoresde65(people));
    System.out.println("persona con menor dni es ..." + (Personamenordni(people)).toString());
}
static int mayoresde65(Persona[] people){
     int cont = 0, valor=65;
     for (int i=0; i<people.length; i++){ 
     if( people[i].getEdad() > valor){
         cont++;
     }
    }
     return cont;
    }
static Persona Personamenordni(Persona[] people){
     Persona p = new Persona(); int menor = 9999999; 
     for (int i = 0; i < people.length; i++){
     if (people[i].getDNI() < menor){
        p= people[i];
        menor= p.getDNI();
     }
    }
    return p;
    }

    
    
}