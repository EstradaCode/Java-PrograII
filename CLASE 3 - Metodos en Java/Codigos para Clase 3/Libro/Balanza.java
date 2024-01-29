public class Balanza {
  private double total = 0;
  private int items = 0;

  public void iniciarCompra() {
    total = 0;
    items = 0;
  }

  public void registrarProducto(double pesoEnKg, double precioPorKg) {
    total += pesoEnKg * precioPorKg;
    items++;
  }

  public double devolverMontoAPagar() {
    return total;
  }

  public String devolverResumenDeCompra() {
    return String.format("Total a pagar %.2f por la compra de %d productos", total, items);
  }
}
