import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //
        double nightRate = 1.5;
        int minHour = 1;
        int hourRateForBike = 30;
        int hourRateForCar = 80;
        int hourRateForVan = 150;
        int hourRateForLorry = 250;
        int vehicleType;
        int entryHour;
        int exitHour;
        String vehicleNumber;
        double totalFee;
        int duration;
        boolean nightFlag;
        //
        System.out.print("Enter The Vehicle Type Bike/Car/Van/Lorry(1-4): ");
        vehicleType = input.nextInt();
        System.out.print("Entry Hour 24 format (0-23): ");
        entryHour = input.nextInt();
        System.out.print("Exite Hour 24 format (0-23): ");
        exitHour = input.nextInt();
        input.nextLine();
        System.out.print("Enter Vehicle Number: ");
        vehicleNumber = input.nextLine();

        switch (vehicleType){

            case 1:
                if(exitHour < entryHour){
                    duration = (exitHour + 24) - entryHour;
                    nightFlag = true;
                } else {
                    nightFlag = entryHour >= 22;
                    duration = exitHour - entryHour;
                    duration = Math.max(minHour, duration);
                }
                if(nightFlag){
                      totalFee = duration*hourRateForBike*nightRate;
                }else{
                    totalFee = duration*hourRateForBike;
                }

                System.out.println("\nSmartPark City Parking Receipt");
                System.out.println("-------------------------------");
                System.out.printf("Vehicle Number: %s\n",vehicleNumber);
                System.out.println("Vehicle Type: Bike");
                System.out.printf("Entry Hour: %s\n",entryHour);
                System.out.printf("Exit Hour: %s\n",exitHour);
                System.out.printf("Duration: %s Hour\n",duration);
                System.out.printf("Rate Per Hour: %s LKR\n",hourRateForBike);
                System.out.printf("Total Fee: %s LKR \n",totalFee);
                if(nightFlag){System.out.println("Label: NIGHT RATE");}
                System.out.println("-------------------------------");
                break;

            case 2:
                if(exitHour < entryHour){
                    duration = (exitHour + 24) - entryHour;
                    nightFlag = true;
                } else {
                    nightFlag = entryHour >= 22;
                    duration = exitHour - entryHour;
                    duration = Math.max(minHour, duration);
                }
                if(nightFlag){
                    totalFee = duration*hourRateForCar*nightRate;
                }else{
                    totalFee = duration*hourRateForCar;
                }

                System.out.println("\nSmartPark City Parking Receipt");
                System.out.println("-------------------------------");
                System.out.printf("Vehicle Number: %s\n",vehicleNumber);
                System.out.println("Vehicle Type: Car");
                System.out.printf("Entry Hour: %s\n",entryHour);
                System.out.printf("Exit Hour: %s\n",exitHour);
                System.out.printf("Duration: %s Hour\n",duration);
                System.out.printf("Rate Per Hour: %s LKR\n",hourRateForCar);
                System.out.printf("Total Fee: %s LKR\n",totalFee);
                if(nightFlag){System.out.println("Label: NIGHT RATE");}
                System.out.println("-------------------------------");
                break;

            case 3:
                if(exitHour < entryHour){
                    duration = (exitHour + 24) - entryHour;
                    nightFlag = true;
                } else {
                    nightFlag = entryHour >= 22;
                    duration = exitHour - entryHour;
                    duration = Math.max(minHour, duration);
                }
                if(nightFlag){
                    totalFee = duration*hourRateForVan*nightRate;
                }else{
                    totalFee = duration*hourRateForVan;
                }

                System.out.println("\nSmartPark City Parking Receipt");
                System.out.println("-------------------------------");
                System.out.printf("Vehicle Number: %s\n",vehicleNumber);
                System.out.println("Vehicle Type: Van");
                System.out.printf("Entry Hour: %s\n",entryHour);
                System.out.printf("Exit Hour: %s\n",exitHour);
                System.out.printf("Duration: %s Hour\n",duration);
                System.out.printf("Rate Per Hour: %s LKR\n",hourRateForVan);
                System.out.printf("Total Fee: %s LKR\n",totalFee);
                if(nightFlag){System.out.println("Label: NIGHT RATE");}
                System.out.println("-------------------------------");
                break;

            case 4:
                if(exitHour < entryHour){
                    duration = (exitHour + 24) - entryHour;
                    nightFlag = true;
                } else {
                    nightFlag = entryHour >= 22;
                    duration = exitHour - entryHour;
                    duration = Math.max(minHour, duration);
                }
                if(nightFlag){
                    totalFee = duration*hourRateForLorry*nightRate;
                }else{
                    totalFee = duration*hourRateForLorry;
                }

                System.out.println("\nSmartPark City Parking Receipt");
                System.out.println("-------------------------------");
                System.out.printf("Vehicle Number: %s\n",vehicleNumber);
                System.out.println("Vehicle Type: Lorry");
                System.out.printf("Entry Hour: %s\n",entryHour);
                System.out.printf("Exit Hour: %s\n",exitHour);
                System.out.printf("Duration: %s Hour\n",duration);
                System.out.printf("Rate Per Hour: %s LKR\n",hourRateForLorry);
                System.out.printf("Total Fee: %s LKR\n",totalFee);
                if(nightFlag){System.out.println("Label: NIGHT RATE");}
                System.out.println("-------------------------------");
                break;

            default:
                System.out.println("Invalid Type: Enter The Correct Vehicle Type_Bike/Car/Van/Lorry(1-4)");

        }
    }
}
