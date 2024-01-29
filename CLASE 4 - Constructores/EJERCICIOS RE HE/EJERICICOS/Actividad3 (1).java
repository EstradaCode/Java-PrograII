import java.util.Scanner;

public class Actividad3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Flota flota = new Flota();

    while (true) {
      clearConsole();
      System.out.println("===== Viajes \"Pepe mujica\" =====");
      System.out.println("");
      System.out.println("[1] Ver micros");
      System.out.println("[2] Agregar nuevo micro");
      System.out.println("[3] Buscar micro");
      System.out.println("[0] Salir");
      System.out.println("");
      System.out.print(">>>>> ");

      int accion = in.nextInt();
      in.nextLine();
      System.out.println("");

      if (accion == 0) {
        break;
      } else if (accion == 1) {
        if (flota.getCantidadDeMicros() == 0) {
          System.out.println("No hay micros");
        } else {
          System.out.println("Mostrando " + flota.getCantidadDeMicros() + " micros...");
          for (int i = 0; i < flota.getCantidadDeMicros(); i++) {
            System.out.println(flota.getMicros()[i]);
          }
        }
      } else if (accion == 2) {
        System.out.print("Patente: ");
        String patente = in.nextLine();

        if (patente.length() == 0) {
          System.out.println("La patente debe tener al menos un caracter");
        } else if (flota.getMicro(patente) != null) {
          System.out.println("Ya existe un micro con esa patente");
        } else {
          System.out.print("Destino: ");
          String destino = in.nextLine();

          System.out.print("Hora de salida: ");
          String hora = in.nextLine();

          flota.insertarMicro(new Micro(patente, destino, hora));
          System.out.println("Micro agregado con éxito");
        }
      } else if (accion == 3) {
        clearConsole();
        System.out.println("===== Viajes \"Pepe mujica\" =====");
        System.out.println("Buscar micro");
        System.out.println("");
        System.out.println("[1] Buscar por patente");
        System.out.println("[2] Buscar por destino");
        System.out.println("[0] Volver");

        Micro micro = null;

        while (true) {
          System.out.println("");
          System.out.print(">>>>> ");

          accion = in.nextInt();
          in.nextLine();
          System.out.println("");

          if (accion < 0 || accion > 2) {
            System.out.println("Opción \"" + accion + "\" inválida");
            continue;
          }

          if (accion == 1) {
            System.out.print("Patente: ");
            String patente = in.nextLine();

            micro = flota.getMicro(patente);
          } else if (accion == 2) {
            System.out.print("Destino: ");
            String destino = in.nextLine();

            micro = flota.getMicroPorDestino(destino);
          }

          break;

        }

        if (accion == 0)
          continue;

        if (micro == null) {
          System.out.println("No se encontró ningún micro con esa condicion.");
        } else {
          while (true) {
            clearConsole();
            System.out.println(micro);
            System.out.println("");
            System.out.println("[1] Eliminar micro");
            System.out.println("[2] Ver asientos");
            System.out.println("[3] Agregar pasajero");
            System.out.println("[4] Eliminar pasajero");
            System.out.println("[0] Volver");
            System.out.println("");
            System.out.print(">>>>> ");

            accion = in.nextInt();
            in.nextLine();
            System.out.println("");

            if (accion == 0) {
              break;
            } else if (accion == 1) {
              flota.eliminarMicro(micro.getPatente());
              System.out.println("Micro eliminado con éxito");
            } else if (accion == 2) {
              int rows = (int) Math.ceil(Micro.capacidad / 10.0);
              for (int i = 0; i < rows; i++) {
                System.out.print(i + "0 ");
                for (int j = 0; j < 10; j++) {
                  int index = i * 10 + j;
                  if (index >= Micro.capacidad)
                    break;

                  if (j == 5)
                    System.out.print(" ");

                  if (micro.getAsientos()[index]) {
                    System.out.print("X");
                  } else {
                    System.out.print("_");
                  }
                }
                System.out.println("");
              }
            } else if (accion == 3) {
              System.out.print("Número de asiento: ");
              int asiento = in.nextInt();
              in.nextLine();

              if (micro.getAsiento(asiento)) {
                System.out.println("El asiento ya está ocupado");
              } else {
                micro.setAsiento(asiento, true);
                System.out.println("Asiento asignado con éxito");
              }
            } else if (accion == 4) {
              System.out.print("Número de asiento: ");
              int asiento = in.nextInt();
              in.nextLine();

              if (micro.getAsiento(asiento)) {
                micro.setAsiento(asiento, false);
                System.out.println("Pasajero eliminado con éxito");
              } else {
                System.out.println("No hay ningún pasajero en ese asiento");
              }
            } else {
              System.out.println("Opción \"" + accion + "\" inválida");
            }

            System.out.println("");
            System.out.println("");
            System.out.print("Presione ENTER para continuar...");
            in.nextLine();
          }
          continue;
        }
      } else {
        System.out.println("Opción \"" + accion + "\" inválida");
      }

      System.out.println("");
      System.out.println("");
      System.out.print("Presione ENTER para continuar...");
      in.nextLine();
    }

    in.close();
  }

  private static void clearConsole() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
}
