import java.util.Scanner;
public class Ej1C2{
     public static String menorDni (Persona[] Personas){
      int i, pos=0, min = 9999;
      for (i=0; i<=4;i++){
          if (Personas[i].getEdad() < min){
             min = Personas[i].getEdad();
             pos = i;
          }
      }
    return Personas[pos].toString();
}
 public static int mayoresDe65(Persona[] Personas){
    int i, contador=0;
    for (i=0; i<=4; i++){
     if (Personas[i].getEdad()>65 ){
       contador++;
     }
    }
    return contador;
 }
    public static void main (String[] args){
     Persona[] Personas = new Persona[5]; int i; Persona miPersona;
     Scanner in= new Scanner(System.in); String menor;

     for (i=0; i<=4; i++){
     System.out.println("Escriba nombre");
     String miNombre = in.next();
     System.out.println("Escriba Edad");
     int miEdad = in.nextInt();
     System.out.println("Escriba Dni");
     int miDni = in.nextInt();
     miPersona = new Persona(miNombre,miDni,miEdad);
     Personas[i] = miPersona; 
    }
    for (i=0; i<=4; i++){
     System.out.println("datos:");
     System.out.println(Personas[i].toString());
    }   
    System.out.println("cantidad de personas mayores de 65:  " + mayoresDe65(Personas));
    menor= menorDni (Personas);
    System.out.println("Persona mas joven:  " + menor);
    in.close();
}      
 }
