import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Shop shop= new Shop(new Person("John", "email"),"Lahore");
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("********Shop Management Menu*********");
            System.out.println("1. Add product");
            System.out.println("2. Sell product");
            System.out.println("3. Update product");
            System.out.println("4. Display all product");
            System.out.println("0. Exit");

            System.out.println("Enter your choice: ");

            int choice= sc.nextInt();
            switch (choice) {
                case 1:
                shop.addProduct();
                break;
                case 2:
                    shop.sale();
                    break;

                case 3:
                    shop.updateProduct();
                    break;

                case 4:
                shop.displayProduct();
                break;

                case 0:
                System.out.println("exiting...");
                   System.exit(0);
                   break;
                default:
                System.out.println("Invalid choice.Try again!");
            }
    
        }
    }
}