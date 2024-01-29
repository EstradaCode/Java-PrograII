import java.util.Scanner;

public class ProgramaEditorial {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Ejemplar[] ejemplares = new Ejemplar[2];

    for (int i = 0; i < ejemplares.length; i++) {
      Libro l = new Libro();
      System.out.print("Ingresar codigo: ");
      l.setCodigo(in.nextInt());
      System.out.print("Ingresar cantPaginas: ");
      l.setCantPaginas(in.nextInt());
      System.out.print("Ingresar resumen: ");
      l.setResumen(in.nextLine());
      System.out.print("Ingresar cantCapitulos: ");
      l.setCantCapitulos(in.nextInt());
      System.out.print("Ingresar titulo: ");
      l.setTitulo(in.nextLine());
      System.out.print("Ingresar si es edicion de bolsillo: (true / false)");
      l.setEdicionBolsillo(in.nextBoolean());
      System.out.print("Ingresar ano publicacion? ( true / false )");
      if (in.nextBoolean()) {
        System.out.print("Ingresar ano publicacion: ");
        l.setAnoPublicacion(in.nextInt());
      }
    }

    in.close();
  }
}
