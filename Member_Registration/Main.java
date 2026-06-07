//import the libraries
import java.util.Scanner;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // initialize the variables
        int Age;
        String Name;
        String contact;
        String email;
        String membershipType;
        int Id = 0;
        int year = LocalDate.now().getYear();


        // get inputs from the user
        System.out.print("What is your name: ");
        Name = scanner.nextLine();

        System.out.print("What is your Age: ");
        Age = scanner.nextInt();

        //check the Age is in the valid range
        if(Age>=5 && Age<=100){
            System.out.print("Enter your contact No.(10 digit): ");
            contact = scanner.next();

            System.out.print("Enter your email: ");
            email = scanner.next();

            System.out.print("What do you prefer to register(Premium/Standard): ");
            membershipType = scanner.next();

            Id++;
            String memberId = String.format("%03d",Id); // %d - (datatype) in here it's (Int) ,%03 - padding = 0 with 3 digits
            LocalDate registerDate = LocalDate.now(); // get the current date
            LocalDate expiryDate = registerDate.plusYears(1); // increment the year by 1


            // Display the membership details
            System.out.printf("\nMember Id:       LIB%d%s\n",year,memberId);
            System.out.printf("Name:            %s\n",Name);
            System.out.printf("Age:             %d\n" ,Age);
            System.out.printf("contact:         %s\n",contact);
            System.out.printf("email:           %s\n",email);
            System.out.printf("membership Type: %s\n",membershipType);
            System.out.printf("register Date:   %s\n",registerDate);
            System.out.printf("expiry Date:     %s\n", expiryDate);


        }else{
            System.out.printf("%d is a invalid Age try Agin!",Age); // if the Age is not in the valid range the program shows an error
        }

        scanner.close(); //close the Scanner to end getting any input
    }
}
