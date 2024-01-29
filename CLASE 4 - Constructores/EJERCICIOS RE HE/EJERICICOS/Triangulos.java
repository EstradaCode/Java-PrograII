public class Triangulos{
    private double lado1;
    private double lado2;
    private double lado3;
    private String color;
    private String colorLinea;
    public Triangulos(double lado1, double lado2, double lado3, String color, String colorLinea){
        this.lado1= lado1;
        this.lado2=lado2;
        this.lado3= lado3;
        this.color=color;
        this.colorLinea=colorLinea;
    }
    public Triangulos(){
        
    }
    public double getLado1(){
        return lado1;
    }
    public double getLado2(){
        return lado2;
    }
    public double getLado3(){
        return lado3;
    }
    public String getColor(){
        return color;
    }
    public String getColorLinea(){
        return colorLinea;
    }
    
    public void setLado1(double unlado){
        lado1= unlado;
    }
    public void setLado2(double unlado){
        lado2=unlado;
    }
    public void setLado3(double unlado){
        lado3=unlado;
    }
    public void setColor(String uncolor){
        color= uncolor;
    }
    public void setColorLinea(String uncolorLinea){
        colorLinea=uncolorLinea;
    }
    public double CalcularArea(){
        Double area;
        Double S = (lado1 + lado2 + lado3)/ 2;
        area = Math.sqrt(S*(S-lado1)*(S-lado2)*(S-lado3));
        return area;
    }
    public double CalcularPerimetro(){
        double perimetro = lado1+lado2+lado3;
        return perimetro;
    }
    public String toString(){
        String aux;
        aux= " lado 1" + this.getLado1() + "lado2" + this.getLado2() + " lado3 " + this.getLado3() + this.getColorLinea() + this.getColor();
        return aux;
    }
}