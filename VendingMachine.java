import java.util.Scanner;

public class VendingMachine {
    static void menu(){
        System.out.println("1. Afficher les produits ");
        System.out.println("2. Acheter un produit ");
        System.out.println("3. Quitter ");

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your choice : ");

    }
    public static void main(String[] args) {

        String[] products = {"Eau", "Soda", "Chips", "Chocolat"};
        double[] prix = {5.0, 8.0, 12.0, 15.0};
        int[] stock = {10, 5, 7, 3};
        System.out.println("     === Distributeur Automatique === ");




        menu();
    }
}
