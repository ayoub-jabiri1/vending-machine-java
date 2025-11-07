import java.util.Scanner;

public class VendingMachine {
    static String[] products = {"Eau", "Soda", "Chips", "Chocolat"};
    static double[] prix = {5.0, 8.0, 12.0, 15.0};
    static int[] stock = {10, 5, 7, 3};

    static void menu(){
        System.out.println("1. Afficher les produits :");
        System.out.println("2. Acheter un produit : ");
        System.out.println("3. Quitter :");
    }
    static void showProducts(String[] arr1, double[] arr2, int[] arr3){
        System.out.println("-- Available Products --");
        System.out.println("Product  |   Prix  | Stock");
        for (int i = 0; i < arr1.length; i++) {
        System.out.println(arr1[i] + "       " + arr2[i] + "      " + arr3[i]);
        }

    }

    static void buyProduct(String[] products) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the product number : ");
        int prodNum = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter the inserted money : ");
        int insertNum = Integer.parseInt(scanner.nextLine());

        System.out.println("You have bought : " + products[prodNum - 1]);
    }

    public static void main(String[] args) {


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
                    buyProduct(products);
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
