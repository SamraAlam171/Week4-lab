import java.util.Scanner;

public class Shop {


    private Product productList[]= new Product[500];
    private Person owner;
    private String address;
    private static int productCount=0;

    private static double revenue;

    public Shop(Person owner, String address) {
        this.owner = owner;
        this.address = address;
        //this.productList = new Product[100];
    }



    public void addProduct(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Product details");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Price: ");
        double price = input.nextDouble();
        System.out.print("Quantity: ");
        int quantity = input.nextInt();
        Product product = new Product(name, price, quantity);
        productList[productCount++]=product;
        System.out.println("Product added successfully!!");


    }

    public void sale(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product ID: ");
        String id= scanner.nextLine();

        for(int i=0; i<productCount; i++){

            if(productList[i].getId().equals(id)){
                if(productList[i].getQuantity() > 0){
                    productList[i].setQuantity(productList[i].getQuantity()-1);
                    revenue += productList[i].getPrice();
                    System.out.println("Sale successful!! Remaining quantity: " + productList[i].getQuantity());
                }
                else{
                    System.out.println("Product not found");
                }
                    return;
                }
        }
        System.out.println("Product not found!");
    }

    public void updateProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product ID to update: ");
        String id = scanner.nextLine();

        for(int i = 0; i < productCount; i++){
            if(productList[i].getId().equals(id)){
                System.out.println("Enter new name:");
                String name = scanner.nextLine();
                System.out.print("Enter new price: ");
                double price = scanner.nextDouble();
                System.out.println("Enter new quantity: ");
                int quantity = scanner.nextInt();
                productList[i].setName(name);
                productList[i].setPrice(price);
                productList[i].setQuantity(quantity);
                System.out.println("Product updated successfully!");
                return;
            }
        }
        System.out.println("Product not found!!");
    }
    
    public void displayProduct(){
        System.out.println("Product List: ");
        for(int i = 0; i < productCount; i++){
            System.out.println(productList[i]);
        }
    }
}