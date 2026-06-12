import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String[] items = new String[5];
        double[] itemPrice = new double[5];
        int[] quantity = new int[5];
        double sub_total;
        double total = 0.0;
        double[] itemTotal=new double[5];
        double PERCENTAGE = 90;
        double VAT = 108;
        int loyaltyPoints;

        System.out.print("How many items do you want to buy: ");
        int itemCount = input.nextInt();
        if(itemCount<0){
            System.out.println("item count can't be zero or less");
        }
        else if(itemCount>5){
            System.out.println("you are only allow to buy 5 items max!");
        }
        else{
            for(int i=0;i<itemCount;i++){
                //item name
                System.out.print("Enter the item name: ");
                items[i] = input.next();
                //item pice
                System.out.print("Enter the item price: ");
                double price = input.nextDouble();
                if(price<=0) {
                    System.out.println("price can't be zero or less enter a valid price");
                    break;
                }
                else{
                    itemPrice[i] = price;
                }
                //item quantity
                System.out.print("Enter the item quantity(positive): ");
                int itemQuantity = input.nextInt();
                if(itemQuantity<=0){
                    System.out.println("Quantity can't be zero or less enter a positive value");
                    break;
                }
                else{
                    quantity[i] = itemQuantity;

                }
                itemTotal[i] = price*itemQuantity;
            }
            for(double prices:itemTotal){
                total += prices;
                }
                if(total>5000){
                    sub_total = (total*PERCENTAGE/100)*VAT/100;
                }
                else{
                    sub_total = total*VAT/100;
                }
            System.out.println();
            for(int j=0;j<itemCount;j++){
                System.out.printf("Item name: %s\t    Unit Price: %s\t     Quantity: %s\t    total price: %s%n",items[j],itemPrice[j],quantity[j],itemTotal[j]);
            }
            System.out.println();
            System.out.printf("Sub Total(with VAT): %.2f",sub_total);
            loyaltyPoints = (int)sub_total/100;
            System.out.printf("\nLoyalty Points: %d points",loyaltyPoints);
        input.close();


        }
    }
}
