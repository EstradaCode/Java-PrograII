public class maintri{
    public static void main (String[] args){
        Triangulo triangle = new Triangulo(4.0, 4.0, 6.0, "amarillo", "rojo");
        System.out.println(triangle.toString());
        double a = 5.0, b = 8.0, c= 3.0; String colour= "Rosa", line = "fuxia";
        Triangulo triangle2= new Triangulo();
        triangle2.setladoA(a);
        triangle2.setladoB(b);
        triangle2.setladoC(c);
        triangle2.setcolorRelleno(colour);
        triangle2.setcolorLinea(line);
        System.out.println(triangle2.toString());
        
        
    }
}