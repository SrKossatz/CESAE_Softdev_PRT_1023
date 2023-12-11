package DesignPatterns.Strategy;

public class OvernightShippingStrategy implements ShipingStrategy{
  @Override
  public double calcularCusto(Double peso) {
    return peso*15.0;
  }
}
