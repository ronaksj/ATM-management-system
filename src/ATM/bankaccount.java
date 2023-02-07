import java.util.*;

public class bankaccount {
    static Scanner sc = new Scanner(System.in);
    static void register() {
        System.out.println("***************************");
        System.out.println("Enter your full name :");
        ATM.name = sc.nextLine();

        System.out.println("Enter username :");
        sc.nextLine();

        System.out.println("Enter your password :");
        sc.nextLine();

        System.out.println("Enter your Account number :");
        ATM.account_number = sc.nextLine();
        
        System.out.println("REGISTRATION SUCCESSFULLY!");
        System.out.println("***************************");
        ATM.select_operation();
    }
}
