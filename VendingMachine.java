import java.util.Scanner;

public class VendingMachine {

    static void menu(){
        System.out.println("1. Afficher les produits :");
        System.out.println("2. Acheter un produit : ");
        System.out.println("3. Quitter :");
    }
    static void showProducts(String[] arr1, double[] arr2, int[] arr3){
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        System.out.println(arr3[0]);
        System.out.println("-- Available Products --");
        System.out.println("Product  |   Prix  | Stock");
        for (int i = 0; i < arr1.length; i++) {
        System.out.println(arr1[i] + "       " + arr2[i] + "      " + arr3[i]);

        }

    }




    public static void main(String[] args) {

        String[] products = {"Eau", "Soda", "Chips", "Chocolat"};
        double[] prix = {5.0, 8.0, 12.0, 15.0};
        int[] stock = {10, 5, 7, 3};
        System.out.println("     === Distributeur Automatique === ");
        menu();

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your choice : ");
        String choice = scanner.nextLine();

        do {

            switch (choice) {
                case "1" :
                    showProducts(products, prix, stock);
                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:
                    System.out.println("The choice doesn't exists, choose another");
            }

            menu();
            System.out.print("enter your choice : ");
             choice = scanner.nextLine();


        }while( choice.equals("1") || choice.equals("2"));








    }
}
