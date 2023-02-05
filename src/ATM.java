import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
    public static String name;
    public static int balance = 0;
    public static String account_number;
    public static ArrayList<String> history = new ArrayList<String>();
    static Scanner sc = new Scanner(System.in);

    public static void update_balance(int deposit_cash) {
        balance = balance + deposit_cash;
    }

    public static int display_balance() {
        return balance;
    }

    public static void homepage() {
        System.out.println("---------------------------------");
        System.out.println("Hello!! WELCOME TO MY ATM SYSTEM ");
        System.out.println("---------------------------------");
        System.out.println("select option :");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("3. Exit");
        System.out.println("Enter choice");
        int choice = sc.nextInt();
        if (choice == 1) {
            bankaccount.register();
        } 
        else if (choice == 2) {
            System.out.println("Enter your Account number :");
            int ac_no = sc.nextInt();

            if (ac_no == 102030) {
                System.out.println("Enter password :");
                String pass = sc.next();

                if (pass.equals("ronak123")) {
                    ATM.select_operation();
                } 
                else {
                    System.out.println("Password is wrong...! Please Enter Correct Password...");
                    System.exit(0);
                }
            } 
            else {
                System.out.println("Account number is wrong!! Please Enter Correct Accound Number...");
                System.exit(0);
            }
        } 
        else {
            if (choice == 3) {
                System.out.println("-------Collect your ATM Card\n Thank you for using ATM Machine!!-------");
                System.exit(0);
            } 
            else {
                System.out.println("select a value only from the given options :");
                homepage();
            }
        }
    }

    public static void select_operation() {
        System.out.println("WELCOME " + ATM.name + "! TO ATM SYSTEM");
        System.out.println("*********************");
        System.out.println("Select option : ");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Transfer");
        System.out.println("4. Check balance");
        System.out.println("5. Transaction History");
        System.out.println("6. Exit");
        System.out.println("**********************");
        
        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                Transaction.withdraw();
            case 2:
                Transaction.deposit();
            case 3:
                Transaction.transfer();
            case 4:
                check.checkbalance();
            case 5:
                User_history.transactionhistory();
            case 6:
                System.exit(0);
        }
    }

    public static void main(String[] args) {
        homepage();
        Transaction.withdraw();
        Transaction.deposit();
        Transaction.transfer();
        check.checkbalance();
        User_history.transactionhistory();
    }
}
