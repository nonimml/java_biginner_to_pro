import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int PIN = 9516;
        int inputPin;
        float withDrawAmount = 0;
        float maxWithdrawAmount = 50_000;
        float minWithdrawAmount = 500;
        float bankAmount = 100_000;
        String Confirmation = "";
        int i = 0;

        System.out.println("==========Welcome==========");
        do{
            System.out.print("Enter the PIN: ");
            inputPin = input.nextInt();
            if(inputPin==PIN){
                while (true){
                  System.out.print("Enter the Withdraw Amount: ");
                  withDrawAmount = input.nextFloat();
                  if(withDrawAmount<maxWithdrawAmount) {
                      if (withDrawAmount > minWithdrawAmount) {
                          bankAmount -= withDrawAmount;
                          Confirmation = (bankAmount>0)?"Confirm":"transaction denied!";
                          break;
                      }else{System.out.println("The amount You enter is lower than the daily withdraw limit!");}
                  }else{System.out.println("The amount You enter is exceeding the daily withdraw limit!");}
                }break;
            }else{System.out.print("Password is incorrect try again!\n");}
        }while(++i<3);

        if(Confirmation.equalsIgnoreCase("Confirm")) {
            System.out.println("\n===========================");
            System.out.println("Balance          : " + withDrawAmount);
            System.out.println("Transaction      : " + Confirmation);
            System.out.println("Transaction ID   : 0123487654");
            System.out.println("Remaining Balance: " + bankAmount);
            System.out.println("==========Thank YOu========");
        }


    }
}
