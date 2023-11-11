package FichaPratica06;


import java.util.Scanner;

public class Ex01 {

    /**
     * Método faz o barulho do animal
     * @param animal String
     */
    public static void fazerBarulho(String animal){

        animal=animal.toLowerCase();

        switch (animal){
            case "cão":
                System.out.print("Au au au");
                break;
            case "gato":
                System.out.print("miau miau");
                break;
            case "peixe":
                System.out.print("glub. glub");
                break;
            case "vaca":
                System.out.print("muuuuuu");
                break;
            case "porco":
                System.out.print("oinc, oinc");
            default:
                System.out.println("Escolha outro animal");
        }
    }

    public static void main(String[] args) {
        String animal;

        Scanner input= new Scanner(System.in);

        System.out.println("Qual o animal: ");
        animal=input.next();

        fazerBarulho(animal);
    }
}
