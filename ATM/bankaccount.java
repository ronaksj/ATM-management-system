import java.util.*;

public class bankaccount {
    static Scanner sc = new Scanner(System.in);
    static void register() {
        System.out.println("***************************");
        System.out.println("Enter your full name :");
        ATM.name = sc.nextLine();

        System.out.println("Enter username :");
        String user = sc.nextLine();

        System.out.println("Enter your password :");
        String pass = sc.nextLine();

        System.out.println("Enter your Account number :");
        ATM.account_number = sc.nextLine();
        
        System.out.println("REGISTRATION SUCCESSFULLY!");
        System.out.println("***************************");
        ATM.select_operation();

        while (true) {
            display(ATM.name);
            int choice = sc.nextInt();
            if (choice == 1) {
                login(user, pass);
                break;
            } 
            else {
                if (choice == 2) {
                    System.exit(0);
                } 
                else {
                    System.out.println("Bad value! Enter again!");
                }
            }
        }
    }

    static void display(String name) {}
    static void login(String user, String pass) {}
}
