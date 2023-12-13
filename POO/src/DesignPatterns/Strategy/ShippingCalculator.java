package DesignPatterns.Strategy;

public class ShippingCalculator {
 private ShipingStrategy Strategy;

  public ShippingCalculator(ShipingStrategy Strategy) {
    this.Strategy = Strategy;
  }

  public double calculadora(Double peso){
    return Strategy.calcularCusto(peso);
  }


}
