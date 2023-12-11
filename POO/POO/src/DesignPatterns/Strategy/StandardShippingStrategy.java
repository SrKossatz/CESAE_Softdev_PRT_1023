package DesignPatterns.Strategy;

public class StandardShippingStrategy implements ShipingStrategy{

  @Override
  public double calcularCusto(Double peso) {
    return peso*5.0;
  }
}
