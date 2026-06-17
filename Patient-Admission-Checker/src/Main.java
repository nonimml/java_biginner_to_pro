import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //initialize the variable
        String name;
        int Age ;
        float bodyTemp;
        int bloodPre;
        String symptom;
        String[] doctorsInWards = {"Dr.Silva", "Dr.Perera", "Dr.Yapa"};

        System.out.print("Enter the name of the patient: ");
        name = input.nextLine();

        System.out.print("Enter patient's Age: ");
        Age = input.nextInt();

        System.out.print("Enter patient's body temperature:  ");
        bodyTemp = input.nextFloat();

        System.out.print("Enter patient's  blood pressure: ");
        bloodPre = input.nextInt();

        input.nextLine();
        System.out.print("Enter the symptom: ");
        symptom = input.nextLine();

        String priority = "Normal";  //default priority level
        String ward = "General";   //default ward

        if (bloodPre >= 180 || symptom.equalsIgnoreCase("chest pain")){
            priority = "Critical";
            ward = "Emergency";
        }
        else if (Age<=12 ) {
            if (bodyTemp > 39.5)
                priority = "High";
            ward = "Paediatric";
        }
        else if (Age>13 ){
            if(bodyTemp>39.5)
                priority = "High";
        }

        //Display Admission report
        System.out.println("\nAdmission Report:");
        System.out.println("\tPatient Name          : " + name);
        System.out.println("\tAge                   : " + Age);
        System.out.println("\tBody Temperature      : " + bodyTemp+"°C");
        System.out.println("\tBlood Pressure        : " + bloodPre+"mmHg");
        System.out.println("\tPrimary Symptom       : " + symptom);
        System.out.println("\tPriority Level        : " + priority);
        System.out.println("\tWard                  : " + ward);

        //switch case use to show the respective doctor assign to the ward
        switch (ward){
            case "Paediatric":
                System.out.println("\tdoctor in ward        : "+doctorsInWards[0]);//Dr.Silva
                break;
            case "Emergency":
                System.out.println("\tdoctor in ward        : "+doctorsInWards[1]);//Dr.perera
                break;
            default:
                System.out.println("\tdoctor in ward        : "+doctorsInWards[2]);//Dr.Yapa

        }
        input.close();

    }
}
