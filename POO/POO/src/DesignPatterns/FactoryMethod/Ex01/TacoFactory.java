package DesignPatterns.FactoryMethod.Ex01;


public class TacoFactory {
        public static Taco criarTaco(String tipo) {

            switch (tipo.toLowerCase()) {
                case "carne":
                    return new TacoCarne();
                case "frango":
                    return new TacoFrango();
                case "vegetariano":
                    return new TacoVegetariano();
                default:
                    throw new IllegalArgumentException("Tipo de taco inválido: " + tipo);
            }
        }
    }

