package DesignPatterns.Strategy;

public class ExpressShippingStrategy implements ShipingStrategy{
  @Override
  public double calcularCusto(Double peso) {
    return peso*10.0;
  }
}
