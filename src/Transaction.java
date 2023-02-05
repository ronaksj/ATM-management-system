import java.util.*;

public class Transaction {
    static int num;
    static String s;
    static Scanner sc = new Scanner(System.in);

    public static void deposit() {
        Date current_Date = new Date();
        System.out.println("-------------------");
        System.out.print("Enter amount to deposit :");
        int deposit_cash = sc.nextInt();
        ATM.update_balance(deposit_cash);

        ATM.history.add("Rs." + Integer.toString(deposit_cash) + "/-");
        ATM.history.add("Deposit at " + current_Date);

        System.out.println("Amount Rs." + deposit_cash + "/- deposit successful!");
        System.out.println("---------------------------");
        ATM.select_operation();
    }

    public static void withdraw() {
        System.out.println("----------------");
        System.out.println("Enter amount for withdraw :");
        int w_cash = sc.nextInt();

        if (w_cash <= ATM.balance) {
            Date current_Date = new Date();
            ATM.balance = ATM.balance - w_cash;
            ATM.history.add("Rs." + Integer.toString(w_cash) + "/-");
            ATM.history.add("Withdraw at " + current_Date);

            System.out.println("Collect cash !! Amount Rs." + w_cash + "/-withdraw successfully");
            System.out.println("---------------------------");
        } 
        else {
            System.out.println("insufficient money!! you cannot withdraw money from your account!");
            System.out.println("---------------------------");
        }
        ATM.select_operation();
    }

    public static void transfer() {
        System.out.println("Enter the :");
        s = sc.nextLine();
        System.out.println("Enter the account number of payee");
        num = sc.nextInt();

        System.out.println("Enter the amount to be transferred to payee account:");
        int transfered_cash = sc.nextInt();

        if (transfered_cash <= ATM.balance) {
            Date current_Date = new Date();
            ATM.balance = ATM.balance - transfered_cash;

            ATM.history.add("Rs." + Integer.toString(transfered_cash) + "/-");
            ATM.history.add("transferred to account number " + num + " at " + current_Date);
            
            System.out.println("Amount Rs." + transfered_cash + "/- transferred successfully");
            System.out.println("---------------------------");
        } 
        else {
            System.out.println("insufficient balance to transfer the cash");
            System.out.println("---------------------------");
        }
    }
}