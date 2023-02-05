public class User_history {
    public static void transactionhistory() {
        System.out.println("---------------------");
        System.out.println("Transaction History :");
        int k = 0;
        if (ATM.balance > 0) {
            for (int i = 0; i < (ATM.history.size() / 2); i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.println(ATM.history.get(k) + " ");
                    k++;
                }
            }
            System.out.print("Total number of transactions = " + (k/2));
        } 
        else {
            System.out.println("your account is empty");
        }
        System.out.println();
        ATM.select_operation();
    }
}