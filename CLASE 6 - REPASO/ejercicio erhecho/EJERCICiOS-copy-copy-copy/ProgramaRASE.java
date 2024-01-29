import java.util.Scanner;

public class ProgramaRASE {
  private static final int CANT_SOLICITUDES = 5;

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Solicitud[] solicitudes = new Solicitud[CANT_SOLICITUDES];

    for (int i = 0; i < CANT_SOLICITUDES; i++) {
      System.out.println("Ingresar solicitud Nro " + (i + 1));
      solicitudes[i] = leerSolicitud(in);
      System.out.println("");
    }

    System.out.println("====================");

    for (int i = 0; i < CANT_SOLICITUDES; i++) {
      System.out.println(solicitudes[i]);
      System.out.print("\n\n\n");
    }

    in.close();
  }

  private static Solicitud leerSolicitud(Scanner in) {
    System.out.print("Número de gestión: ");
    String nroGestion = in.nextLine();

    System.out.print("Fecha: ");
    String fecha = in.nextLine();

    System.out.println("Solicitante: ");
    Persona solicitante = leerPersona(in);

    System.out.print("Región: ");
    String region = in.nextLine();

    System.out.print("Integrantes del grupo familiar: ");
    int integrantes = in.nextInt();
    in.nextLine();

    System.out.print("Ingresos mensuales declarados: ");
    double ingresosMensuales = in.nextDouble();
    in.nextLine();

    System.out.print("Tipo de solicitud (GAS/LUZ): ");
    String tipo = in.nextLine();
    if (tipo.toUpperCase().equals("GAS")) {
      System.out.print("Número de medidor: ");
      int medidor = in.nextInt();
      in.nextLine();

      System.out.print("Tamaño del hogar (m2): ");
      int tamanioHogar = in.nextInt();
      in.nextLine();

      System.out.print("Cantidad de calefactores/estufas: ");
      int calefactores = in.nextInt();
      in.nextLine();

      return new SolicitudGas(fecha, nroGestion, solicitante, region, integrantes, ingresosMensuales, tamanioHogar,
          medidor, calefactores);
    } else if (tipo.toUpperCase().equals("LUZ")) {
      System.out.print("NIS: ");
      int nis = in.nextInt();
      in.nextLine();

      System.out.print("Cantidad de electrodomésticos: ");
      int electrodomesticos = in.nextInt();
      in.nextLine();

      return new SolicitudLuz(fecha, nroGestion, solicitante, region, integrantes, ingresosMensuales, electrodomesticos,
          nis);
    } else {
      System.out.println("Tipo inválido");
      return null;
    }
  }

  private static Persona leerPersona(Scanner in) {
    System.out.print("  Nombre: ");
    String nombre = in.nextLine();

    System.out.print("  Apellido: ");
    String apellido = in.nextLine();

    System.out.print("  CUIT (sin guiones): ");
    long cuit = in.nextLong();
    in.nextLine();

    return new Persona(cuit, apellido, nombre);
  }
}
