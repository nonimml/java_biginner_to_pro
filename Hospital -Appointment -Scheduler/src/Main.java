import java.util.Scanner;

public class Main {
    static String[][] Appointments = new String[3][5];
    static int doctorID;
    static int slotNumber;
    static String patientName;
    static int contact = 0;

    public static void main(String[] args){
        boolean loop = true;
        System.out.println("Welcome to the Lanka Hospital");
        Scanner input = new Scanner(System.in);
        while (loop) {
            System.out.println("======== menu =============");
            System.out.println("type a : Book an appointment");
            System.out.println("type b : cancel an appointment");
            System.out.println("type c : Search an appointment");
            System.out.println("type d : display an appointment");
            System.out.println("type esc : exite() the system");
            System.out.println("==============================");
            System.out.print("Enter choice: ");
            String choice = input.next();
            switch (choice){
                case "a":
                    while (true) {
                        System.out.print("Doctor ID: ");
                        doctorID = input.nextInt();
                        if (doctorID >= 1 && doctorID <= 3) break;
                        else {
                            System.out.println("Error: doctor id out of range");

                        }
                    }
                    while (true) {
                        System.out.print("Slot Number: ");
                        slotNumber = input.nextInt();
                        if (slotNumber >= 1 && slotNumber <= 5)
                            if (!Book(doctorID - 1, slotNumber - 1, null,false)) {
                                System.out.println("The slot is already booked");
                            } else break;
                        else {
                            System.out.println("Error: slot number out of range");
                        }
                    }

                    System.out.print("Enter patient Name:");
                    patientName = input.next();


                    try {
                        System.out.print("patient Contact: ");
                        contact = input.nextInt(10);
                    } catch (Exception inputMismatchException) {
                        System.out.println("Enter a valid contact");

                    }
                    while (true) {
                        System.out.print("Do you want to Book an Appointment: ");
                        String book = input.next();
                        if (book.equalsIgnoreCase("Y")) {
                            Book(doctorID - 1, slotNumber - 1,patientName,true);
                            System.out.println("Booked Successfully!");
                            break;
                        } else if (book.equalsIgnoreCase("N")) {
                            System.out.println("Booking canceled !");
                            break;
                        } else {
                            System.out.println("Type yes or No");
                        }

                    }
                    break;

                case "b":
                    int CanceldoctorID;
                    int CancelslotNum;
                    String cancel;
                    while (true) {
                        System.out.print("enter the doctors appointment ID(1-3): ");
                        CanceldoctorID = input.nextInt();
                        if (CanceldoctorID >= 1 && CanceldoctorID <= 3) break;
                        else {
                            System.out.println("Error: doctor id out of range");

                        }
                    }

                    while (true) {
                        System.out.print("enter the doctors appointment ID(1-5): ");
                        CancelslotNum = input.nextInt();
                        if (CancelslotNum >= 1 && CancelslotNum <= 5)
                            break;
                        else {
                            System.out.println("Error: slot number out of range");
                        }
                    }

                    System.out.print("Do you want to cancel the Appointment(y/n): ");
                    cancel = input.next();

                    if(cancel.equalsIgnoreCase("Y")){
                        Cancel(CanceldoctorID-1,CancelslotNum-1);
                        System.out.println("Appointment canceled successfully");
                    }
                    else {
                        System.out.println("Appointment not Canceled");
                    }
                    break;

                case "c":
                    System.out.print("Enter the patient Name: ");
                    String name = input.next();
                    System.out.printf("patient %s Appointed slot is: %s\n",name,Search(name));
                    break;

                case "d":
                    Display();
                    break;

                case "esc":
                    loop  = false;
                    break;

                default:
                    System.out.println("Enter a valid choice (a,b,c,d)");
                    break;

            }

        }

    }

    static boolean Book(int doctorID, int slotNumber,String patientName,boolean bookAppointment){

        try {
            if (Appointments[doctorID][slotNumber] == null){
                Appointments[doctorID][slotNumber] = (bookAppointment) ? patientName: null;
                return true;
            }
            else {
                return false;
            }
        }catch (Exception e){
            System.out.println("The value is out of range");
            return false;
        }
    }
    static void Cancel(int canceldoctorID, int cancelslotNum){
        Appointments[canceldoctorID][cancelslotNum] = null;
    }

    static int Search(String patientName){
        for(int i= 0;i<Appointments.length;i++) {
            for (int j = 0; j < Appointments[i].length; j++) {
                if (Appointments[i][j] != null && Appointments[i][j].equalsIgnoreCase(patientName)) {
                    return j;

                }
            }
        }
        return -1;
    }

    static void Display(){
        for (int i = 0; i < Appointments.length; i++) {
            System.out.println("Doctor " + (i + 1) + ":");
            for (int j = 0; j < Appointments[i].length; j++) {
                String patient = (Appointments[i][j] == null) ? "Empty" : Appointments[i][j];
                System.out.println("  Slot " + (j + 1) + ": " + patient);
            }

        }
    }
}
